
public class Telefon {
	
	private int id;
	private String mark;
	private String model;
	private double price;
	private double cameraResolution;
	
	public Telefon (int id, String mark, String model, double price, double camera ) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.price = price;
		this.cameraResolution = camera;
		
	}
	
	public int getID() {
		return id;
	}
	
	public String showDetails() {
		return ("ID telefonu: " + id + "\n" + "Marka telefonu: " + mark + "\n" + 
	            "Model telefonu: " + model + "\n" + "Cena telefonu: " + price + " zl"  
	            + "\n" + "Aparat: " + cameraResolution + " mp " + "\n");
	}
	


}
