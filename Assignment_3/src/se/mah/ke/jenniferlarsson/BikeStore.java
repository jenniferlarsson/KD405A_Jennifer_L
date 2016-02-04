/**
 * 
 */
package se.mah.ke.jenniferlarsson;

import java.util.ArrayList;

/**
 * En cykelaffär, innehåller flera cyklar.
 * @author jela
 *
 */
public class BikeStore {

	/** Alla affärens cyklar */
	private ArrayList<Bike> bikes = new ArrayList<Bike>();
	
	/** Returnerar info om alla cyklar som en sträng */
	public String getAllBikes() {
		String returnString = "";
		for (int i = 0; i < bikes.size(); i ++) {
			returnString += ("bike " + (i + 1) + " är storlek " + bikes.get(i).getSize() + " och är färgen " + bikes.get(i).getColor() + " och kostar " + bikes.get(i).getPrice() +  "\n");	
		}
		return returnString;
	}
	
	/** Lägg till en ny cykel i affären */
	public void addBike(String color, int size, int price) {
		bikes.add(new Bike(color, size, price));
	}
	
}
