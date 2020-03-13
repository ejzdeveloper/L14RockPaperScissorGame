package lab14;
//Author:Jackie Zablah. Java Bootcamp
public abstract class Player {
	
	private String name;
	

	public Player(String name) {
		super();
		this.setName(name);
	}


	public abstract Roshambo generateRoshambo();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
