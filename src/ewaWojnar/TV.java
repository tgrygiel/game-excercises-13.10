package zadanie;

public class TV {

	private int id;
	private String brand;
	private String model;
	private int resolution;
	
	TV(int id, String brand, String model, int resolution){
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.resolution = resolution;
	}
	
	public String showDetails() {
		
		return "Marka telewizora: " + this.brand + ", model: " + this.model + ", rozdzieczoœæ: " + this.resolution + ", identyfikator: " + this.id;
	}
}
