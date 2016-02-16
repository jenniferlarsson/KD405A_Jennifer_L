
/** The base class for all Mammals */
public abstract class Mammal extends Animal {

	private int gestationTime;
	
	/**Constructor */
	public Mammal(String latinName, int gestationTime) {
		super(latinName); 
		this.setGestationTime(gestationTime);
	}

	public int getGestationtime(){
		return getGestationTime();
	}

	public int getGestationTime() {
		return gestationTime;
	}

	public void setGestationTime(int gestationTime) {
		this.gestationTime = gestationTime;
	}
}
