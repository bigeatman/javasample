package aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class CacheAspect {

	private Map<Long, Object> cache = new HashMap<>();

	@Pointcut("execution(public * chap07..*(long))")
	public void cacheTarget() {
		System.out.println("cacheTarget() called.");
	}

	@Around("executor.ExeTimeAspect.publicTarget()")
	public Object execute(ProceedingJoinPoint point) throws Throwable {
		Long num = (Long) point.getArgs()[0];

		if (cache.containsKey(num)) {
			System.out.println("기록된 키 : " + num);
			return num;
		}

		Object result = point.proceed();
		cache.put(num, result);
		System.out.println("키 추가됨 : " + num);
		return result;
	}
}
