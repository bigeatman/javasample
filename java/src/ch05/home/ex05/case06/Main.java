package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setPrice(1);
		phone.setProduct("�Ｚ");

		Man man = new Man();
		man.setName("���Ѽ�");

		man.buyPhone(phone);
		man.�幵();

		man.wating();
		man.sendMsg();
		man.waitForReceiveMsg();
		man.call();
		man.waitForCallConnection();
		man.playingGame();
	}
}

/**
 * ���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ����ϴ�. <br>
 * �տ� �� ���� ���� �幵�մϴ�. <br>
 * <br>
 * �޼����� ���� ���ϴ�.<br>
 * ������ ����, ��ȭ�� �ɾ��, ������ �� �ǳ׿�. <br>
 * ��� �ڿ� �ٽ� ������ �����ϴ�. <br>
 * ��ٸ��� ���� ������ ������ �մϴ�. <br>
 */