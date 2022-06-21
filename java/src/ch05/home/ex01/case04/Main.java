package ch05.home.ex01.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름:");
		String name = scan.nextLine();

		System.out.print("나이:");
		int age = scan.nextInt();

		User user = new User(name, age);
		System.out.printf("이름: %s\n나이: %d\n가입일: %s", user.getName(), user.getAge(), user.getRegDate());

		scan.close();
	}
}

/**
 * 과제: 사용자 생성 <br>
 * 사용자의 이름, 나이를 입력받음. <br>
 * 가입일은 오늘 날짜를 자동 입력 받는다. <br>
 * 
 * 이름: gambit <br>
 * 나이: 25 <br>
 */