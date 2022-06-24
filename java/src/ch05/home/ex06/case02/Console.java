package ch05.home.ex06.case02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	private static void inMsg(String msg) {
		System.out.print(msg + ">");
	}

	public static String inStr(String msg) {
		Console.inMsg(msg);
		String input = sc.nextLine().trim();

		if (input.length() == 1) {
			System.out.println("ERROR] �ΰ� �̻��� ���ڸ� �Է��ϼ���.");
			return inStr(msg);
		} else {
			return input;
		}
	}

	public static int inNum(String msg) {
		int num = 0;

		try {
			Console.inMsg(msg);
			num = sc.nextInt();
			sc.nextLine();

			if (num >= 10) {
				System.out.println("ERROR] ���ڸ� �ڿ����� �Է��ϼ���.");
				return inNum(msg);
			} else {
				return num;
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR] ���ڸ� �Է��ϼ���.");
			sc.nextLine();
			return inNum(msg);
		}
	}

	public static void info(String msg) {
		System.out.println(msg);
	}

	public static void err(String msg) {
		System.out.println("ERROR");
	}

	public static void off() {
		System.out.println("���α׷� ����");
	}
}
