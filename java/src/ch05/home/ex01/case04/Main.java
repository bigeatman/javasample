package ch05.home.ex01.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸�:");
		String name = scan.nextLine();

		System.out.print("����:");
		int age = scan.nextInt();

		User user = new User(name, age);
		System.out.printf("�̸�: %s\n����: %d\n������: %s", user.getName(), user.getAge(), user.getRegDate());

		scan.close();
	}
}

/**
 * ����: ����� ���� <br>
 * ������� �̸�, ���̸� �Է¹���. <br>
 * �������� ���� ��¥�� �ڵ� �Է� �޴´�. <br>
 * 
 * �̸�: gambit <br>
 * ����: 25 <br>
 */