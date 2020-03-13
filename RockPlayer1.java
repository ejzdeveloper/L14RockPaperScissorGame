package lab14;
//Author:Jackie Zablah. Java Bootcamp
public class RockPlayer1 extends Player {

	
	
	public RockPlayer1(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
