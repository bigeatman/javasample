package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();

		man.setName("���Ѽ�");
		man.setAge(33);
		man.setBirth(LocalDate.of(2025, 6, 7));

		man.enterToRestaurant();
		man.introduceSelf();
		man.wating();
		man.whileWating();
		man.singing();
		man.eating();
		man.afterEating();
		man.notPay();
		man.run();
	}
}

/**
 * ���ڸ��� ��ü�� �������϶�. <br>
 * <br>
 * �Ĵ翡�� �� ���ڰ� �ٰ��� �ɽ��ϴ�.<br>
 * ���ڰ� �ڱ�Ұ��� �մϴ�.<br>
 * �̸��� ���Ѽ�, ���̴� 33��, ������ 2025-607�Դϴ�.<br>
 * <br>
 * ���ڴ� ������ ��ٸ��� ����, �뷡�� �θ��ϴ�. <br>
 * ������ ������ ���ְ� �Խ��ϴ�. <br>
 * �� �Դ���, �Ի� �� �ϰ�, �޷� �����ϴ�. <br>
 */
