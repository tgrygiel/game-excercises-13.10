package zadanie;

import java.util.ArrayList;

public class Client {

	private int id;
	private String name;
	private String lastName;
	private ArrayList<Phone> boughtPhones;
	
	Client(int id, String name, String lastName){
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.boughtPhones = new ArrayList<Phone>();
	}
	
	public String showDetails() {
		
		return "\n" + "Numer klient: " + this.id + ", Imiê: " +  this.name + ", nazwisko: " + this.lastName;
	}
	
	public void buyPhone(Phone phone) {
		if(phone == null) return;
		
		if(boughtPhones.size() < 5) {
			
			boughtPhones.add(phone);
			System.out.println("You have successfully purchased a telephone -" + phone.getBrand() + " " + phone.getModel() + "-!");
		} else {
			System.out.println("You cannot have more phones than 5!");
		}
	}
}
