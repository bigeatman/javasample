package ch04.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;

		do {
			System.out.print("�Է�: ");
			String target = sc.nextLine();
			char firstChar = target.charAt(0);

			if ((target.length() != 1) || (!('1' <= firstChar && firstChar <= '9'))) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} else {
				input = firstChar - 48;
			}

		} while (!(1 <= input && input <= 9));

		System.out.println("��.");
	}
}

/*
 * ����] ���ڸ� �ڿ����� �Է� �޴´�. 
 * 10�̻��� �ڿ��� �Ǵ� ���ڰ� �ԷµǸ� ����ó���Ѵ�.
 */
