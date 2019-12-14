import java.util.ArrayList;

public class Shop {
	
	private String nameShop;
	private ArrayList<Telefon> phones;
	private ArrayList<Televizor> tvs;
	
	public Shop (String name) {
		this.nameShop = name;
		phones = new ArrayList<Telefon>();
		tvs = new ArrayList<Televizor>();
	}
	
	public void addNewPhone(Telefon telefon) {
		phones.add(telefon);
	}
	
	public void addNewTv(Televizor televizor) {
		tvs.add(televizor);
	}
	
	public void getPhoneById(int phoneId) {
		int n = 0;
		for (Telefon t : phones) {
			if ( t.getID() == phoneId) {
				n++;
				System.out.println(" Szukany telefon " + t.showDetails());
				}
	     }
		if ( n == 0) {
			System.out.println(" Nie ma takiego telefonu ");
		}
	}
	

}
