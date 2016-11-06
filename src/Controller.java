package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {


	public Controller() {
	}

	public void startGame() {
		int userNum = -1;
		while (Model.isGuessed(userNum) != true) {
			try{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			userNum = scan.nextInt();
			}
			catch (InputMismatchException e){
				View.printWrongInput();
			}
			Model.addStatistics(userNum);
			if (Model.isBigger(userNum) != true) {
				View.printMessageBigger(userNum);
				Model.getNewMin(userNum);
				View.printRange(Model.getMin(), Model.getMax());
			}
			if (Model.isBigger(userNum)) {
				View.printMessageSmaller(userNum);
				Model.getNewMax(userNum);
				View.printRange(Model.getMin(), Model.getMax());
			}
		}
		View.printResult(Model.getStatistics());

	}

}
