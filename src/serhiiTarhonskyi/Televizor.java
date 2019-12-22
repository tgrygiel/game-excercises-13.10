
public class Televizor {
	
	private int id;
	private String mark;
	private String model;
	private double price;
	private double screenResolution;
	
	public Televizor (int id, String mark, String model, double price, double screenResolution ) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.price = price;
		this.screenResolution = screenResolution;
		
	}
	
	public String showDetails() {
		return ("ID Televizoru: " + id + "\n" + "Marka Televizoru: " + mark + "\n" + 
	            "Model Televizoru: " + model + "\n" + "Cena Televizoru: " + price + " zl"  
	            + "\n" + "Rozdzielczoœæ ekranu : " + screenResolution + " cali " + "\n");
	}

}
