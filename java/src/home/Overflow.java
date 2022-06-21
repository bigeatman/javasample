package home;

public class Overflow {
	
	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		
		System.out.println(c);
		
		c = a * b;
				
		System.out.println(c);
		
		c =(long) a * b;
		
		System.out.println(c);
		
		int x = a * b / a;		//³ª´°¼ÀÀ» ¿ì¼±¼øÀ§·Î ¹Ù²ãµµµÊ 
		x = a / b * a;
		
		System.out.println(x);
		
	}

}
