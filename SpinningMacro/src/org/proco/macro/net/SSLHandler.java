package org.proco.macro.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JTextArea;

import org.proco.macro.net.exception.InvalidAccountInfoException;
import org.proco.macro.net.exception.NeedUpdateProgramException;

public class SSLHandler {

	/** socket to tls connect */
	private static SSLSocket socket;

	/** session id to keep connection */
	private static String sessionID;

	/**
	 * 
	 * @param id
	 * @param pw
	 * @param date
	 * @param lessonTime
	 * @param lessonName
	 * @param lessonTime
	 * @param lessonName
	 * @param logField
	 * @throws IOException
	 * @throws UnknownHostException
	 * @throws InvalidAccountInfoException
	 * @throws NeedUpdateProgramException
	 */
	public static int doAction(String id, String pw, String date, String lessonName, String lessonTime, JTextArea logField)
			throws UnknownHostException, IOException, InvalidAccountInfoException, NeedUpdateProgramException {

		socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("resortgymmt.flexgym.biz", 443);

		tryLogin(id, pw, logField);

		LessonInfo lessions = findLesson(logField, date, lessonName, lessonTime);

		tryReservation(logField, lessions, date);

		socket.close();

		return 0;
	}

	/**
	 * 
	 * @param logField
	 * @param lessions
	 * @param date
	 * @throws IOException
	 * @throws NeedUpdateProgramException
	 */
	private static void tryReservation(JTextArea logField, LessonInfo lessions, String date) throws IOException, NeedUpdateProgramException {
		writeReservationPacket(lessions, date);
		String result = getResponseString();
		System.out.println(result);
		if (result.contains("해당 수강예약은 예약이 되어 있거나 정원초과로 예약이 불가합니다.")) {
			logField.append("정원 초과. 예약 실패. 미안합니다. 사랑합니다.");
		} else if (result.contains("수강예약이 완료되었습니다.")) {
			logField.append("예약 성공!");
		} else {
			throw new NeedUpdateProgramException();
		}
	}

	/**
	 * 
	 * @param lessions
	 * @param date
	 * @throws IOException
	 */
	private static void writeReservationPacket(LessonInfo lessions, String date) throws IOException {
		String lastForm = createReservationLastFormData(lessions);
		String formData = String.format(SSLPacketDetail.RESERVATION_FORM_DATA_FORMAT, date, lessions.getTargetLessionID(), date, lastForm);
		PrintStream out = new PrintStream(socket.getOutputStream());

		for (String packet : SSLPacketDetail.RESERVATION_PACKETS) {
			if (packet.contains("Cookie")) {
				out.println(String.format(packet, sessionID));
			} else if (packet.contains("Content-Length")) {
				out.println(String.format(packet, formData.length()));
			} else {
				out.println(packet);
			}
		}

		out.println();
		out.println(formData);
		out.println();
	}

	/**
	 * 
	 * @param lessions
	 * @return
	 */
	private static String createReservationLastFormData(LessonInfo lessions) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < lessions.getLessionCount(); i++) {
			builder.append(lessions.getLessionsIdAt(i).replace("|", "%7C"));
			builder.append("&");
		}

		builder.append(lessions.getLessionsIdAt(lessions.getTargetLessonIndex()).replace("|", "%7C"));

		return builder.toString();
	}

	/**
	 * 
	 * @param logField
	 * @param date
	 * @param lessonTime
	 * @param lessonName
	 * @return
	 * @throws IOException
	 * @throws NeedUpdateProgramException
	 */
	private static LessonInfo findLesson(JTextArea logField, String date, String lessonName, String lessonTime) throws IOException, NeedUpdateProgramException {
		logField.append(lessonName + " 레슨 등록 대기\r\n");

		while (true) {
			writeFindLessionPacket(date);
			String result = getResponseString();
			LessonInfo info = LessionFinder.findSpinningLession(result, lessonName, lessonTime);

			if (info.getTargetLessionID() != null) {
				logField.append(lessonName + " 레슨 탐색 완료\r\n");
				logField.append(" - 레슨 ID : " + info.getTargetLessionID() + "\r\n");
				logField.append(" - 레슨 Index : " + info.getTargetLessonIndex() + "\r\n");
				return info;
			}
		}
	}

	/**
	 * 
	 * @param date
	 * @throws IOException
	 */
	private static void writeFindLessionPacket(String date) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());
		String formData = String.format(SSLPacketDetail.LISTUP_FORM_DATA_FORMAT, date, date);

		for (String packet : SSLPacketDetail.LISTUP_PACKETS) {
			if (packet.contains("Content-Length")) {
				out.println(String.format(packet, formData.length()));
			} else if (packet.contains("Cookie")) {
				out.println(String.format(packet, sessionID));
			} else {
				out.println(packet);
			}
		}

		out.println();
		out.println(formData);
	}

	/**
	 * 
	 * @param id
	 * @param pw
	 * @param logField
	 * @return
	 * @throws UnknownHostException
	 * @throws IOException
	 * @throws InvalidAccountInfoException
	 */
	private static void tryLogin(String id, String pw, JTextArea logField) throws UnknownHostException, IOException, InvalidAccountInfoException {
		logField.append("로그인 시도... ");

		writeLoginPacket(id, pw);
		String result = getResponseString();

		if (result.contains("alert")) {
			throw new InvalidAccountInfoException();
		}

		logField.append("성공\r\n세션ID : " + sessionID + "\r\n");
	}

	/**
	 * 
	 * @param id
	 * @param pw
	 * @throws IOException
	 */
	private static void writeLoginPacket(String id, String pw) throws IOException {
		String idFormData = String.format(SSLPacketDetail.LOGIN_FORM_DATA_FORMAT, id, pw);

		PrintStream out = new PrintStream(socket.getOutputStream());

		for (String packet : SSLPacketDetail.LOGIN_PACKETS) {
			if (packet.contains("Content-Length")) {
				out.print(String.format(packet, idFormData.length() - 2));
			} else {
				out.print(packet);
			}
		}

		out.print(idFormData);
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	private static String getResponseString() throws IOException {
		StringBuilder builder = new StringBuilder();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		String line = null;
		while ((line = in.readLine()) != null) {
			builder.append(line);
			builder.append("\r\n");

			if ((line.length() == 1) && (line.charAt(0) == '0')) {
				break;
			}

			if (line.contains("PHPSESSID")) {
				sessionID = line.replace("Set-Cookie: ", "").replace("; path=/", "");
			}
		}

		return builder.toString();
	}
}
