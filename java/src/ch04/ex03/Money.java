package ch04.ex03;

public class Money {
	public static void main(String[] args) {
	int targetPrice = 30000;
	int currentMoney = 0;
	String format = "%d���� ���½��ϴ�.\n";
	
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

     System.out.printf("%d���� ���½��ϴ�.", currentMoney);
     
  }
}


/*
 * ����] 3����¥�� ���ǰ��� ġ���. <br> 
 * ������ 5�������� ����. <br> 
 * ���� ���� ��(����)�� �������� �ʴ´�. <br> 
 * �������� ���� ������ ������. <br> 
 * �ѹ��� 3���� ���ϸ� ������. <br> 
 * ����������, ���� �ݾ��� ����Ѵ�. <br>
 */