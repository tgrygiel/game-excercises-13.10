package Yehor.Zadanie;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone(1,"Samsung","Galaxy SXXL",24);
        Phone p2 = new Phone(2,"Iphone","X",20);
        Phone p3 = new Phone(3,"Xiaomi","MI Note 10",108);
        Phone p4 = new Phone(4,"1+","NoNaMe",58);
        Phone p5 = new Phone(0,"Nokia","2801",2);
        Phone[] phones = {p1,p2,p3,p4,p5};

        for (Phone po: phones) {
            System.out.println(po.showDetails());
        }

        Tv t1 = new Tv(1,"Samsung","Alpha",52);
        Tv t2 = new Tv(2,"LG","Beta",48);
        Tv t3 = new Tv(3,"Toshyba","Delta",56);
        Tv t4 = new Tv(4,"Samsung","Omega",98);
        Tv t5 = new Tv(0,"Panasonic","Zetta",12);

        Client c1 = new Client(1,"Bill","Gates");
        Client c2 = new Client(2,"Will","Smeat");



        c1.buyPhone(p4);
        c1.buyPhone(p2);
        c1.buyPhone(p3);
        c1.buyPhone(p1);
//        c1.buyPhone(p1);
//        c1.buyPhone(p1);
//        c1.buyPhone(p1);

        Shop shop = new Shop("Amazon");
        shop.addNewPhone(p1);
        shop.addNewPhone(p2);
        shop.addNewPhone(p3);
        shop.addNewPhone(p4);
        shop.addNewPhone(p5);
        shop.addNewTv(t1);
        shop.addNewTv(t2);
        shop.addNewTv(t3);
        shop.addNewTv(t4);
        shop.addNewTv(t5);

        shop.getPhoneById(4);
        c2.buyPhone(shop.getPhoneById(3));
//        System.out.println(shop.getPhoneById(3));
        c2.buyPhone(shop.getPhoneById(1));
        c2.buyPhone(shop.getPhoneById(9));

//        --------------------------------

        Set set = new Set();
        set.add("Tomek");
        set.add("Natalia");
        set.add("Roman");
        set.add("Tomek");
        set.add("Anna");
        set.add("Natalia");
        set.add("Anna");


        set.remove("Anna");

        System.out.println(set.toString());










    }
}
