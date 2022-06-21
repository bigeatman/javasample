package ch02.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		
		System.out.println("공연 일자를 입력하세요");

	Scanner sc = new Scanner(System.in);
	
	int year = sc.nextInt();
	int month = sc.nextInt();
	int day = sc.nextInt();
	
	LocalDate date = LocalDate.of(year, month, day);
	LocalDate date2 = LocalDate.of(year, month, day - 3);
	
	System.out.println(date + "공연을 예매했습니다.");
	System.out.println(date2 + "까지 환불이 가능합니다.");	
		
	}
}
/**
예매하라. 환불은 공연일로부터 3일 전까지 가능하다.
--

공연 일자를 입력하세요.
년: 2025
월 7
일 17

2025-07-17 공연을 예매했습니다.
2025-07-14 까지 환불이 가능합니다. 
**/