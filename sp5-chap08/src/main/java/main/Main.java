package main;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DbConfig;
import dbquery.DbQuery;

public class Main {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);
		DataSource source = ctx.getBean("dataSource", DataSource.class);
		DbQuery query = new DbQuery(source);
		System.out.println(query.count());
		System.out.println("test");
		ctx.close();
		System.out.println("?");
	}
}
