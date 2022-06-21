package ch03;

public class C02MinusMinus {
	public static void main(String[] args) {
		
		int i = 0;
		--i;
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		i = 0;
		int j = --i;
		System.out.printf("f : %d, j : %d\n", i, j);
		
		i = 0;
		j = i--;
		System.out.printf("f : %d, j : %d\n", i, j);
		
	}
}
