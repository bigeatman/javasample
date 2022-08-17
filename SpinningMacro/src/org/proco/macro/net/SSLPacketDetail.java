package org.proco.macro.net;

public class SSLPacketDetail {
	
	protected static final String[] INIT_PACKET = {
			"GET /mobile/ HTTP/1.1",
			"Host: resortsongdo.flexgym.biz",
			"Connection: keep-alive",
			"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
			"sec-ch-ua-mobile: ?0",
			"sec-ch-ua-platform: \"Windows\"",
			"Upgrade-Insecure-Requests: 1",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
			"Sec-Fetch-Site: none",
			"Sec-Fetch-Mode: navigate",
			"Sec-Fetch-User: ?1",
			"Sec-Fetch-Dest: document",
			"Accept-Encoding: gzip, deflate, br",
			"Accept-Language: ko,en;q=0.9,en-US;q=0.8",
			"Cookie: _ga=GA1.1.387056723.%; _ga_RWPZ5GMMRV=GS1.1.%.1.1.%.0.0.0\r\n"
	};
	
	protected static final int[] INIT_PACKET_PARAMS_COUNT = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3 };
	
	protected static final String[] INIT_PACKET2 = {
			"GET /mobile/ HTTP/1.1",
			"Host: resortsongdo.flexgym.biz",
			"Connection: keep-alive",
			"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
			"sec-ch-ua-mobile: ?0",
			"sec-ch-ua-platform: \"Windows\"",
			"Upgrade-Insecure-Requests: 1",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
			"Sec-Fetch-Site: none",
			"Sec-Fetch-Mode: navigate",
			"Sec-Fetch-User: ?1",
			"Sec-Fetch-Dest: document",
			"Accept-Encoding: gzip, deflate, br",
			"Accept-Language: ko,en;q=0.9,en-US;q=0.8",
			"Cookie: %; _ga=GA1.1.387056723.%; _ga_RWPZ5GMMRV=GS1.1.%.1.1.%.0.0.0\r\n"
	};
	
	protected static final int[] INIT_PACKET2_PARAMS_COUNT = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4 };
	
	protected static final String[] LOGIN_PACKET  = {
			"POST /mobile/login.php HTTP/1.1",
			"Host: resortsongdo.flexgym.biz",
			"Connection: keep-alive",
			"Content-Length: %",
			"Cache-Control: max-age=0",
			"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
			"sec-ch-ua-mobile: ?0",
			"sec-ch-ua-platform: \"Windows\"",
			"Upgrade-Insecure-Requests: 1",
			"Origin: https://resortsongdo.flexgym.biz",
			"Content-Type: application/x-www-form-urlencoded",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
			"Sec-Fetch-Site: same-origin",
			"Sec-Fetch-Mode: navigate",
			"Sec-Fetch-User: ?1",
			"Sec-Fetch-Dest: document",
			"Referer: https://resortsongdo.flexgym.biz/mobile/",
			"Accept-Encoding: gzip, deflate, br",
			"Accept-Language: ko,en;q=0.9,en-US;q=0.8",
			"Cookie: %; _ga=GA1.1.387056723.%; %; %;_ga_RWPZ5GMMRV=GS1.1.%.1.1.%.0.0.0\r\n",
			"%\r\n"
	};
	
	protected static final int[] LOGIN_PACKET_PARAMS_COUNT = {  0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6, 1 };
	
	protected static final String LOGIN_FORM_DATA = "memberID=%s&memberPW=%s";
	
	protected static final String[] FIND_LESSION_PACKET =  {
			"POST /mobile2/reservation.php HTTP/1.1",
			"Host: resortsongdo.flexgym.biz",
			"Connection: keep-alive",
			"Content-Length: %",
			"Cache-Control: max-age=0",
			"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
			"sec-ch-ua-mobile: ?0",
			"sec-ch-ua-platform: \"Windows\"",
			"Upgrade-Insecure-Requests: 1",
			"Origin: https://resortsongdo.flexgym.biz",
			"Content-Type: application/x-www-form-urlencoded",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
			"Sec-Fetch-Site: same-origin",
			"Sec-Fetch-Mode: navigate",
			"Sec-Fetch-User: ?1",
			"Sec-Fetch-Dest: document",
			"Referer: https://resortsongdo.flexgym.biz/mobile2/reservation.php",
			"Accept-Encoding: gzip, deflate, br",
			"Accept-Language: ko,en;q=0.9,en-US;q=0.8",
			"Cookie: %; _ga=GA1.1.387056723.%; %; %;_ga_RWPZ5GMMRV=GS1.1.%.1.1.%.0.0.0\r\n",
			"%\r\n"
	};
	
	protected static final int[] FIND_LESSION_PACKET_PARAMS_COUNT = { 0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,1 };
	
	protected static final String FIND_LESSION_FORM_DATA = "isWeek=1&page=1&pagesize=10&Date=%s&LC=C&flag=&idx=&payIdx=&SSIdx=&ReserveDate=%s&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0";
	
	protected static final String[] RESERVATION_PACEKT = {
			"POST /mobile2/reservation_ok.php HTTP/1.1",
			"Host: resortsongdo.flexgym.biz",
			"Connection: keep-alive",
			"Content-Length: %",
			"Cache-Control: max-age=0",
			"sec-ch-ua: \" Not;A Brand\";v=\"99\", \"Microsoft Edge\";v=\"103\", \"Chromium\";v=\"103\"",
			"sec-ch-ua-mobile: ?0",
			"sec-ch-ua-platform: \"Windows\"",
			"Upgrade-Insecure-Requests: 1",
			"Origin: https://resortsongdo.flexgym.biz",
			"Content-Type: application/x-www-form-urlencoded",
			"User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.5060.134 Safari/537.36 Edg/103.0.1264.71",
			"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
			"Sec-Fetch-Site: same-origin",
			"Sec-Fetch-Mode: navigate",
			"Sec-Fetch-User: ?1",
			"Sec-Fetch-Dest: document",
			"Referer: https://resortsongdo.flexgym.biz/mobile2/reservation.php",
			"Accept-Encoding: gzip, deflate, br",
			"Accept-Language: ko,en;q=0.9,en-US;q=0.8",
			"Cookie: %; _ga=GA1.1.387056723.%; %; %;_ga_RWPZ5GMMRV=GS1.1.%.1.1.%.0.0.0\r\n",
			"%\r\n"
	};
	
	protected static final int[] RESERVATION_PACKET_PARAMS_COUNT = { 0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,1 };
	
	protected static final String RESERVATION_FORM_DATA = "isWeek=&page=1&pagesize=10&Date=%s&LC=C&flag=N&idx=&payIdx=62839774&SSIdx=%s&ReserveDate=%s&codeSS033=62839774&codeSS02=0&ClassR=0&Trainer=0&%s";
}

