package ch06.home.ex04.case03;
/*
나쁜 코드를 좋은코드로 refactoring 하라.
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(1, 2, 3);
		
		System.out.println(circle);
	}
}
*/
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point(1, 2), 3);
		
		System.out.println(circle);
	}
}
