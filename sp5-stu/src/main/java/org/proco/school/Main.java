package org.proco.school;

import java.sql.SQLException;

import org.proco.school.config.AppCtx;
import org.proco.school.model.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		StudentDao dao = ctx.getBean("studentDao", StudentDao.class);
		System.out.println(dao.selectById(1));
	}
}
