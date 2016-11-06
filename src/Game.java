package main;
import main.Model;
import main.Controller;
import main.View;

/**
 * Created by Svitlana Namchuk
 */
public class Game {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		main.Controller controller = new Controller();
		controller.startGame();
	}
	
}
