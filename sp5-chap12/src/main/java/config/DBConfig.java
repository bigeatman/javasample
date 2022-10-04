package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.MemberDao;

@Configuration
public class DBConfig {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/spring5fs?characterEncoding=utf-8");
		ds.setUsername("spring5");
		ds.setPassword("1234");

		ds.setMaxActive(2);
		ds.setInitialSize(2);

		ds.setTestWhileIdle(true);
		ds.setMinEvictableIdleTimeMillis(1000 * 60 * 3);

		return ds;
	}

	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource());
	}
}