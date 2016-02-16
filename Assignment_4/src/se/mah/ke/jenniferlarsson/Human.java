package se.mah.ke.jenniferlarsson;

/** A human class, contains a Dog */
public class Human {

	private Dog dog;
	
	private static String name;
	
	/** Constructor */
	public Human (String name) {
		this.name = name;
	}
	
	/** Returns the human name of this human */
	public static String getName() {
		return name;
	}
	
	/** Adds a dog to this human */
	public void buyDog (Dog dog) {
		this.dog = dog;
	}
	
	/** Returns information about the human as a string */
	public String getInfo() {	
		if (dog != null) {
			return name +" äger en hund som heter "+ dog.name;
		} else {
			return name + " äger ingen hund ";
		}
	}
}
