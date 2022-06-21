package ch04.ex02;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
	
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		
		System.out.printf("%d번 줄넘기해서, 몸무게 %dkg 이 되었습니다.", jumpCnt, weight);
		
	}
}
