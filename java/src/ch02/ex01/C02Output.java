package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100 + 1);
		System.out.println(score + 1);
		
		int random = (int) (Math.random() * 100);		//(int)�� ��������ȯ, *100�ؼ� ������ȯ
		System.out.println(random);
		
		System.out.println(200);
		System.out.println(300);
		System.out.println("\n");		
		System.out.println(400);
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");		//f = ? , args = ?
		
		
//���� /���м��� �����ÿ�.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5s\n", true, 'a', 10, 1.15, "hello");		//% = ���� ����
		
		String name = "���Ѽ�";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s�� %d���Դϴ�.", name, age);
		System.out.println();
		System.out.println(name + "��" + age + "���Դϴ�.");
		
	}
}
