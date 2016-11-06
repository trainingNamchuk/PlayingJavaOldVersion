package main;
import java.util.ArrayList;
import java.util.Random;

public class Model {
	private static int min = 0;
	private static int max = 100;
	static final int randomNum = Model.rand(min, max);
	private static int attemptNum = 0;
	static ArrayList<Integer> statistics = new ArrayList<>();

	public static int rand(int min, int max) {
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static int getMin() {
		return min;
	}

	public static int getMax() {
		return max;
	}

	public static int getNewMin(int min) {
		return Model.min = min;

	}

	public static int getNewMax(int min) {
		return Model.min = min;

	}

	public static void addStatistics(int userNum) {
		attemptNum++;
		statistics.add(attemptNum);
		statistics.add(userNum);
		statistics.add(min);
		statistics.add(max);
	}

	public static ArrayList<Integer> getStatistics() {

		return statistics;

	}

	public static boolean isGuessed(int userNum) {
		if (userNum == randomNum) {
			return true;
		} else
			return false;
	}

	public static boolean isBigger(int userNum) {
		if (userNum > randomNum) {
			return true;
		} else
			return false;
	}
}
