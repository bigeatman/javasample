package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck(5);

		for (int i = 0; i < deck.getSize(); i++) {
			deck.getCardAt(i).setNum(i);
		}

		deck.printAllCard();
		deck.shuffle();
		deck.printAllCard();
	}
}

/**
 * Ŭ���� Shuffle�� OOP�� �����丵
 */
