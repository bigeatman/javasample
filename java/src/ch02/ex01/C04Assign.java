package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		//////////////위에 먼차이//////////////
		
		double d = Math.random();
		System.out.printf("%.2f", d);
		
	}
}
