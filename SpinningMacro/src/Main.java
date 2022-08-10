import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis()); // 나노
		System.out.println(System.currentTimeMillis() / 1000); // 초
		System.out.println((System.currentTimeMillis() / 1000) / 60); // 분
		System.out.println((System.currentTimeMillis() / 1000) / 60 / 60); // 시간
		System.out.println((System.currentTimeMillis() / 1000) / 60 / 60 / 24); // 일
		System.out.println((System.currentTimeMillis() / 1000) / 60 / 60 / 24 / 365); // 연
		System.out.println();

		getDays(0);

		long end = System.currentTimeMillis();

		System.out.println("duration : " + (end - start));
	}

	private static int getDays(int month) {
		LocalDateTime t = LocalDateTime.of(2022, 8, 10, 16, 55);
		System.out.println(t.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
		System.out.println(System.currentTimeMillis());
		return 0;
	}
}
