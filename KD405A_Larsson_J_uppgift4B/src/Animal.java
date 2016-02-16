
/** The animal class, base class for all living beings */
public abstract class Animal {
	
	private String latinName;
	private String friendlyName;
	
	/**Constructor */
	public Animal(String latinName) {
		this.setLatinName(latinName);
	}
	
	/** Returns the information about this animal */
	public abstract String getInfo();
	
	public void setFriendlyName (String friendlyName){
		this.friendlyName= friendlyName;
	}
	public String getFriendlyName(){
		return friendlyName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
}
