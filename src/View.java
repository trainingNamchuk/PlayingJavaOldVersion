package main;
import java.util.ArrayList;

public class View {

	View() {
		System.out.println(
				"Welcome to the game!\nWe have picked a number between 0 and 100, try to guess it, we wish you good luck!;)");

	}

	public static void printMessageBigger(int userNum) {
		System.out.println("The number is bigger than " + userNum);
	}

	public static void printMessageSmaller(int userNum) {
		System.out.println("The number is  smaller than " + userNum);
	}

	public static void printRange(int min, int max) {
		System.out.println("The number is in range from " + min + " to " + max);
	}
	public static void printWrongInput(){
		System.out.println("Enter only integer numbers!");
	}

	public static void printResult(ArrayList<Integer> statistics) {
		System.out.println("Congratulations! You won!");
		System.out.println("N User_number From      To");
		for (int i = 0; i < statistics.size(); i += 4) {
			System.out.println(statistics.get(i) + "\t" + statistics.get((i + 1)) + "\t" + statistics.get((i + 2))
					+ "\t" + statistics.get((i + 3)));
		}
	}
}
