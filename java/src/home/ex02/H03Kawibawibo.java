package home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
   public static void main(String[] args) {
      String kawi = "가위";
      String bawi = "바위";
      String bo = "보";
      String winStr = "You win";
      String looseStr = "You lose";

      System.out.println("1: 가위, 2: 바위, 3:보");
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
  

/* 과제]
앱과 가위바위보를 하라
게임 결과를 알려준다.
결과는
You win.
You lose.
Fair.
중의 하나이다.
---
1. 가위, 2.바위, 3.보
> 1
You : 가위
Me : 보
*/