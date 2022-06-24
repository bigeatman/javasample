
public class RPS {

	private static String WIN = "Win";

	private static String DRAW = "Draw";

	private static String LOOSE = "LOOSE";

	private static String KAWI = "가위";

	private static String BAWI = "바위";

	private static String BO = "보";

	private int kind;

	private String str;

	public RPS(int kind) {
		super();
		this.kind = kind;
		this.str = getStr(this.kind);
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	private static String getStr(int kind) {
		switch (kind) {
		case 0:
			return KAWI;
		case 1:
			return BAWI;
		case 2:
			return BO;
		default:
			return null;
		}
	}

	public static RPS getRandom() {
		int random = (int) (Math.random() * 10) % 3;
		return new RPS(random);
	}

	public static String verseResult(RPS player, RPS ai) {
		int playKind = player.getKind();
		int aiKind = ai.getKind();
		boolean playerWin = false;

		if (playKind == aiKind) {
			return DRAW;
		} else if (playKind == 0) {
			playerWin = aiKind == 1 ? false : true;
		} else if (playKind == 1) {
			playerWin = aiKind == 2 ? false : true;
		} else if (playKind == 2) {
			playerWin = aiKind == 0 ? false : true;
		}

		if (playerWin) {
			return WIN;
		} else {
			return LOOSE;
		}
	}
}
