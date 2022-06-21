package ch03.ex04;

public class C02DecimaPoint {
	public static void main(String[] args) {

		double pi = 3.141592;

		double shortPi = (int) (pi * 10) / 10.0;
		System.out.println(shortPi);

		double pi2 = 3.141592;

		double shortPi2 = (int) (pi2 * 1000) / 1000.0;
		System.out.println(shortPi2);		//3.141
		
		double pi3 = 3.141592;
		
		double shortPi3 = (int) (pi3 * 1000) / 1000.0;
		System.out.println(shortPi3);		//3.142
		
	}
}
