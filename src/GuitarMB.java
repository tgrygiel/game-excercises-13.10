public class GuitarMB {
	
	String brand;
	String model;
	String pickupType;
	String color;
	int numberOfStrings;
	
	GuitarMB (String newBrand, String model, String pickupType, String color, int numberOfStrings ){
		this.brand = newBrand;
	    this.model = model;
	    this.pickupType = pickupType;
	    this.color = color;
	    this.numberOfStrings = numberOfStrings;
	}
	void showGuitarData() {
		System.out.println("Brand: " + this.brand +" Model: " + this.model + " Pickup Type: " + this.pickupType + 
				" Color: " + this.color + " Number of strings: " + this.numberOfStrings);	
	}
	
    // GuitarMB guitarFender = new GuitarMB ("Fender", "Stratocaster", "Single Coil", "White", 6);
   // guitarFender.showGuitarData();
	

}
