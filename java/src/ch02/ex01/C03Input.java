package ch02.ex01;

import java.util.Scanner;

public class C03Input {								// ���� �����Ҷ� �ڵ����� ctrl+shift+f
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Scanner ���� ������ ������ �߻��ϸ� ctrl+shift+o -> import ___ �ڵ�����
		System.out.print("���ڿ��� �Է��ϼ���.\n>");

		String input = sc.nextLine();								// alt+shift=r -> ������ ��ü����

//���� <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.
		System.out.print("<");
		System.out.print(input);
		System.out.print(">");
		System.out.println("�� ����߽��ϴ�.");
		System.out.println("<" + input + ">" + "�� ����߽��ϴ�.");
		System.out.printf("<%s>�� ����߽��ϴ�.\n", input);
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		int i2 = sc.nextInt();
		System.out.println(i + "�� �Է��߽��ϴ�.");
		
		//////////////////��////////////////��//////////////��///////////////ļ�������////////////////////////////
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.", inVal);
		
		System.out.println("���ڸ� �Է��ϼ���.\n");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		
	}
}