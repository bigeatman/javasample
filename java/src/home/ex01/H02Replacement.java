package home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		System.out.println(line);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a);
		System.out.println(b);

		int bowl = 0;
		bowl = a;
		a = b;
		b = bowl;

		System.out.printf("��ü��� : %d, %d", a, b);
	}
}

/**
 * �� ������ ���� ��ü�϶� <br>
 * a�� b�� ���� ���Ƿ� �Է¹޴´�. <br>
 * ��ü����� ����Ѵ�.
 **/