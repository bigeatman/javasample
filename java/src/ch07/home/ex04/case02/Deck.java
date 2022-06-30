package ch07.home.ex04.case02;

public class Deck {

	private int size;

	private Card[] cards;

	public Deck(int size) {
		this.size = size;
		this.cards = new Card[size];

		for (int i = 0; i < size; i++) {
			cards[i] = new Card();
		}
	}

	public void shuffle() {
		for (int i = 0; i < size; i++) {
			int idx = (int) (Math.random() * 4) + 1;
			swapCard(idx, 0);
		}
	}

	private void swapCard(int idx, int i) {
		Card temp = cards[0];
		cards[0] = cards[idx];
		cards[idx] = temp;
	}

	public void printAllCard() {
		for (Card card : cards) {
			System.out.print(card.getNum() + " ");
		}
		System.out.println();
	}

	public Card getCardAt(int index) {
		return cards[index];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
