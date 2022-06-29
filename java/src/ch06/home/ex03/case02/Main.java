package ch06.home.ex03.case02;
/*
가수가 무대에서 공연한다.
배우가 무대에서 공연한다.
 */
public class Main {
	public static void main(String[] args) {
		Singer singer = new Singer();
		Actor actor = new Actor();
		
		singer.play();
		actor.play();
	}
}
