package ch02.ex01;

import java.util.Scanner;

public class C03Input {								// 보기 불편할때 자동정렬 ctrl+shift+f
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Scanner 사용시 컴파일 에러가 발생하면 ctrl+shift+o -> import ___ 자동생성
		System.out.print("문자열을 입력하세요.\n>");

		String input = sc.nextLine();								// alt+shift=r -> 변수명 전체변경

//과제 <입력데이터>를 입력했습니다. 는 확인 메세지를 출력한다.
		System.out.print("<");
		System.out.print(input);
		System.out.print(">");
		System.out.println("를 출력했습니다.");
		System.out.println("<" + input + ">" + "를 출력했습니다.");
		System.out.printf("<%s>를 출력했습니다.\n", input);
		
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세여.\n>");
		int i2 = sc.nextInt();
		System.out.println(i + "를 입력했습니다.");
		
		//////////////////비////////////////온//////////////다///////////////캬햐햐ㅑ햐////////////////////////////
		System.out.print("문자열을 입력하세여.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s를 입력했습니다.", inVal);
		
		System.out.println("문자를 입력하세요.\n");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		
	}
}