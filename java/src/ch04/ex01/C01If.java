package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 1;

		if (visitCnt < 1) {
			System.out.println("ù�湮�Դϴ�.");
		}
		int visitCnt2 = 0;

		if (visitCnt2 < 1) {
			System.out.println("ù�湮�Դϴ�.");
		} else {
			System.out.println("��湮�Դϴ�.");
		}

		visitCnt2++;

		if (visitCnt2 < 1) {
			System.out.println("ù�湮�Դϴ�.");
		} else {
			System.out.println("��湮�Դϴ�.");
		}
	}
}
