package ch02.home.ex03;

import java.util.Scanner;

public class unicode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		
		String input = sc.nextLine();
		char i = input.charAt(0);
		
		System.out.printf("%c의 유니코드는 %d 입니다.", i, (int) i);
		
	}
}

/*
[과제] 입력한 문자의 unicode를 출력하라.
문자 : A
A의 unicode는 65입니다.

System.out.println((int)i + "입니다");
*/