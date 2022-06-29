package ch06.ex05.case01;

public class Shoes extends Product {
	private int price;
	
	public Shoes(int price) {
		super(price);
		this.price = price;
		System.out.println(price);
		System.out.println(this.getPrice());
	}
}
