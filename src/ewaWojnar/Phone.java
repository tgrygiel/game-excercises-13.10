package zadanie;

public class Phone {
	
	private int id;
	private String brand;
	private String model;
	private int cameraResolution;
	
	Phone(int id, String brand, String model, int cameraResolution){
		
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cameraResolution = cameraResolution;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getId() {
		return this.id;
	}
	public String getModel() {
		return this.model;
	}
	
	public int getResolution() {
		return this.cameraResolution;
	}
	
	public void showDetails() {
		System.out.println("Marka telefonu: " + this.brand  + ", model: " +  this.model + ", rozdzieczoœæ aparatu: " + this.cameraResolution);
	}

}
