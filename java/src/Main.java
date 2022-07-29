import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.print("1. 예금 2. 출금 3. 잔고 4. 종료 >> ");

			int selected = scan.nextInt();
			scan.nextLine();

			switch (selected) {
			case 1:
				balance += changeBalance("예금액 : ", scan);
				break;
			case 2:
				balance -= changeBalance("출금액 : ", scan);
				break;
			case 3:
				System.out.println(balance);
				continue;
			case 4:
				return;
			}
		}
	}

	private static int changeBalance(String msg, Scanner scan) {
		System.out.println(msg);
		int changed = scan.nextInt();
		scan.nextLine();
		return changed;
	}
}
