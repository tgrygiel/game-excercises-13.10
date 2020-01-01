package KostiantynGavuraElectronicShopAndSetImplementation.electronicShop;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Phone> phones;
    private ArrayList<TV> tvs;

    public Shop(String name) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.tvs = new ArrayList<>();
    }

    public void addNewPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void addNewTV(TV tv) {
        this.tvs.add(tv);
    }

    public Phone getPhoneById(int phoneId) {
       Phone result = null;
       for (Phone phone:phones){
           if (phone.getId()==phoneId)
               result = phone;
       }
       if (result==null) System.out.println("There is no phone with this id");
       return result;
    }

}

