package chap07.calculator;

public class ExeTimeCalculator implements Calculator {

	private Calculator delegate;

	public ExeTimeCalculator(Calculator delegate) {
		super();
		this.delegate = delegate;
	}

	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();

		System.out.printf("%s.factorial : %d\n실행시간: %d\n", delegate.getClass(), result, (end - start));
		return result;
	}
}
