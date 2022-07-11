package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.CacheAspect;
import chap07.calculator.Calculator;
import chap07.calculator.RecCalculator;
import executor.ExeTimeAspect;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtx {

	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}

	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}

	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
}
