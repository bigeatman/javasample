package ch02.home.ex03;

import java.util.Scanner;

public class unicode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		String input = sc.nextLine();
		char i = input.charAt(0);
		
		System.out.printf("%c�� �����ڵ�� %d �Դϴ�.", i, (int) i);
		
	}
}

/*
[����] �Է��� ������ unicode�� ����϶�.
���� : A
A�� unicode�� 65�Դϴ�.

System.out.println((int)i + "�Դϴ�");
*/