package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Man {

	private String name;

	private int age;

	private LocalDate birth;

	public void wating() {
		System.out.println();
	}

	public void enterToRestaurant() {
		System.out.println("�Ĵ翡 �� ���ڰ� �ٰ��� �ɽ��ϴ�.");
	}

	public void introduceSelf() {
		System.out.println("���ڰ� �ڱ�Ұ��� �մϴ�.");
		System.out.printf("�̸��� %s, ���̴� %d��, ������ %s�Դϴ�.\n", name, age, birth);
	}

	public void whileWating() {
		System.out.print("���ڰ� ������ ��ٸ��� ����, ");
	}

	public void singing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}

	public void eating() {
		System.out.println("������ ������ ���ְ� �Խ��ϴ�.");
	}

	public void afterEating() {
		System.out.print("�� �Դ���, ");
	}

	public void notPay() {
		System.out.print("��� �� �ϰ�, ");
	}

	public void run() {
		System.out.println("�޷� �����ϴ�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

}
