package se.mah.ke.jenniferlarsson;

public class House {
	
	
	private int yearBuilt;
	private int size;
	private final int minSize = 10;
			
	public House(int yearBuilt, int size) { 
 		this.size = size;
 		this.yearBuilt = yearBuilt;

 		if (size < minSize || size > 1000) {
            throw new IllegalArgumentException("The size must be between " + minSize + " and 1000kvm"); 
 		}
 		if (yearBuilt < 1800 || yearBuilt > 2015){
 			throw new IllegalArgumentException("must be built between 1800 and 2015"); 
 		}
	}
	
	public int getYearBuilt() {
		return this.yearBuilt;				
	}
	
	public int getSize() { 
		return this.size;
	}	 
}
