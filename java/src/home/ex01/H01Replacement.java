package home.ex01;

public class H01Replacement {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int bowl = 0;

		System.out.printf("�� : %d, %d\n", a, b);

		bowl = a;
		a = b;
		b = bowl;
		
		System.out.printf("�� : %d, %d", a, b);

	}

}
/**
 * �� ������ �����͸� ��ü�϶� <br>
 * a: 1, b:2 <br>
 * a: 2, b:1
 **/