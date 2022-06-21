package home.ex09;

import java.util.Scanner;

public class Grade {
	   public static void main(String[] args) {

	      Scanner scan = new Scanner(System.in);

	      System.out.print("국어: ");
	      int kor = scan.nextInt();

	      System.out.print("영어: ");
	      int eng = scan.nextInt();

	      System.out.print("수학: ");
	      int math = scan.nextInt();

	      int sum = kor + eng + math;
	      double average = (double) sum / 3;
	      char grade = (100 > average && average >= 90) ? 'A' : (90 > average && average >= 80) ? 'B' : 'C';

	      System.out.println("총점 : " + sum);
	      System.out.printf("평균 : %.1f\n", average);
	      System.out.println("학점 : " + grade);

	}
}
/**
국어, 영어, 수학 점수를 입력받는다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점이하 1자리까지만 출력한다.

90 	<= 	mean	<= 100: A
80 	<= 	mean	< 90: B
		mean 	< 80: C

국어: 95
영어: 100
수학: 100

총점: 295
평균: 98.3
학점: A
 **/