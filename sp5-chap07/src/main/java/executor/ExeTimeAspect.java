package executor;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class ExeTimeAspect {

	// @Pointcut("execution(public * chap07..*(..))")
	// @Pointcut("execution(public long
	// chap07.calculator.RecCalculator.factorial(long))")
	@Pointcut("execution(public * *(*))")
	public void publicTarget() {
		System.out.println("publicTarget() called.");
		return;
	}

	// @Around("publicTarget()")
	@Around("execution(public * *(*))")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();

		Object result;
		try {
			result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) 실행 시간: %d ns\n", joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(), Arrays.toString(joinPoint.getArgs()), (finish - start));
		}
	}
}
