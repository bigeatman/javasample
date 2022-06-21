package ch03.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		
		double x = sc.nextDouble();
		
		System.out.printf("%d", Math.random());

	}
}

/*
 * 연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라. 
 * (casting), Math API를 사용 안 한다. 실수값은
 * sc.nextDouble()로 입력한다.
 * 
 * x:3.1492 
 * 3.0
 * 
 */