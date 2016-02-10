
/*A dog class, describes a dog. */
public class Dog extends Mammal{
	private boolean stupid;

	/* Constructor */
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName("no name");
	}
	/* Constructor that also sets the friendly name of the dog, Hugo is a good friendly name for a dog. */
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super(latinName, gestationTime);
		setFriendlyName(friendlyName);
		this.stupid = stupid;
	}
	
	/* Is the dog stupid? This function will tell you! */
	public boolean isStupid(){
		return stupid;
	}

	@Override
	/* Returns the information about the dog as a string */
	public String getInfo() {

		String stupidStatus;
	
		if (stupid) {
			stupidStatus = "stupid";
		} else {
			stupidStatus = "not stupid";
		}
		
		return " the dog named " + getFriendlyName() + " lat " + getLatinName() + " nurses for " + getGestationTime() + " months and is "+ stupidStatus;
	}
}
