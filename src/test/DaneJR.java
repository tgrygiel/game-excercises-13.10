package test;

public class DaneJR {	
		
		String brand;
		String model;
		String color;
		double engineCapacity;
		
		DaneJR(final String brand, final String model, final String color, final double engineCapacity) {
			
			this.brand = brand;
			this.model = model;
			this.color = color;
			this.engineCapacity = engineCapacity;
		}
		
		void showCarData() {
			System.out.println(this.brand + ", " + this.model + ", " + this.color + ", " + this.engineCapacity);
		}
		public String toString() {
			return this.brand + ", " + this.model + ", " + this.color + ", " + this.engineCapacity;
			
		}
		 
}


