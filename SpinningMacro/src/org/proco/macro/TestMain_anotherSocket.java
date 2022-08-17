package org.proco.macro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class TestMain_anotherSocket {

	/** ddos cookie str to keep conection */
	private static String ddosStr;

	/** session id to keep connection */
	private static String sessionID;

	private static String cookieStr;

	public static void main(String[] args) throws Exception {
		getDdosCookie();
		printLoginHtmlPage();
		tryLogin();
		tryGetLessons();
	}

	private static void tryGetLessons() throws Exception {
		long current = System.currentTimeMillis();
		SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("39.127.249.23", 443);

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("GET /mobile2/reservation.php?codeSS033=62839774 HTTP/1.1");
		out.println("Host: resortsongdo.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("sec-ch-ua: \"Chromium\";v=\"104\", \" Not A;Brand\";v=\"99\", \"Google Chrome\";v=\"104\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortsongdo.flexgym.biz/mobile/login_pay.php");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println(
				String.format("Cookie: %s; _ga=GA1.1.387056723.%d; %s; %s; _ga_RWPZ5GMMRV=GS1.1.%d.1.1.%d.0.0.0\r\n", ddosStr, current, sessionID, cookieStr, current, current));

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line;

		while ((line = in.readLine()) != null) {
			System.out.println(line);
			if (line.equals("0")) {
				break;
			}
		}
	}

	private static void tryLogin() throws Exception {
		long current = System.currentTimeMillis();
		SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("39.127.249.23", 443);

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("POST /mobile/login.php HTTP/1.1");
		out.println("Host: resortsongdo.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("Content-Length: 35");
		out.println("Cache-Control: max-age=0");
		out.println("sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortsongdo.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortsongdo.flexgym.biz/mobile/");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko,en;q=0.9,en-US;q=0.8");
		out.println(
				String.format("Cookie: %s; _ga=GA1.1.387056723.%d; %s; %s; _ga_RWPZ5GMMRV=GS1.1.%d.1.1.%d.0.0.0\r\n", ddosStr, current, sessionID, cookieStr, current, current));
		out.println("memberID=42928286&memberPW=42928286");

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line;

		while ((line = in.readLine()) != null) {
			System.out.println(line);

			if (line.equals("0")) {
				break;
			}
		}
	}

	private static void printLoginHtmlPage() throws Exception {
		long current = System.currentTimeMillis();
		SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("39.127.249.23", 443);

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("GET /mobile/ HTTP/1.1");
		out.println("Host: resortsongdo.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: none");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko,en;q=0.9,en-US;q=0.8");
		out.println(String.format("Cookie: %s; _ga=GA1.1.387056723.%d; _ga_RWPZ5GMMRV=GS1.1.%d.1.1.%d.0.0.0\r\n", ddosStr, current, current, current));

		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);

			if (line.contains("PHPSESSID")) {
				sessionID = line.replace("Set-Cookie: ", "").replace("; path=/", "");
			}

			if (line.contains("TS01952e81")) {
				cookieStr = line.replace("Set-Cookie: ", "").replace("; path=/", "");
			}

			if (line.equals("0")) {
				break;
			}
		}
	}

	private static void getDdosCookie() throws IOException, UnknownHostException {
		long current = System.currentTimeMillis();

		SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("39.127.249.23", 443);

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("GET /mobile/ HTTP/1.1");
		out.println("Host: resortsongdo.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: none");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko,en;q=0.9,en-US;q=0.8");
		out.println(String.format("Cookie: _ga=GA1.1.387056723.%d; _ga_RWPZ5GMMRV=GS1.1.%d.1.1.%d.0.0.0\r\n", current, current, current));

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
			if (line.contains("DDOS")) {
				ddosStr = line.replace("Set-Cookie: ", "");
			}
		}
	}
}
