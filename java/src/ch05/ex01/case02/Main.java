package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String name = "������";
		int age = 35;
		System.out.printf("%s�� %d���Դϴ�.", name, age);

		User user = new User();
		user.name = "���Ѽ�";
		user.age = 35;
		System.out.printf("%s�� %d���Դϴ�.", user.name, user.age);
	}
}
