package ch02.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		
		System.out.println("���� ���ڸ� �Է��ϼ���");

	Scanner sc = new Scanner(System.in);
	
	int year = sc.nextInt();
	int month = sc.nextInt();
	int day = sc.nextInt();
	
	LocalDate date = LocalDate.of(year, month, day);
	LocalDate date2 = LocalDate.of(year, month, day - 3);
	
	System.out.println(date + "������ �����߽��ϴ�.");
	System.out.println(date2 + "���� ȯ���� �����մϴ�.");	
		
	}
}
/**
�����϶�. ȯ���� �����Ϸκ��� 3�� ������ �����ϴ�.
--

���� ���ڸ� �Է��ϼ���.
��: 2025
�� 7
�� 17

2025-07-17 ������ �����߽��ϴ�.
2025-07-14 ���� ȯ���� �����մϴ�. 
**/