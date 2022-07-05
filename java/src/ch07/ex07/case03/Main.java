package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		// 과제] calculator 에 lamda 값을 할당하라.
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		
		Calculator = (a ,b) -> a + b
		
		System.out.println(calculator.calc(1, 2));
	}
}
