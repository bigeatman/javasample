package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String prize = "";

		System.out.print("1. �����, 2.��Ź��\n>");
		choice = scan.nextInt();

		if (choice == 1) {
			prize = "�����";
		} else if (choice == 2) {
			prize = "��Ź��";
		} else {
			System.out.println("ȭ����");
		}
		System.out.println(prize);
	}
}