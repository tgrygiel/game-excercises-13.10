package zadanie;

public class Main {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone(90, "Polkomtel", "Galaxy A50", 14);
		System.out.println(myPhone.getModel());
		myPhone.showDetails();
		
		Phone yourPhone = new Phone(45, "Xiaomi", "Redmi Note 7", 8);
		Phone hisPhone = new Phone(2, "Samsung", "Galaxy S3", 9);
		Phone herPhone = new Phone(15, "HTC", "Desire", 6);
		Phone theirPhone = new Phone(7, "Huawei", "P10 Lite", 7);
		
		yourPhone.showDetails();
		hisPhone.showDetails();
		herPhone.showDetails();
		theirPhone.showDetails();
		
		Phone[] phoneList = new Phone[5];
		
		phoneList[0] = myPhone;
		phoneList[1] = yourPhone;
		phoneList[2] = hisPhone;
		phoneList[3] = herPhone;
		phoneList[4] = theirPhone;
		
		for(int i = 0; i <phoneList.length; i++) {
			System.out.print("Szczegó³y telefonu: ");
			phoneList[i].showDetails();
		}

		
		TV telly = new TV(1, "Samsung", "UE50RU7172", 1600);
		TV telly2 = new TV(2, "LG", "55UM7100", 3840);
		TV telly3 = new TV(3, "Sony", "KDL-40WE660", 1080);
		TV telly4 = new TV(8, "Hyundai", "FLP40T111", 2048);
		TV telly5 = new TV(17, "Sony", "TX-55GX550", 4096);
 		
		System.out.println(telly.showDetails());
		
		Client difficult = new Client(2, "Jan", "Enzym");
		Client easy = new Client(1, "Salomon", "Herbatnik");
		Shop loombard = new Shop("Zenek_Martyniuk");
		
		for (int i = 0; i < phoneList.length; i++) loombard.addNewPhone(phoneList[i]);
		
		loombard.addNewTV(telly);
		loombard.addNewTV(telly2);
		loombard.addNewTV(telly3);
		loombard.addNewTV(telly4);
		loombard.addNewTV(telly5);
		

		Phone phoneToBuy = loombard.getPhoneById(3); // null
		difficult.buyPhone(phoneToBuy); //ineffective
		
		phoneToBuy = loombard.getPhoneById(90); 
		difficult.buyPhone(phoneToBuy);
		
		easy.buyPhone(loombard.getPhoneById(7));
		
		difficult.buyPhone(loombard.getPhoneById(15));
		
		easy.buyPhone(loombard.getPhoneById(2));
		
		Set accumulation = new Set();
		
		accumulation.add("Tomek");
		accumulation.add("Natalia");
		accumulation.add("Roman");
		accumulation.add("Tomek");
		accumulation.add("Anna");
		accumulation.add("Natalia");
		accumulation.add("Anna");
		
		accumulation.remove("Anna");
		
		
		System.out.println(accumulation.toString());
		

		
	}

}
