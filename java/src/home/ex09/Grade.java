package home.ex09;

import java.util.Scanner;

public class Grade {
	   public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);

	      System.out.print("����: ");
	      int kor = scan.nextInt();

	      System.out.print("����: ");
	      int eng = scan.nextInt();

	      System.out.print("����: ");
	      int math = scan.nextInt();

	      int sum = kor + eng + math;
	      double average = (double) sum / 3;
	      char grade = (100 > average && average >= 90) ? 'A' : (90 > average && average >= 80) ? 'B' : 'C';

	      System.out.println("���� : " + sum);
	      System.out.printf("��� : %.1f\n", average);
	      System.out.println("���� : " + grade);

	}
}
/**
����, ����, ���� ������ �Է¹޴´�.
����, ���, ������ ����Ѵ�.
��������� �Ҽ������� 1�ڸ������� ����Ѵ�.

90 	<= 	mean	<= 100: A
80 	<= 	mean	< 90: B
		mean 	< 80: C

����: 95
����: 100
����: 100

����: 295
���: 98.3
����: A
 **/