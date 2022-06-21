package home.ex01;

public class H01Replacement {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int bowl = 0;

		System.out.printf("전 : %d, %d\n", a, b);

		bowl = a;
		a = b;
		b = bowl;
		
		System.out.printf("후 : %d, %d", a, b);

	}

}
/**
 * 두 변수의 데이터를 교체하라 <br>
 * a: 1, b:2 <br>
 * a: 2, b:1
 **/