import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DBConfig;
import model.Member;
import model.MemberDao;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		MemberDao dao = ctx.getBean(MemberDao.class);

		for (Member mem : dao.selectAll()) {
			System.out.println(mem);
		}

		ctx.close();
	}
}
