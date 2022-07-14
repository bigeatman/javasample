package main;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DbConfig;
import model.Member;
import model.MemberDao;

public class MainForMemberDao {

	private static MemberDao memberDao;

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddHHmmss");

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);
		memberDao = ctx.getBean(MemberDao.class);

		selectAll();
		updateMember();
		insertMember();

		ctx.close();
	}

	private static void selectAll() {
		System.out.println("# selectAll");
		int total = memberDao.count();
		System.out.println("total : " + total);

		for (Member mem : memberDao.selectAll()) {
			System.out.println(mem);
		}
	}

	private static void updateMember() {
		System.out.println("# updateMember");
		Member mem = memberDao.selectByEmail("abcd@abcd");

		String old = mem.getPassword();
		String newPw = "1111";
		mem.changePassword(old, newPw);

		memberDao.update(mem);
	}

	private static void insertMember() {
		System.out.println("# insert");

		Member mem = new Member("efsdfa@tebbbst", "test", "2222", LocalDateTime.now());
		memberDao.insert(mem);
		System.out.println(mem.getId());
	}
}
