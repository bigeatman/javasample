package ch06.ex04.case02;
//Ŭ������ ��� ������ ����ؼ� ���� �������϶�.
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
	private double radius; // ������	
	private int lineThickness; // ������	
	private int degree; // ����
	private double centerPointX; // ���� �߽��� x��ǥ
	private double centerPointY; // ���� �߽��� y��ǥ
	private String color; // ���� ����	
*/