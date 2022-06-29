package ch06.ex04.case01;
// 
public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		//super(); // 부모 클래스의 생성자를 호출한다.
		super(name); // 부모 생성자가 스스로 초기화한다.
		//this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
