package ch03;

import java.util.Scanner;

public class Prob {
	public static void main(String[] args) {
//		=================================================
//		Ȯ�ι��� 2.
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		
//		System.out.println(z);
//		=================================================
//		Ȯ�ι��� 3.
//		int score = 85;
//		String result = (!(score > 90)) ? "��" : "��";
//		
//		System.out.println(result);
//		=================================================
//		Ȯ�ι���4.
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
//		=================================================
//		Ȯ�ι���5.
//		int value = 356;
//		
//		System.out.println(value - value % 100);
//		=================================================
//		���Ĵ�1.
//		int value = new Scanner(System.in).nextInt();
//
//		System.out.println("�Էµ� �� : " + value);
//
//		if (value % 2 == 0) {
//			System.out.println("�Էµ� ���� ¦���Դϴ�.");
//		} else {
//			System.out.println("�Էµ� ���� Ȧ���Դϴ�.");
//		}
//		=================================================
//		Ȯ�ι��� 6.
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		
//		double area = (double)1/2 * (lengthTop + lengthBottom) * height;
//		
//		System.out.println(area);
//		=================================================
//		Ȯ�ι��� 7.
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
			System.out.println("0.0���� ���� �� �����ϴ�.");
		} else {
			double result = z + 10;
			System.out.println("���: " + result);
		}
	}
}
