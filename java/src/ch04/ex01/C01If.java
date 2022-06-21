package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 1;

		if (visitCnt < 1) {
			System.out.println("첫방문입니다.");
		}
		int visitCnt2 = 0;

		if (visitCnt2 < 1) {
			System.out.println("첫방문입니다.");
		} else {
			System.out.println("재방문입니다.");
		}

		visitCnt2++;

		if (visitCnt2 < 1) {
			System.out.println("첫방문입니다.");
		} else {
			System.out.println("재방문입니다.");
		}
	}
}
