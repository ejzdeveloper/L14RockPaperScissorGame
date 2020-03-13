package lab14;
//Author:Jackie Zablah. Java Bootcamp
import java.util.Scanner;


public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userContinue = "";
		System.out.println("Welcome, Please enter your name: ");
		String name = scnr.next();

		UserPlayer3 user = new UserPlayer3(name, scnr);
		int opponent = 0;
		int countOpponent1 = 0;
		int countOpponent2 = 0;
		int countUser = 0;
		
		RockPlayer1 rock = new RockPlayer1("Sofy");
		RandomPlayer2 random = new RandomPlayer2("Cecilia"); 
		do {
			
			do {
				System.out.println("Choose an opponent: Sofy(1) or Cecilia(2) ");
				try {
					opponent = scnr.nextInt(); 
				}
				catch(Exception e) {
					scnr.nextLine();
				}
			}
			while(!Validation.validateOpponent(opponent));
			
			if (opponent == 1) {
				
				Roshambo playerMove = user.generateRoshambo();
				System.out.println("Your opponent " + rock.getName() + " choose: " + rock.generateRoshambo());
				System.out.println(name + " choose: " + playerMove);

				if (playerMove == Roshambo.valueOf("ROCK")) {
					System.out.println("Is a draw! both of you choose Rock!!  ");
				}else if (playerMove == Roshambo.valueOf("PAPER")) {
					System.out.println(name + " WINS! Paper beats rock");
					++countUser;
				}else if (playerMove == Roshambo.valueOf("SCISSORS")) {
					System.out.println(rock.getName() + " WINS! Rock beats scissors");
					++countOpponent1;
				}
				System.out.println("Do you want to keep playing? (y/n) ");
				userContinue = scnr.next();
				

			}else if (opponent == 2) {
				
				Roshambo randomMove = random.generateRoshambo();
				Roshambo userMove = user.generateRoshambo();
				
				System.out.println("Your opponent " + random.getName() + " choose: " + randomMove);
				System.out.println(name + " choose: " + userMove);

				if (userMove == Roshambo.valueOf("ROCK")) {
					if (randomMove == Roshambo.valueOf("ROCK")) {
						System.out.println("Is a draw! both of you choose Rock!!");
					}else if (randomMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println(name + " WINS! rock beats scissors");
						++countUser;
					}else if (randomMove == Roshambo.valueOf("PAPER")) {
						System.out.println(random.getName() + " WINS! Paper beats rock");
						++countOpponent2;
					}
				}else if (userMove == Roshambo.valueOf("PAPER")) {
					if (randomMove == Roshambo.valueOf("PAPER")) {
						System.out.println("Is a draw! both of you choose Paper");
					}else if (randomMove == Roshambo.valueOf("ROCK")) {
						System.out.println(name + " WINS! Paper beats rock");
						++countUser;
					}else if (randomMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println(random.getName() + " WINS! scissors beats paper");
						++countOpponent2;
					}
				}else if(userMove == Roshambo.valueOf("SCISSORS")) {
					if (randomMove == Roshambo.valueOf("SCISSORS")) {
						System.out.println("Is a draw! both of you choose scissors");
					}else if (randomMove == Roshambo.valueOf("PAPER")) {
						System.out.println(name + " WINS! scissors beats paper");
						++countUser;
					}else if (randomMove == Roshambo.valueOf("ROCK")) {
						System.out.println(random.getName() + " WINS! Rock beats scissors");
						++countOpponent2;
					}
				}
				System.out.println("Do you want to keep playing? (y/n) ");
				userContinue = scnr.next();
			}
			
		}//do while
		while ((userContinue.equals("y")) || (userContinue.equals("y")));
		
			System.out.println("Here are the results: "); 
			System.out.println(rock.getName() + ": wins " + countOpponent1 + " time(s)" );
			System.out.println(name + ": wins " + countUser + " time(s)");
			System.out.println(random.getName() + ": wins " + countOpponent2 + " time(s)");
		
		
	}//end main

}//end class
