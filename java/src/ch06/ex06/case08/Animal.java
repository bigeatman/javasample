package ch06.ex06.case08;

public interface Animal {
	default void eat() { // 디폴드 메서드, 인터페이스에서 쓰임
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
