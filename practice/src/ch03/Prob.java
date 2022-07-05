package ch03;

import java.util.Scanner;

public class Prob {
	public static void main(String[] args) {
//		=================================================
//		확인문제 2.
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		
//		System.out.println(z);
//		=================================================
//		확인문제 3.
//		int score = 85;
//		String result = (!(score > 90)) ? "가" : "나";
//		
//		System.out.println(result);
//		=================================================
//		확인문제4.
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
//		=================================================
//		확인문제5.
//		int value = 356;
//		
//		System.out.println(value - value % 100);
//		=================================================
//		똥후니1.
//		int value = new Scanner(System.in).nextInt();
//
//		System.out.println("입력된 값 : " + value);
//
//		if (value % 2 == 0) {
//			System.out.println("입력된 수는 짝수입니다.");
//		} else {
//			System.out.println("입력된 수는 홀수입니다.");
//		}
//		=================================================
//		확인문제 6.
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		
//		double area = (double)1/2 * (lengthTop + lengthBottom) * height;
//		
//		System.out.println(area);
//		=================================================
//		확인문제 7.
//		int x = 10;
//		int y = 5;
//		
//		System.out.println((x > 7) && (y <= 5));
//		System.out.println((x % 3 == 2) || (y % 2 != 1));
//		=================================================
		double x = 5.0;
		double y = 0.0;
		double z = x % y;

		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
