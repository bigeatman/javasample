package ch05.ex05.case01;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int result = calculator.add(1, 2);
		System.out.println(result);

		int result2 = calculator.add(1, 2, 3);
		System.out.println(result2);
	}
}
