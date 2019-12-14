import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Telefon phone1 = new Telefon(12345, "Xiaomi", "Redmi 7A 2/16GB", 399, 12);
		Telefon phone2 = new Telefon(12323, "Samsung", "Galaxy A10 SM-A105F", 629, 13);
		Telefon phone3 = new Telefon(17889, "Samsung", "Galaxy A40 SM-A405F", 1079, 16);
		Telefon phone4 = new Telefon(16777, "Motorola", "One Vision 4/128GB DS", 1199, 48);
		Telefon phone5 = new Telefon(19375, "Huawei", "Y6 2019", 499, 13);
		
		Telefon[] phones = new Telefon[5];
		phones[0] = phone1;
		phones[1] = phone2;
		phones[2] = phone3;
		phones[3] = phone4;
		phones[4] = phone5;
		
		for (int i = 0 ; i < phones.length ; i++ ) {
			System.out.println(phones[i].showDetails());
		}
		
		Televizor tv1 = new Televizor(23761,"LG","55UM7100",2249,55 );
		Televizor tv2 = new Televizor(25671,"Samsung","UE55RU7102K",2299,55 );
		Televizor tv3 = new Televizor(29034,"Philips ","50PUS6554/12",1599,50 );
		Televizor tv4 = new Televizor(23401,"Samsung ","UE55RU8002U",3099,55 );
		Televizor tv5 = new Televizor(24579,"Samsung","UE70RU7092U",3799,70 );
	
		Klient kl1 = new Klient(16041993,"Hania","Mrozkievicz");
		Klient kl2 = new Klient(24051999,"Michal","Dartok");
		
		Shop shop = new Shop("Android");
		shop.addNewPhone(phone1);
		shop.addNewPhone(new Telefon (1,"Xiaomi","Redmi Note 8 Pro 6/128GB",1199,64));
		shop.addNewPhone(phone5);
		
		shop.addNewTv(tv1);
		shop.addNewTv(tv3);
		shop.addNewTv(tv4);
		
		shop.getPhoneById(1);
		shop.getPhoneById(12345);
		shop.getPhoneById(19375);
		
		Set set = new HashSet();
		set.add("Tomek");
		set.add("Natalia");
		set.add("Roman");
		set.add("Tomek");
		set.add("Anna");
		set.add("Natalia");
		set.add("Anna");
	    set.remove("Anna");
	    System.out.println(set);
		
	}

}
