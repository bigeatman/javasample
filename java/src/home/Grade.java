package home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		grade2();

	}

	private static void grade1() {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		String grade = "F";

		if (score >= 98) {
			grade = "A+";
		} else if (score >= 94) {
			grade = "A";
		} else if (score >= 90) {
			grade = "A-";
		} else if (score >= 86) {
			grade = "B+";
		} else if (score >= 82) {
			grade = "B";
		} else if (score >= 78) {
			grade = "B-";
		}

		System.out.println(grade);
	}

	public static void grade2() {

		Scanner scan = new Scanner(System.in);

		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";

		System.out.print("점수: ");
		score = scan.nextInt();
		tenDigit = score / 10;
		oneDigit = score % 10;

		if (tenDigit >= 9) {
			grade = "A";
		} else if (tenDigit >= 8) {
			grade = "B";
		} else {
			grade = "C";
		}

		if (tenDigit >= 8 && tenDigit == 10 || oneDigit >= 8) {
			grade += "+";
		} else if (0 <= oneDigit && oneDigit < 4) {
			grade += "-";
		}

		System.out.println(grade);
	}
}

/*
 * 98이상 A+ 94이상 A 90이상 A- 86이상 B+ 82이상 B 78이상 B-
 */
