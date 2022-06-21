package ch04.ex04;

import java.util.Scanner;

public class H02Calaulator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int result = 0;

		while (true) {
			System.out.print("a : ");
			int a = scan.nextInt();
			scan.nextLine();

			System.out.print("op : ");
			char op = scan.nextLine().charAt(0);

			System.out.print("b : ");
			int b = scan.nextInt();
			scan.nextLine();

			switch (op) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				result = a * b;
				break;
			case '/':
				result = a / b;
				break;
			}

			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("����Ͻðڽ��ϱ�(y/n)?");
			// scan.nextLine();
			char selected = scan.nextLine().charAt(0);

			if (selected == 'y') {
				continue;
			} else if (selected == 'n') {
				break;
			}
		}
	}
}

/*
 * ����] ���⸦ ������. �����ڴ� +, -, *, / �̴�. / �� ���� ��´�. ����ó�� ���Ѵ�. ---- a : 1 op : + b
 * : 2 1 + 2 = 3 ����Ͻðڽ��ϱ�(y/n)? y a : 2 op : * b : 3 2 * 3 = 6
 */
