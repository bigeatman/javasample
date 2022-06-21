package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		String prize = "";

		System.out.print("1. ≥√¿Â∞Ì, 2.ºº≈π±‚\n>");
		choice = scan.nextInt();

		if (choice == 1) {
			prize = "≥√¿Â∞Ì";
		} else if (choice == 2) {
			prize = "ºº≈π±‚";
		} else {
			System.out.println("»≠¿Â¡ˆ");
		}
		System.out.println(prize);
	}
}