package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		String inputStr = Console.inStr("문자열 입력: ");
		int inputNum = Console.inNum("숫자 입력: ");
		Console.off();
	}
}

/**
 * 콘솔 예외처리 (type missmatch) <br>
 * 문자열: 그대로 문자열 <br>
 * 숫자: 한자리d
 * 
 */
