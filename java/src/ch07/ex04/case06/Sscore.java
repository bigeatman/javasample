package ch07.ex04.case06;

public class Sscore {
	private ScoreService scoreSerice;

	public ScoreIo(ScoreService scoreService)	{
		this.scoreService = scoreService;
}
	public void play()	{
		Score[] scores = scoreService.getScores();
		
		for(Score score: scores)
			System.out.println(score);
	}
}
