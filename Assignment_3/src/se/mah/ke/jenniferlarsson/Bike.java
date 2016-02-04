package se.mah.ke.jenniferlarsson;

/**
 * a bike
 *
 *
 */
public class Bike {

	int size;
	int price;
	String color;
	

	/** creates a bike and checks if color and size are correct */
	public Bike(String color, int size) {
		this.size = size;
		this.color = color;
		this.price = 0;
		
		boolean correctColor = false;
		
		if (size < Constants.MIN_SIZE || size > Constants.MAX_SIZE) {
            throw new IllegalArgumentException("The size must be between " + Constants.MIN_SIZE + " and " + Constants.MAX_SIZE); 
 		}
		for (int i = 0; i < Constants.COLORS.length; i ++) {
			if (Constants.COLORS[i].equalsIgnoreCase(color)){
				correctColor = true;
			}
		}
		if (!correctColor) {
            throw new IllegalArgumentException("The color must be approved "); 
 		}

	}
	/** creates a bike and checks if color, size and price are correct */
	public Bike(String color, int size, int price) {
		this.size = size;
		this.price = price;
		this.color = color;
		
		boolean correctColor = false;
		
		if (price < Constants.MIN_PRICE || price > Constants.MAX_PRICE) {
            throw new IllegalArgumentException("The price must be between " + Constants.MIN_PRICE + " and " + Constants.MAX_PRICE); 
 		}
		if (size < Constants.MIN_SIZE || size > Constants.MAX_SIZE) {
            throw new IllegalArgumentException("The size must be between " + Constants.MIN_SIZE + " and " + Constants.MAX_SIZE); 
 		}
		
		for (int i = 0; i < Constants.COLORS.length; i ++) {
			if (Constants.COLORS[i].equalsIgnoreCase(color)){
				correctColor = true;
			}
		}
		
		if (!correctColor) {
            throw new IllegalArgumentException("The color must be approved "); 
 		}

	}
	/** return the price of the bike */
	public int getPrice() {
		return price;
	}
	/** sets the price */
	public void setPrice(int price) {
		this.price = price;
	}
	/** get the size*/
	public int getSize() {
		return size;
	}
	/** get the color*/
	public String getColor() {
		return color;
	}
	
	
	
}

