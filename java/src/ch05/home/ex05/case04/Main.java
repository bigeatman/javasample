package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();

		man.setName("최한석");
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
 * 남자만을 객체로 디자인하라. <br>
 * <br>
 * 식당에서 한 남자가 다가와 앉습니다.<br>
 * 남자가 자기소개를 합니다.<br>
 * 이름은 최한석, 나이는 33살, 생일은 2025-607입니다.<br>
 * <br>
 * 남자는 음식을 기다리는 동안, 노래를 부릅니다. <br>
 * 음식이 나오자 맛있게 먹습니다. <br>
 * 다 먹더니, 게산 안 하고, 달려 나갑니다. <br>
 */
