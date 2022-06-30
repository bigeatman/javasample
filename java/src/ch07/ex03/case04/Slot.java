package ch07.ex03.case04;

public class Slot {
	private Ball[] balls;

	public Slot() {
		balls = new Ball[45];

		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(i + 1);
		}
	}

	public Ball chuck() {
		int index = (int) (Math.random() * 45);
		Ball ball = balls[index];

		if (ball == null) {
			return chuck();
		} else {
			balls[index] = null;
			return ball;
		}
	}
}
