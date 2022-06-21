package ch04.ex03;

public class Money {
	public static void main(String[] args) {
	int targetPrice = 30000;
	int currentMoney = 0;
	String format = "%d원을 꺼냈습니다.\n";
	
	while (currentMoney < 30000) {
        int kind = (int) (Math.random() * 10) % 3;
        int popMoney = 0;

        if (kind == 0) {
           popMoney = 1000;
        } else if (kind == 1) {
           popMoney = 5000;
        } else if (kind == 2) {
           popMoney = 10000;
        }

        System.out.printf(format, popMoney);
        currentMoney += popMoney;
        
     }

     System.out.printf("%d원을 꺼냈습니다.", currentMoney);
     
  }
}


/*
 * 과제] 3만원짜리 물건값을 치뤄라. <br> 
 * 지갑에 5만원권은 없다. <br> 
 * 꺼낸 돈의 권(졸류)을 구별하지 않는다. <br> 
 * 지갑에서 지폐를 여러번 꺼낸다. <br> 
 * 한번에 3만원 이하를 꺼낸다. <br> 
 * 꺼낼때마다, 꺼낸 금액을 출력한다. <br>
 */