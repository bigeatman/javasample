import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Test {

	private static String sessionID = null;

	public static void main(String[] args) throws Exception {

		SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket("resortgymmt.flexgym.biz", 443);
//		writeLoginInfo(socket);
//		readOutputData(socket);
//		System.out.println("============================================================================================================================");

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("GET /mobile/ HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-Usaer: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		readOutputData(socket);
	}

	/**
	 * ½ºÇÇ´× ´í½º ¿¹¾à (9½Ã)
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void writeReservationTestInfo4(SSLSocket socket) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("POST /mobile2/reservation_ok.php HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Cookie: " + sessionID);
		out.println("Connection: keep-alive");
		out.println("Content-Length: 387");
		out.println("Cache-Control: max-age=0");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortgymmt.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortgymmt.flexgym.biz/mobile2/reservation.php?codeSS033=62839774");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		out.println(
				"isWeek=&page=1&pagesize=10&Date=2022-07-29&LC=C&flag=N&idx=&payIdx=62839774&SSIdx=64526728&ReserveDate=2022-07-29&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0&payIdx1=62839774%7C64526732%7C2022-07-29%7C1&payIdx2=62839774%7C64526729%7C2022-07-29%7C2&payIdx3=62839774%7C64526735%7C2022-07-29%7C3&payIdx4=62839774%7C64526728%7C2022-07-29%7C4&payIdx4=62839774%7C64526728%7C2022-07-29%7C4");
	}

	/**
	 * ½ºÇÇ´× ´í½º ¿¹¾à (8½Ã)
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void writeReservationTestInfo3(SSLSocket socket) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("POST /mobile2/reservation_ok.php HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Cookie: " + sessionID);
		out.println("Connection: keep-alive");
		out.println("Content-Length: 387");
		out.println("Cache-Control: max-age=0");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortgymmt.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortgymmt.flexgym.biz/mobile2/reservation.php?codeSS033=62839774");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		out.println(
				"isWeek=&page=1&pagesize=10&Date=2022-07-29&LC=C&flag=N&idx=&payIdx=62839774&SSIdx=64526729&ReserveDate=2022-07-29&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0&payIdx1=62839774%7C64526732%7C2022-07-29%7C1&payIdx2=62839774%7C64526729%7C2022-07-29%7C2&payIdx3=62839774%7C64526735%7C2022-07-29%7C3&payIdx4=62839774%7C64526728%7C2022-07-29%7C4&payIdx2=62839774%7C64526729%7C2022-07-29%7C2");
	}

	/**
	 * ´ÙÀÌ¾îÆ® ´í½º ¿¹¾à
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void writeReservationTestInfo2(SSLSocket socket) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("POST /mobile2/reservation_ok.php HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Cookie: " + sessionID);
		out.println("Connection: keep-alive");
		out.println("Content-Length: 387");
		out.println("Cache-Control: max-age=0");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortgymmt.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortgymmt.flexgym.biz/mobile2/reservation.php?codeSS033=62839774");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		out.println(
				"isWeek=&page=1&pagesize=10&Date=2022-07-29&LC=C&flag=N&idx=&payIdx=62839774&SSIdx=64526735&ReserveDate=2022-07-29&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0&payIdx1=62839774%7C64526732%7C2022-07-29%7C1&payIdx2=62839774%7C64526729%7C2022-07-29%7C2&payIdx3=62839774%7C64526735%7C2022-07-29%7C3&payIdx4=62839774%7C64526728%7C2022-07-29%7C4&payIdx3=62839774%7C64526735%7C2022-07-29%7C3");
	}

	/**
	 * ¾Æ½¬ÅÁ°¡ ¿¹¾à
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void writeReservationTestInfo(SSLSocket socket) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());
		out.println("POST /mobile2/reservation_ok.php HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Cookie: " + sessionID);
		out.println("Connection: keep-alive");
		out.println("Content-Length: 387");
		out.println("Cache-Control: max-age=0");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortgymmt.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortgymmt.flexgym.biz/mobile2/reservation.php?codeSS033=62839774");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		out.println(
				"isWeek=&page=1&pagesize=10&Date=2022-07-29&LC=C&flag=N&idx=&payIdx=62839774&SSIdx=64526735&ReserveDate=2022-07-29&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0&payIdx1=62839774%7C64526732%7C2022-07-29%7C1&payIdx2=62839774%7C64526729%7C2022-07-29%7C2&payIdx3=62839774%7C64526735%7C2022-07-29%7C3&payIdx4=62839774%7C64526728%7C2022-07-29%7C4&payIdx3=62839774%7C64526735%7C2022-07-29%7C3");
	}

	/**
	 * send id, pw and get the session id
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void writeLoginInfo(SSLSocket socket) throws IOException {
		PrintStream out = new PrintStream(socket.getOutputStream());

		out.println("POST /mobile/login.php HTTP/1.1");
		out.println("Host: resortgymmt.flexgym.biz");
		out.println("Connection: keep-alive");
		out.println("Cache-Control: max-age=0");
		out.println("Content-Length: 35");
		out.println("sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"");
		out.println("sec-ch-ua-mobile: ?0");
		out.println("sec-ch-ua-platform: \"Windows\"");
		out.println("Upgrade-Insecure-Requests: 1");
		out.println("Origin: https://resortgymmt.flexgym.biz");
		out.println("Content-Type: application/x-www-form-urlencoded");
		out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
		out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		out.println("Sec-Fetch-Site: same-origin");
		out.println("Sec-Fetch-Mode: navigate");
		out.println("Sec-Fetch-User: ?1");
		out.println("Sec-Fetch-Dest: document");
		out.println("Referer: https://resortgymmt.flexgym.biz/mobile/");
		out.println("Accept-Encoding: gzip, deflate, br");
		out.println("Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		out.println();
		out.println("memberID=42928286&memberPW=42928286");
		out.println();
	}

	/**
	 * print http result data
	 * 
	 * @param socket
	 * @throws IOException
	 */
	private static void readOutputData(SSLSocket socket) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = null;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
			if ((line.length() == 1) && (line.charAt(0) == '0')) {
				break;
			}

			if (line.contains("PHPSESSID")) {
				sessionID = line.replace("Set-Cookie: ", "").replace("; path=/", "");
			}
		}
	}
}
