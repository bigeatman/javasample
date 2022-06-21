package ch04.ex04;

import java.util.Scanner;

public class C05Calculator {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int a = 0;
      int b = 0;

      String aStr = "";
      String bStr = "";
      String op = "";

      boolean isGood = false;
      int result = 0;
      String isRepeat = "";

      do {
         do {
            System.out.print("a : ");
            aStr = scan.nextLine();
            if (aStr.length() == 1 && '0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
               isGood = true;
               a = Integer.parseInt(aStr);
            } else
               System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
         } while (!isGood);

         do {
            isGood = false;
            System.out.print("op :");
            op = scan.nextLine();
            if (op.length() == 1 && (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
               isGood = true;
            } else {
               System.out.println("ERROR] +, -, *, / 중에 하나를 입력하세요.");
            }
         } while (!isGood);
         do {
            isGood = false;
            System.out.print("b : ");
            bStr = scan.nextLine();
            if (bStr.length() == 1 && '0' < bStr.charAt(0) && bStr.charAt(0) <= '9') {
               isGood = true;
               b = Integer.parseInt(bStr);
            } else
               System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
         } while (!isGood);

         switch (op) {
         case "+":
            result = a + b;
            break;
         case "-":
            result = a - b;
            break;
         case "*":
            result = a * b;
            break;
         case "/":
            result = a / b;
            break;
         }

         System.out.printf("%d %s %d = %d\n", a, op, b, result);
         System.out.print("계속하시겠습니까?(y/n)");
         char selected = scan.nextLine().charAt(0);

         if (selected == 'y') {
            continue;
         } else if (selected == 'n') {
            break;
         }
      } while (isRepeat.equalsIgnoreCase("y"));
      
      System.out.println("끝.");
   }
}