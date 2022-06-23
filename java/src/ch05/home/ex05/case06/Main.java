package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setPrice(1);
		phone.setProduct("삼성");

		Man man = new Man();
		man.setName("최한석");

		man.buyPhone(phone);
		man.흐뭇();

		man.wating();
		man.sendMsg();
		man.waitForReceiveMsg();
		man.call();
		man.waitForCallConnection();
		man.playingGame();
	}
}

/**
 * 최한석은 삼성폰을 1백만원 주고 샀습니다. <br>
 * 손에 든 폰을 보니 흐뭇합니다. <br>
 * <br>
 * 메세지를 보내 봅니다.<br>
 * 답장이 없어, 전화를 걸어보니, 연결이 안 되네요. <br>
 * 잠시 뒤에 다시 연락해 보랍니다. <br>
 * 기다리는 동안 폰으로 게임을 합니다. <br>
 */