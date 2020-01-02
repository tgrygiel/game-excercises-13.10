package zadanie;

import java.util.ArrayList;

public class Shop {
	private String name;
	private ArrayList<Phone> phones;
	private ArrayList<TV> tvs;
	
	public Shop(String name){
		
		this.name = name;
		this.phones = new ArrayList<Phone>();
		this.tvs = new ArrayList<TV>();
	}

	public void addNewPhone(Phone phone) {
		
		phones.add(phone);
	}
	
	public void addNewTV(TV tv) {
		
		tvs.add(tv);
	}
	
	public Phone getPhoneById(int phoneId) {
		
		for(int i = 0; i < phones.size(); i++) {
			
			if(phones.get(i).getId() == phoneId) {
				
				return phones.get(i);
			}	
		}
		System.out.println("There is no phone with this id number!");
		return null;
	}

//	public Phone sellPhone(Phone phone) {
//		if (phone == null) return null;
//		if (phones.contains(phone)) {
//			phones.remove(phone);
//		} else {
//			System.out.println("This phone is unavailable now");
//			return null;
//		}
//		return phone;
//	}

}
