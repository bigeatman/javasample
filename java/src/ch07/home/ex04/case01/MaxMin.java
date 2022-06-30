package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = { 77, 88, 91, 33, 100, 55, 95 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int score : scores) {
			if (min >= score) {
				min = score;
			}

			if (max <= score) {
				max = score;
			}
		}

		System.out.println(min + " " + max);
	}
}
