package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower chang = new Flower();
		chang.name = "â����";
		chang.leapLength = 7;
		chang.calyxLength = 2;

		Flower cos = new Flower();
		cos.name = "�ڽ���";
		cos.leapLength = 4;
		cos.calyxLength = 1;

		System.out.printf("%s�� ���� ���̰� %dcm, �ɹ�ħ ���̰� %dcm �Դϴ�.\n", chang.name, chang.leapLength, chang.calyxLength);
		System.out.printf("%s�� ���� ���̰� %dcm, �ɹ�ħ ���̰� %dcm �Դϴ�.\n", cos.name, cos.leapLength, cos.calyxLength);
	}
}

/**
 * â������ ���� ���̰� 7cm, �ɹ�ħ ���̰� 2cm �Դϴ�. <br>
 * �ڽ��𽺴� ���� ���̰� 4cm, �ɹ�ħ ���̰� 1cm �Դϴ�.
 */