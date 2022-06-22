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
		System.out.println("식당에 한 남자가 다가와 앉습니다.");
	}

	public void introduceSelf() {
		System.out.println("남자가 자기소개를 합니다.");
		System.out.printf("이름은 %s, 나이는 %d살, 생일은 %s입니다.\n", name, age, birth);
	}

	public void whileWating() {
		System.out.print("남자가 음식을 기다리는 동안, ");
	}

	public void singing() {
		System.out.println("노래를 부릅니다.");
	}

	public void eating() {
		System.out.println("음식이 나오자 맛있게 먹습니다.");
	}

	public void afterEating() {
		System.out.print("다 먹더니, ");
	}

	public void notPay() {
		System.out.print("계산 안 하고, ");
	}

	public void run() {
		System.out.println("달려 나갑니다.");
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
