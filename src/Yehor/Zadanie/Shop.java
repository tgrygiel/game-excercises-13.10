package Yehor.Zadanie;

import java.io.IOException;
import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Phone> phones;
    private ArrayList<Tv> tvs;

    public Shop(String name) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.tvs = new ArrayList<>();
    }

    public void addNewPhone(Phone phone){
        phones.add(phone);
    }
    public void addNewTv(Tv tv){
        tvs.add(tv);
    }

    public Phone getPhoneById(int pId){
//        if(phones.get(pId) != null){
//            return phones.get(pId);
//        }else {
//            System.out.println("Sorry, I didn't find it");
//        }

//        try{
//                return phones.get(pId);
//        }
//        catch (Exception e){
//            System.out.println("Sorry, I can't do this");
//        }

        Phone temp = null;



        for (int i = 0; i < phones.size(); i++) {
            if(phones.get(i).getId() == pId){
               temp = phones.get(i);
            }
        }

        if (temp == null){
            System.out.println("Sorry, I didn't find it ");
        }
        return temp;

    }
}

