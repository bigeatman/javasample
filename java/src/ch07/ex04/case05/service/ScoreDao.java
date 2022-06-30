package ch07.ex04.case05.service;
import java.util.ArrayList;
import java.util.List;

public class ScoreDao {

	private List<Score> list;

	public ScoreDao() {
		super();
		list = new ArrayList<>();
	}

	public void insertScore(Score score) {
		list.add(score);
	}

	public Score[] selectScores() {
		return (Score[]) list.toArray();
	}

}
