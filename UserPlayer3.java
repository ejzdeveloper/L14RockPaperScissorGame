package lab14;
//Author:Jackie Zablah. Java Bootcamp
import java.util.Scanner;

public class UserPlayer3 extends Player{
	private Scanner scnr;


	public UserPlayer3(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;

	}

	@Override
	public Roshambo generateRoshambo() {

		int choice = 0;
		do {
			System.out.println ("\nSelect an object: 1(ROCK) 2(PAPER) or 3(SCISSORS) ");
			try {
			choice = scnr.nextInt();
			}
			catch(Exception e) {
				scnr.nextLine();
	
			}
		}
		while(!Validation.validateObject(choice));
		Roshambo objects[] = Roshambo.values();
		return objects[choice - 1];
	}

}
