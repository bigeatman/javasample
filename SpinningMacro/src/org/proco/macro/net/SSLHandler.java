package org.proco.macro.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.JTextArea;

import org.proco.macro.net.exception.InvalidAccountInfoException;
import org.proco.macro.net.exception.NeedUpdateProgramException;

public class SSLHandler {

	/** ddos cookie str to keep conection */
	private static String ddosStr;

	/** session id to keep connection */
	private static String sessionID;

	private static String cookieStr;

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
	 * @throws InterruptedException
	 */
	public static int doAction(String id, String pw, String date, String lessonName, String lessonTime, JTextArea logField)
			throws UnknownHostException, IOException, InvalidAccountInfoException, NeedUpdateProgramException, InterruptedException {

		tryConnection(logField);

		tryLogin(logField, id, pw);

		while (true) {
			LessonInfo info = getLessions(logField, date, lessonName, lessonTime);

			if (info.getTargetLessionID() != null) {
				printFindedLesson(logField, info);
				tryReservation(logField, info, date);
				break;
			}

			Thread.sleep(100);
		}

		return 0;
	}

	/**
	 * 
	 * @param logField
	 * @param info
	 * @param date
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	private static void tryReservation(JTextArea logField, LessonInfo info, String date) throws UnknownHostException, IOException {
		SSLSocket socket = createSocket();

		long now = System.currentTimeMillis() / 1000;

		String formData = createReservationFormData(info, date);
		Object[] params = new Object[] { formData.length(), ddosStr, now, sessionID, cookieStr, now, now, formData };
		writePacket(socket, SSLPacketDetail.RESERVATION_PACEKT, SSLPacketDetail.RESERVATION_PACKET_PARAMS_COUNT, params);

		String result = readPacket(socket);

		if (result.contains("수강예약이 완료되었습니다.")) {
			appendLog(logField, "# 예약 성공!");
		} else {
			appendLog(logField, "# 예약에 실패하였습니다.");
		}
	}

	/**
	 * 
	 * @param info
	 * @param date
	 * @return
	 */
	private static String createReservationFormData(LessonInfo info, String date) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < info.getLessionCount(); i++) {
			builder.append(info.getLessionsIdAt(i).replace("|", "%7C"));
			builder.append("&");
		}

		builder.append(info.getLessionsIdAt(info.getTargetLessonIndex()).replace("|", "%7C"));

		return String.format(SSLPacketDetail.RESERVATION_FORM_DATA, date, info.getTargetLessionID(), date, builder.toString());
	}

	/**
	 * 
	 * @param logField
	 * @param lessonTime
	 * @param lessonName
	 * @param lessonTime2
	 * @return
	 * @throws IOException
	 * @throws UnknownHostException
	 * @throws NeedUpdateProgramException
	 */
	private static LessonInfo getLessions(JTextArea logField, String date, String lessonName, String lessonTime)
			throws UnknownHostException, IOException, NeedUpdateProgramException {
		SSLSocket socket = createSocket();

		long now = System.currentTimeMillis() / 1000;
		String formData = String.format(SSLPacketDetail.FIND_LESSION_FORM_DATA, date, date);
		Object[] params = new Object[] { formData.length(), ddosStr, now, sessionID, cookieStr, now, now, formData };

		writePacket(socket, SSLPacketDetail.FIND_LESSION_PACKET, SSLPacketDetail.FIND_LESSION_PACKET_PARAMS_COUNT, params);
		String result = readPacket(socket);

		return LessionFinder.findSpinningLession(result, lessonName, lessonTime);
	}

	/**
	 * 
	 * @param logField
	 * @param info
	 */
	private static void printFindedLesson(JTextArea logField, LessonInfo info) {
		appendLog(logField, "# 탐색된 레슨 갯수: " + info.getLessionCount() + "\r\n");
		for (int i = 0; i < info.getLessionCount(); i++) {
			appendLog(logField, info.getLessionsIdAt(i) + "\r\n");
		}

		appendLog(logField, "\r\n# 스피닝 레슨(ID) : " + info.getTargetLessionID() + "\r\n");
		appendLog(logField, "# 스피닝 레슨(INDEX) : " + (info.getTargetLessonIndex() + 1) + "\r\n");
	}

	/**
	 * 
	 * @param logField
	 * @param id
	 * @param pw
	 * @throws IOException
	 * @throws UnknownHostException
	 * @throws InvalidAccountInfoException
	 */
	private static void tryLogin(JTextArea logField, String id, String pw) throws UnknownHostException, IOException, InvalidAccountInfoException {
		SSLSocket socket = createSocket();

		long now = System.currentTimeMillis() / 1000;
		String loginForm = String.format(SSLPacketDetail.LOGIN_FORM_DATA, id, pw);
		Object[] params = new Object[] { loginForm.length(), ddosStr, now, sessionID, cookieStr, now, now, loginForm };

		writePacket(socket, SSLPacketDetail.LOGIN_PACKET, SSLPacketDetail.LOGIN_PACKET_PARAMS_COUNT, params);
		String result = readPacket(socket);

		if (result.contains("history.back()")) {
			throw new InvalidAccountInfoException();
		}

		appendLog(logField, "# 로그인 성공\r\n\r\n");
	}

	/**
	 * 
	 * @param logField
	 * @throws UnknownHostException
	 * @throws IOException
	 * @throws NeedUpdateProgramException
	 */
	private static void tryConnection(JTextArea logField) throws UnknownHostException, IOException, NeedUpdateProgramException {
		appendLog(logField, "# 연결 시도: resortsongdo.flexgym.biz\r\n\r\n");
		setDdosStr();
		setSessionAndCookie();

		if (checkConnectionInValid()) {
			throw new NeedUpdateProgramException();
		}

		appendLog(logField, ddosStr + "\r\n");
		appendLog(logField, sessionID + "\r\n");
		appendLog(logField, cookieStr + "\r\n");
		appendLog(logField, "# 연결 성공\r\n\r\n");
	}

	/**
	 * 
	 * @return
	 */
	private static boolean checkConnectionInValid() {
		return (ddosStr.length() == 0) || (sessionID.length() == 0) || (cookieStr.length() == 0);
	}

	/**
	 * @throws IOException
	 * @throws UnknownHostException
	 * @throws NeedUpdateProgramException
	 * 
	 */
	private static void setSessionAndCookie() throws UnknownHostException, IOException, NeedUpdateProgramException {
		SSLSocket socket = createSocket();

		long now = System.currentTimeMillis() / 1000;
		Object[] params = new Object[] { ddosStr, now, now, now };

		writePacket(socket, SSLPacketDetail.INIT_PACKET2, SSLPacketDetail.INIT_PACKET2_PARAMS_COUNT, params);
		String result = readPacket(socket);

		sessionID = findStr(result, "PHPSESSID").replace("; path=/", "");
		cookieStr = findStr(result, "TS01952e81").replace("; Path=/", "");
		socket.close();
	}

	/**
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 * @throws NeedUpdateProgramException
	 */
	private static void setDdosStr() throws UnknownHostException, IOException, NeedUpdateProgramException {
		SSLSocket socket = createSocket();

		long now = System.currentTimeMillis() / 1000;
		Object[] params = new Object[] { now, now, now };

		writePacket(socket, SSLPacketDetail.INIT_PACKET, SSLPacketDetail.INIT_PACKET_PARAMS_COUNT, params);
		String result = readPacket(socket);

		ddosStr = findStr(result, "DDOS");
		socket.close();
	}

	/**
	 * 
	 * @param result
	 * @return
	 * @throws NeedUpdateProgramException
	 */
	private static String findStr(String result, String targetStr) throws NeedUpdateProgramException {
		Scanner scan = new Scanner(result);

		while (scan.hasNext()) {
			String line = scan.nextLine();

			if (line.contains(targetStr)) {
				scan.close();
				return line.replace("Set-Cookie: ", "");
			}
		}

		scan.close();

		throw new NeedUpdateProgramException();
	}

	/**
	 * 
	 * @param socket
	 * @return
	 * @throws IOException
	 */
	private static String readPacket(SSLSocket socket) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		StringBuilder builder = new StringBuilder();
		String line;

		while ((line = in.readLine()) != null) {
			builder.append(line);
			builder.append("\r\n");
			System.out.println(line);

			if (line.equals("0")) {
				break;
			}
		}

		return builder.toString();
	}

	/**
	 * 
	 * @param socket
	 * @param packets
	 * @param paramsCount
	 * @param args
	 * @throws IOException
	 */
	private static void writePacket(SSLSocket socket, String[] packets, int[] paramsCount, Object... args) throws IOException {
		int index = 0;
		PrintStream out = new PrintStream(socket.getOutputStream());

		for (int i = 0; i < packets.length; i++) {
			int params = paramsCount[i];
			String targetPacket = packets[i];

			for (int k = 0; k < params; k++) {
				targetPacket = targetPacket.replaceFirst("%", args[index++].toString());
			}

			out.println(targetPacket);
			System.out.println(targetPacket);
		}

		out.println();
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	private static SSLSocket createSocket() throws IOException, UnknownHostException {
		return (SSLSocket) SSLSocketFactory.getDefault().createSocket("39.127.249.23", 443);
	}

	/**
	 * 
	 * @param log
	 * @param message
	 */
	private static void appendLog(JTextArea log, String message) {
		log.append(message);
		log.setCaretPosition(log.getText().length());
	}
}
