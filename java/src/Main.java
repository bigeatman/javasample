import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("0.가위, 1. 바위, 2. 보\nInput : ");
		RPS selected = new RPS(new Scanner(System.in).nextInt());
		RPS aiSelected = RPS.getRandom();

		String result = RPS.verseResult(selected, aiSelected);
		System.out.printf("You : %s\nMe : %s\n", selected.getStr(), aiSelected.getStr());
		System.out.printf("You %s", result);
	}
}