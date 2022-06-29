package ch06.ex04.case02;
//클래스와 멤버 변수만 사용해서 원을 디자인하라.
public class Circle{
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}
}
/*
	private double radius; // 반지름	
	private int lineThickness; // 선굵기	
	private int degree; // 각도
	private double centerPointX; // 원의 중심점 x좌표
	private double centerPointY; // 원의 중심점 y좌표
	private String color; // 원의 색상	
*/