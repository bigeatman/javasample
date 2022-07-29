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
	 * @param logField
	 * @throws IOException
	 * @throws UnknownHostException
	 * @throws InvalidAccountInfoException
	 * @throws NeedUpdateProgramException
	 */
	public static void doAction(String id, String pw, String date, JTextArea logField)
			throws UnknownHostException, IOException, InvalidAccountInfoException, NeedUpdateProgramException {

		socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("resortgymmt.flexgym.biz", 443);

		tryLogin(id, pw, logField);
		LessonInfo lessions = listUp(logField);

		socket.close();
	}

	private static LessonInfo listUp(JTextArea logField) throws IOException, NeedUpdateProgramException {
		logField.append("그룹레슨 조회");

		PrintStream out = new PrintStream(socket.getOutputStream());
		for (String packet : SSLPacketDetail.LISTUP_PACKETS) {
			if (packet.contains("Cookie")) {
				out.print(String.format(packet, sessionID));
			} else {
				out.print(packet);
			}
		}
		out.println();

		return LessionFinder.findSpinningLession(getResponseString());
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
		if (getResponseString().contains("alert")) {
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

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
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
