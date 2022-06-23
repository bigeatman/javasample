package ch05.home.ex05.case06;

public class Man {

	/** man's name */
	private String name;

	/** phone bied by man */
	private Phone phone;

	public void buyPhone(Phone phone) {
		this.phone = phone;
	}

	public void emotion() {

	}

	public void wating() {

	}

	public void sendMsg() {
		phone.sendMsg();
	}

	public void waitForReceiveMsg() {

	}

	public void call() {
		phone.call();
	}

	public void waitForCallConnection() {

	}

	public void playingGame() {
		phone.game();
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
