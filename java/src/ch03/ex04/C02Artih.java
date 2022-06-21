package ch03.ex04;

public class C02Artih {
	public static void main(String[] args) {
		
		byte a = 3;
		byte b = 2;
		byte c = (byte) (a + b);
		System.out.println(c);

		c++;
		System.out.println(c);

		double d = a / b;
		System.out.println(d);

		d = (double) a / b;			//1)
		System.out.println(d);
		
		d = 1.0 * a / b;			//2) 1)과 다른 버그 해결법
		System.out.println(d);
		
	}
}