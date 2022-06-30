package ch07.ex04.case05.service;

public class ScoreServiceImpl implements ScoreService {

	private ScoreDao scoreDao;

	public ScoreServiceImpl(ScoreDao scoreDao) {
		super();
		this.scoreDao = scoreDao;
	}

	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}

	public Score[] getScores() {
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}

	private void calcScore(Score[] scores) {
		for (Score score : scores) {
			int sum = score.getKor() + score.getEng() + score.getMath();
			score.setSum(sum);
			score.setAvg(sum / 3);
		}
	}
}
