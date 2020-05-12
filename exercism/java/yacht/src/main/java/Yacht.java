import java.util.Arrays;

class Yacht {
	int[] dice;
	YachtCategory category;

	Yacht(int[] dice, YachtCategory yachtCategory) {
		this.dice = dice;
		this.category = yachtCategory;
	}

	int score() {
		int score = 0;
		switch (category.ordinal()) {

		case 0:
			score = 50;
			break;
		case 1:
			score = (int) Arrays.stream(dice).filter(i -> i == 1).count();
			break;
		case 2:
			score = 2 * (int) Arrays.stream(dice).filter(i -> i == 2).count();
			;
			break;
		case 3:
			score = 3 * (int) Arrays.stream(dice).filter(i -> i == 3).count();
			;
			break;
		case 4:
			score = 4 * (int) Arrays.stream(dice).filter(i -> i == 4).count();
			;
			break;
		case 5:
			score = 5 * (int) Arrays.stream(dice).filter(i -> i == 5).count();
			;
			break;
		case 6:
			score = 6 * (int) Arrays.stream(dice).filter(i -> i == 6).count();
			;
			break;
		case 7:
			score = (int) Arrays.stream(dice).sum();
			;
			break;
		case 8:
			score = (int) Arrays.stream(dice).filter(i -> i == 4).count();
			;
			break;
		case 9:
			score = (int) Arrays.stream(dice).sum();
			break;
		case 10:
			score = (int) Arrays.stream(dice).sum();
			break;
		case 11:
			score = (int) Arrays.stream(dice).sum();
			break;
		}
		return score;
	}
}