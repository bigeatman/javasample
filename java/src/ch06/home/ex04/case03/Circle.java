package ch06.home.ex04.case03;
/*
public class Circle extends Point{
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r);
	}
}
*/
public class Circle {
	private Point point;
	private int r;
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", point, r);
	}
}