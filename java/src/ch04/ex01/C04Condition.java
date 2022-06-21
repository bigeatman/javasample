package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		 if (0 < a && a < 4) {
	         System.out.println("good");
	      }

	      char b = 'b';
	      if ('a' < b && b < 'c') {
	         System.out.println("good");
	      }
	      
	      int x = 0;
	      int y = 0;
	      if ((x = 1 + 2) > 0 || (y = 1 - 2) > 0) {
	    	  System.out.printf("x : %d, y : %d\n", x, y);
	      }
	      
	      /** 과제]
	        s값이 he, HE, He, hE 중의 하나면, he를 말하라.
	       **/
	      
	      String s = "he";
	      if (s.equalsIgnoreCase("HE")) {
	    	  System.out.println("he");
	      }
	      
	      /** 과제]
	        값이 있으면, 값이 있다.를 말하라
	       */
	      
	     // s = "a";
	      if (s.equals("")) {
	    	  System.out.println("값이 있다");
	      }
	      
	      if(s.isEmpty()) {
	    	  System.out.println("값이 없다");
	      }
	   }
	}