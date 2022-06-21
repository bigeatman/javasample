package ch02.ex02;

public class C01Int {
   public static void main(String[] args) {
      // integer, decimal

      int x = 10;
      System.out.println(Integer.toBinaryString(x));

      x = 012; // octal
      System.out.println(Integer.toBinaryString(x));

      x = 0xA; // hexa
      System.out.println(Integer.toBinaryString(x));

      x = 0b1010; // binary
      System.out.println(Integer.toBinaryString(x));

      x = 1_234_567;
      System.out.println(x + 1);

      double y = 1e1;
      System.out.println(y);
   }
}