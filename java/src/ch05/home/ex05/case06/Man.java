package ch05.home.ex05.case06;

public class Man {

	private String name;

	private Phone phone;

	public void buyPhone(Phone phone) {
		this.phone = phone;
		System.out.printf("%s는 %s폰을 %d백만원 주고 샀습니다.\n", name, phone.getProduct(), phone.getPrice());
	}

	public void 흐뭇() {
		System.out.println("손에 든 폰을 보니 흐뭇합니다.");
	}

	public void wating() {
		System.out.println();
	}

	public void sendMsg() {
		phone.sendMsg();
		System.out.println("메세지를 보내 봅니다.");
	}

	public void waitForReceiveMsg() {
		System.out.print("답장이 없어,");
	}

	public void call() {
		phone.call();
		System.out.print("전화를 걸어보니, ");
	}

	public void waitForCallConnection() {
		System.out.println("연결이 안 되네요.");
		System.out.println("잠시 뒤에 다시 연락해 보랍니다.");
	}

	public void playingGame() {
		phone.game();
		System.out.println("기다리는 동안 폰으로 게임을 합니다.");
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
