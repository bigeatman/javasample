package ch07.ex03.case04;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();

		for (int i = 0; i < 5; i++) {
			System.out.print(slot.chuck().getNum() + " ");
		}
	}
}
