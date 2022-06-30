package ch07.ex03;

import ch05.home.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);

		Console.info("Ω√¿€");

		Console.info("≥°");
	}
}
