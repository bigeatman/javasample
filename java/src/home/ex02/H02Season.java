package home.ex02;

import java.util.Scanner;

public class H02Season {
   public static void main(String[] args) {
      int month = 0;
      String season = "";
      Scanner sc = new Scanner(System.in);

      System.out.print("월 : ");
      month = sc.nextInt();

      if (3 <= month && month <= 5) {
         season = "봄";
      } else if (6 <= month && month <= 8) {
         season = "여름";
      } else if (9 <= month && month <= 11) {
         season = "가을";
      } else if (12 <= month && month <= 2) {
         season = "겨울";
      }

      System.out.printf("%d월은 %s입니다.", month, season);

   }
}

/*
ch04.ex02.C04Season 을 refactoring한다.
switch를 if 로 바꾼다.
존재하지 않는 월을 입력한 경우를, 예외처리한다.
*/		