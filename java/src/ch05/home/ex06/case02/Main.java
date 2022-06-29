package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		String inputStr = Console.inStr("문자를 입력하세요 ");
		int inputNum = Console.inNum("숫자를 입력하세요 ");
		Console.off();
	}
}

/* 과제]
Console을 고도화하라.
예외처리를 한다.
Console.instr(): 한글자이상 입력해야한다.
Console.inNum(): 한자리 자연수를 입력해야한다.
문자를 입력하세요.
> Hello
숫자를 입력하세요.
> 12
ERROR] 한자리 자연수를 입력하세요.
> 1
끝
*/
