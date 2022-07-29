
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;

public class Main {

	/** BOUNDARY */
	private static final String BOUNDARY = "1Q2W3E4R";

	/** HYPHEN */
	private static final String HYPEN = "--";

	/** CRLF */
	private static final String CRLF = "\r\n";

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		List<String> sessions = login();

		reservation(sessions);

		System.out.println("END");
	}

	private static void reservation(List<String> sessions) throws IOException {
		URL url = new URL("https://resortgymmt.flexgym.biz/mobile2/reservation_ok.php");
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setUseCaches(true);
		con.setDoOutput(true);
		con.setDoInput(true);
		setSession(sessions, con);
		con.setRequestProperty("Accept-Encoding", " gzip, deflate, br");
		con.setRequestProperty("Accept-Language", " ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7");
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		DataOutputStream out = new DataOutputStream(con.getOutputStream());
		addFormKeyValue(con, out, "isWeek", "1");
		addFormKeyValue(con, out, "page", "1");
		addFormKeyValue(con, out, "pagesize", "10");
		addFormKeyValue(con, out, "Date", "2022-07-28");
		addFormKeyValue(con, out, "LC", "C");
		addFormKeyValue(con, out, "flag", "D");
		addFormKeyValue(con, out, "idx", "");
		addFormKeyValue(con, out, "payIdx", "62839774");
		addFormKeyValue(con, out, "SSIdx", "64526659");
		addFormKeyValue(con, out, "ReserveDate", "2022-07-28");
		addFormKeyValue(con, out, "codeSS033", "62839774");
		addFormKeyValue(con, out, "codeSS02", "0");
		addFormKeyValue(con, out, "ClassR", "0");
		addFormKeyValue(con, out, "Trainer", "0");
		addFormKeyValue(con, out, "payIdx1", "62839774|64526658|2022-07-28|1");
		addFormKeyValue(con, out, "payIdx2", "62839774|64526653|2022-07-28|2");
		addFormKeyValue(con, out, "payIdx3", "62839774|64526659|2022-07-28|3");
		addFormKeyValue(con, out, "payIdx5", "62839774|64526652|2022-07-28|5");
		addFormKeyValue(con, out, "payIdx6", "62839774|64526660|2022-07-28|6");
		addFormKeyValue(con, out, "payIdx3", "62839774|64526659|2022-07-28|3");
		out.flush();

		con.connect();
		printResultToConsole(con);
	}

	/**
	 * 
	 * @param sessions
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws ProtocolException
	 */
	private static List<String> login() throws MalformedURLException, IOException, ProtocolException {
		URL url = new URL("https://resortgymmt.flexgym.biz/mobile/login.php");
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setUseCaches(true);
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestProperty("Connection", "Keep-Alive");
		con.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + BOUNDARY);
		con.setRequestProperty("Content-Length", "12");
		con.connect();

		DataOutputStream out = new DataOutputStream(con.getOutputStream());
		addFormKeyValue(con, out, "memberID", "42928286");
		addFormKeyValue(con, out, "memberPW", "42928286");
		out.flush();

		printResultToConsole(con);

		return new ArrayList<>(con.getHeaderFields().get("Set-Cookie"));
	}

	/**
	 * 
	 * @param con
	 * @param key
	 * @param value
	 * @throws IOException
	 */
	private static void addFormKeyValue(HttpsURLConnection con, DataOutputStream out, String key, String value) throws IOException {
		out.writeBytes(HYPEN + BOUNDARY + CRLF);
		out.writeBytes("Content-Disposition: form-data; name=\"" + key + "\"" + CRLF);
		out.writeBytes("Content-Type:text/plain; charset=UTF-8" + CRLF);
		out.writeBytes(CRLF);
		out.writeBytes(value + CRLF);
	}

	/**
	 * 
	 * @param sessions
	 * @param con
	 */
	private static void setSession(List<String> sessions, HttpsURLConnection con) {
		for (String session : sessions) {
			con.addRequestProperty("Cookie", session.split(";", 2)[0]);
		}

	}

	/**
	 * 
	 * @param con
	 * @throws IOException
	 */
	private static void printResultToConsole(HttpsURLConnection con) throws IOException {
		String line;
		BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
