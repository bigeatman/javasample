package home;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("a : ");
		int a = scan.nextInt();

		System.out.print("b : ");
		int b = scan.nextInt();
		int sum = a + b;

		System.out.printf("%d + %d = %d", a, b, sum);

		scan.close();

	}
}

/**
 * �� �ڿ����� �Է¹޾� �� �հ踦 ����϶�. <br>
 * ----- <br>
 * a: 1 <br>
 * b: 2 <br>
 * 1 + 2 = 3<br>
 * 
 * @param args
 */