package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(10));

		Person a = new Person("최한석");
		Person b = new Person("한아름");
		Person c = new Person("양승일");

		a.setHasBall(true);
		a.pass(b);
		b.pass(c);
		c.shut();
	}
}

/**
 * 최한석, 한아름, 양승일이 축구를 한다. <br>
 * 아름이는 승일이한테 공을 패스한다. <br>
 * 한석이가 아름이한테 공을 패스한다. <br>
 * 승일이는 공을 찬다. <br>
 */