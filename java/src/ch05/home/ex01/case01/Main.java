package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower chang = new Flower();
		chang.name = "창포꽃";
		chang.leapLength = 7;
		chang.calyxLength = 2;

		Flower cos = new Flower();
		cos.name = "코스모스";
		cos.leapLength = 4;
		cos.calyxLength = 1;

		System.out.printf("%s은 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", chang.name, chang.leapLength, chang.calyxLength);
		System.out.printf("%s는 꽃잎 길이가 %dcm, 꽃받침 길이가 %dcm 입니다.\n", cos.name, cos.leapLength, cos.calyxLength);
	}
}

/**
 * 창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다. <br>
 * 코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.
 */