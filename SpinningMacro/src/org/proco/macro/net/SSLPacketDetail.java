package org.proco.macro.net;

public class SSLPacketDetail {

	public static final String[] LOGIN_PACKETS = {
			"POST /mobile/login.php HTTP/1.1\r\n" ,
			"Host: resortgymmt.flexgym.biz\r\n" ,
			"Connection: keep-alive\r\n" ,
			"Cache-Control: max-age=0\r\n" ,
			"Content-Length: %d\r\n" ,
			"sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"\r\n" ,
			"sec-ch-ua-mobile: ?0\r\n" ,
			"sec-ch-ua-platform: \"Windows\"\r\n" ,
			"Upgrade-Insecure-Requests: 1\r\n" ,
			"Origin: https://resortgymmt.flexgym.biz\r\n" ,
			"Content-Type: application/x-www-form-urlencoded\r\n" ,
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36\r\n" ,
			"Accept: text/html,application/xhtml,xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" ,
			"Sec-Fetch-Site: same-origin\r\n" ,
			"Sec-Fetch-Mode: navigate\r\n" ,
			"Sec-Fetch-User: ?1\r\n" ,
			"Sec-Fetch-Dest: document\r\n" ,
			"Referer: https://resortgymmt.flexgym.biz/mobile/\r\n" ,
			"Accept-Encoding: gzip, deflate, br\r\n" ,
			"Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7\r\n\r\n"
	};
	
	public static final String[] LISTUP_PACKETS = {
			"GET /mobile2/reservation.php?codeSS033=62839774 HTTP/1.1\r\n",
			"Host: resortgymmt.flexgym.biz\r\n",
			"Cookie: %s\r\n",
			"Connection: keep-alive\r\n",
			"sec-ch-ua: \".Not/A)Brand\";v=\"99\", \"Google Chrome\";v=\"103\", \"Chromium\";v=\"103\"\r\n",
			"sec-ch-ua-mobile: ?0\r\n",
			"sec-ch-ua-platform: \"Windows\"\r\n",
			"Upgrade-Insecure-Requests: 1\r\n",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36\r\n",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n",
			"Sec-Fetch-Site: same-origin\r\n",
			"Sec-Fetch-Mode: navigate\r\n",
			"Sec-Fetch-User: ?1\r\n",
			"Sec-Fetch-Dest: document\r\n",
			"Referer: https://resortgymmt.flexgym.biz/mobile/login_pay.php\r\n",
			"Accept-Encoding: gzip, deflate, br\r\n",
			"Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7\r\n",
	};
	
	public static final String LOGIN_FORM_DATA_FORMAT = "memberID=%s&memberPW=%s\r\n";
}
