/** A cat class, extends the Mammal class. */
public class Cat extends Mammal {
	
	private int numberOfLives;

	/** The cat constructor */
	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.numberOfLives= numberOfLives;
		setFriendlyName("no name");
		
	}
	
	public int getNumberOfLives() {
		return numberOfLives;
	}
	
	public void setNumberOfLives(int i) {
		this.numberOfLives = i;
	}

	@Override
	/**Returns information about the cat as a string */
	public String getInfo() {
		return " the cat named " + getFriendlyName() + " lat " + getLatinName() + " nurses for " + getGestationTime() + " months and has "+ numberOfLives + " lives ";
	}

}
