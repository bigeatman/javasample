package org.proco.macro.net;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.proco.macro.net.exception.NeedUpdateProgramException;

public class LessionFinder {

	private static final Pattern PAYIDX_PATTERN = Pattern.compile("\\\"(payIdx\\d+)\\\"");

	private static final Pattern VALUE_PATTERN = Pattern.compile("value\\=\\\"(\\d+\\|\\d+\\|\\d\\d\\d\\d\\-\\d\\d\\-\\d\\d\\|\\d+)\\\"");

	private static final Pattern LESSION_ID_PATTERN = Pattern.compile("\\d+\\|(\\d+)\\|\\d\\d\\d\\d\\-\\d\\d\\-\\d\\d\\|\\d");

	/**
	 * 
	 * @param html
	 * @param targetTime
	 * @param targetName
	 * @param targetName
	 * @param date
	 * @throws NeedUpdateProgramException
	 */
	public static LessonInfo findSpinningLession(String html, String targetName, String targetTime) throws NeedUpdateProgramException {
		LessonInfo info = new LessonInfo();
		Scanner scan = new Scanner(html);

		while (scan.hasNext()) {
			String line = scan.nextLine();

			if (line.contains("<input type=\"hidden\" name=\"payIdx")) {
				getLessionInfo(info, scan, line, targetName, targetTime);
			}
		}

		scan.close();
		return info;
	}

	/**
	 * 
	 * @param info
	 * @param scan
	 * @param line
	 * @param targetTime
	 * @param targetName
	 * @param lessonName2
	 * @param date
	 * @throws NeedUpdateProgramException
	 */
	private static void getLessionInfo(LessonInfo info, Scanner scan, String line, String targetName, String targetTime) throws NeedUpdateProgramException {
		String fullValue = line;
		String lessonName = scan.nextLine();
		scan.nextLine();
		String time = scan.nextLine();

		if (lessonName.contains("cName") == false) {
			return;
		}

		String payKey = getValueFormHtml(fullValue, PAYIDX_PATTERN);
		String payValue = getValueFormHtml(fullValue, VALUE_PATTERN);
		info.addLession(String.format("%s=%s", payKey, payValue));

		if (lessonName.contains(targetName) && time.contains(targetTime)) {
			String lessionID = getValueFormHtml(payValue, LESSION_ID_PATTERN);
			info.setTargetLessionID(lessionID);
			info.setTargetLessonIndex(info.getLessionCount() - 1);
		}
	}

	/**
	 * 
	 * @param fullValue
	 * @return
	 * @throws NeedUpdateProgramException
	 */
	private static String getValueFormHtml(String fullValue, Pattern pattern) throws NeedUpdateProgramException {
		Matcher matcher = pattern.matcher(fullValue);

		if (matcher.find()) {
			return matcher.group(1);
		} else {
			throw new NeedUpdateProgramException();
		}
	}
}