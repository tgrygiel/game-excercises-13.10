
public class Klient {
	
	private int id;
	private String firstName;
	private String secondName;
	private Telefon[] boughtPhones;
	
	public Klient(int id, String firstName, String secondName ) {
		this.boughtPhones = new Telefon[5];
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public void buyPhone(Telefon Phone) {
		for (int i = 0; i < 5; i++) {
			if (boughtPhones[i]==null) { 
				boughtPhones[i] = Phone;
				Phone = null;
			}
			else {
				System.out.println("Klient nie mo¿e kupiæ wiêcej telefonów");
			}
		}
		
	}
	
	public String showDetails() {
		return "Id klienta: " + id + "\n" +
	           "Imie klienta: " + firstName + "\n" +
				"Nazwisko klienta: " + secondName + "\n" +
	           "Lista telefonów: " + "\n" +
	           this.boughtPhones.toString();
	}

}
