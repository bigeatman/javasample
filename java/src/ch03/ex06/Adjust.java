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
 * �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�. 
 * (casting), Math API�� ��� �� �Ѵ�. �Ǽ�����
 * sc.nextDouble()�� �Է��Ѵ�.
 * 
 * x:3.1492 
 * 3.0
 * 
 */