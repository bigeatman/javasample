package ch06.ex04.case01;
// 
public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		//super(); // �θ� Ŭ������ �����ڸ� ȣ���Ѵ�.
		super(name); // �θ� �����ڰ� ������ �ʱ�ȭ�Ѵ�.
		//this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
