package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(10));

		Person a = new Person("���Ѽ�");
		Person b = new Person("�ѾƸ�");
		Person c = new Person("�����");

		a.setHasBall(true);
		a.pass(b);
		b.pass(c);
		c.shut();
	}
}

/**
 * ���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�. <br>
 * �Ƹ��̴� ���������� ���� �н��Ѵ�. <br>
 * �Ѽ��̰� �Ƹ������� ���� �н��Ѵ�. <br>
 * �����̴� ���� ����. <br>
 */