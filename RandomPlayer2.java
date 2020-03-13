package lab14;
//Author:Jackie Zablah. Java Bootcamp
public class RandomPlayer2 extends Player{

	public RandomPlayer2(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		Roshambo objects[] = Roshambo.values();
		return objects[(int) (Math.random() * 3)];
	}

}
