package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height);

		Card.width = 10;
		Card.height = 20;

		Card card1 = new Card();
		Card card2 = new Card();

		card1.kind = "heart";
		card1.number = 7;

		card2.kind = "spade";
		card2.number = 4;

		System.out.printf("\n%s, %s\n", card1.kind, card2.kind);
		System.out.printf("%d, %d", Card.width, Card.height);
		System.out.printf("\n%s, %s\n", card1.width, card2.height);

		card1.width = 100;
		System.out.printf("%s, %s\n", card1.width, card2.height);

	}
}
