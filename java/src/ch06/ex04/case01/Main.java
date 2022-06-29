package ch06.ex04.case01;

//name, age null 0 나오게 출력하기
public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("야코미", 3);
		
		//cat = new Cat(null,0);
		
		System.out.println(cat.getName() + ", " + cat.getAge());
	}
}
