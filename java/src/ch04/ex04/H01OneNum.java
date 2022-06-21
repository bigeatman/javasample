package ch04.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;

		do {
			System.out.print("입력: ");
			String target = sc.nextLine();
			char firstChar = target.charAt(0);

			if ((target.length() != 1) || (!('1' <= firstChar && firstChar <= '9'))) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				input = firstChar - 48;
			}

		} while (!(1 <= input && input <= 9));

		System.out.println("끝.");
	}
}

/*
 * 과제] 한자리 자연수를 입력 받는다. 
 * 10이상의 자연수 또는 문자가 입력되면 예외처리한다.
 */
