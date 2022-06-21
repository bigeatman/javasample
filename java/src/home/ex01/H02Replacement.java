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

		System.out.printf("교체결과 : %d, %d", a, b);
	}
}

/**
 * 두 변수의 값을 교체하라 <br>
 * a와 b의 값을 임의로 입력받는다. <br>
 * 교체결과를 출력한다.
 **/