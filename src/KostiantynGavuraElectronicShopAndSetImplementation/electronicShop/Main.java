package KostiantynGavuraElectronicShopAndSetImplementation.electronicShop;

public class Main {

    public static void main(String[] args) {
        Phone[] phones = new Phone[5];//Creates phone's array and phone to array

        phones[0] = new Phone("Apple", "6s", 1200, 12);
        phones[1] = new Phone("Apple", "7", 1800, 12);
        phones[2] = new Phone("Huawei", "P20", 1800, 24);
        phones[3] = new Phone("Samsung", "S9", 1500, 24);
        phones[4] = new Phone("Samsung", "S10", 2400, 32);

        System.out.println("\n-------------------------------------------------------------\n");

        for (Phone phone : phones) { //Shows with "foreach"  all phones
            phone.showDetails();
        }

        System.out.println("\n-------------------------------------------------------------\n");

        TV[] tvs = new TV[5];   //Creates tv's array and adds tvs to array

        tvs[0] = new TV("Samsung", "UN55NU6900F", 1300, 55);
        tvs[1] = new TV("Samsung", "UN70NU6070F", 2280.78, 70);
        tvs[2] = new TV("Samsung", "RU8000 Premium", 3434.3, 65);
        tvs[3] = new TV("Samsung", "UN65RU7300F", 2356.34, 65);
        tvs[4] = new TV("Samsung", "QN98Q900RBF", 156723, 98);

        for (TV tv : tvs) {
            tv.showDetails();
        }

        System.out.println("\n-------------------------------------------------------------\n");

        Client client1 = new Client("Constantine", "Gavura"); //Creates first client
        Client client2 = new Client("John", "Smith");//Creates second client
        client1.buyPhone(phones[1]);
        client1.buyPhone(phones[1]);
        client1.buyPhone(phones[1]);
        client1.buyPhone(phones[1]);
        client1.showDetails();

        System.out.println("\n-------------------------------------------------------------\n");

        client2.showDetails();

        Shop shop = new Shop("ElectronicArts"); // Creates the shop
        shop.addNewPhone(phones[0]); // Adds phones to the shop phone's list
        shop.addNewPhone(phones[1]);

        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println(shop.getPhoneById(1)); // Gets phone with ID=1 from the shop arraylist;

        System.out.println("\n-------------------------------------------------------------\n");

        client1.buyPhone(shop.getPhoneById(1)); //Buys the phone by client
        client1.showDetails();//Checks if client bought the phone must be 5 phones


    }
}
