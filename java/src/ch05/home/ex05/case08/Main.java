package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Person a = new Person("���Ѽ�");
		Person b = new Person("�ѾƸ�");
		Person c = new Person("�����");

		a.setHasBool(true);
		a.pass(b);
		b.pass(c);
		c.shut();
	}
}

/**
 * ���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�. <br>
 * �Ѽ��̰� �Ƹ������� ���� �н��Ѵ�. <br>
 * �Ƹ��̴� ���������� ���� �н��Ѵ�. <br>
 * �����̴� ���� ����. <br>
 */