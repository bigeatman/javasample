package ch07.ex04.case05.test;

public class Score {

	private int kor;

	private int eng;

	private int mat;

	public Score(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
