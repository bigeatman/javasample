package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;

		int absX = (x >= 0) ? x : -x;
		
		System.out.printf("absX: %d", absX);
		
	}
}
