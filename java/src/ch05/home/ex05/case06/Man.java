package ch05.home.ex05.case06;

public class Man {

	private String name;

	private Phone phone;

	public void buyPhone(Phone phone) {
		this.phone = phone;
		System.out.printf("%s�� %s���� %d�鸸�� �ְ� ����ϴ�.\n", name, phone.getProduct(), phone.getPrice());
	}

	public void �幵() {
		System.out.println("�տ� �� ���� ���� �幵�մϴ�.");
	}

	public void wating() {
		System.out.println();
	}

	public void sendMsg() {
		phone.sendMsg();
		System.out.println("�޼����� ���� ���ϴ�.");
	}

	public void waitForReceiveMsg() {
		System.out.print("������ ����,");
	}

	public void call() {
		phone.call();
		System.out.print("��ȭ�� �ɾ��, ");
	}

	public void waitForCallConnection() {
		System.out.println("������ �� �ǳ׿�.");
		System.out.println("��� �ڿ� �ٽ� ������ �����ϴ�.");
	}

	public void playingGame() {
		phone.game();
		System.out.println("��ٸ��� ���� ������ ������ �մϴ�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
