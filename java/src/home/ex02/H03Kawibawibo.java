package home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
   public static void main(String[] args) {
      String kawi = "����";
      String bawi = "����";
      String bo = "��";
      String winStr = "You win";
      String looseStr = "You lose";

      System.out.println("1: ����, 2: ����, 3:��");
      int selected = new Scanner(System.in).nextInt();
      int generated = ((int) (Math.random() * 10)) % 3 + 1;
      boolean isUserWin = false;

      String selectedStr;
      String generatedStr;

      switch (selected) {
      case 1:
         selectedStr = kawi;
         break;
      case 2:
         selectedStr = bawi;
         break;
      case 3:
         selectedStr = bo;
         break;
      default:
         return;
      }

      switch (generated) {
      case 1:
         generatedStr = kawi;
         break;
      case 2:
         generatedStr = bawi;
         break;
      case 3:
         generatedStr = bo;
         break;
      default:
         System.out.println(generated);
         return;
      }

      System.out.printf("You : %s\nMe : %s\n", selectedStr, generatedStr);

      if (selected == generated) {
         System.out.println("Fair");
         return;
      } else if (selected == 1 && generated == 3) {
         isUserWin = true;
      } else if (selected == 2 && generated == 1) {
          isUserWin = true;
      } else if (selected == 3 && generated == 2) {
          isUserWin = true;
      }

       if (isUserWin) {
          System.out.println(winStr);
      } else {
          System.out.println(looseStr);    
      }
   }
}
  

/* ����]
�۰� ������������ �϶�
���� ����� �˷��ش�.
�����
You win.
You lose.
Fair.
���� �ϳ��̴�.
---
1. ����, 2.����, 3.��
> 1
You : ����
Me : ��
*/