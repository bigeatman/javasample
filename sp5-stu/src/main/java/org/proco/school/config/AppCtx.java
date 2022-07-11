package org.proco.school.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.proco.school.model.dao.StudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {

	@Bean
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/stu");
		ds.setUsername("stu");
		ds.setPassword("1234");
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
}
