package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");

		int len = src.length();
		System.out.println("length : " + len);

		src.append("짖는다");
		src.replace(3, 4, "고양이");

		String str = src.toString();

		System.out.println(src);
		System.out.println(str);
	}
}