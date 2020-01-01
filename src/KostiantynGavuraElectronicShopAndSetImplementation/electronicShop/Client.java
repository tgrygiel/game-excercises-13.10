package KostiantynGavuraElectronicShopAndSetImplementation.electronicShop;

import java.util.Arrays;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private Phone[] boughtPhones;
    private static int idCounter;
    private static int phoneCounter;

    public Client(String firstName, String lastName) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.boughtPhones = new Phone[5];
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Phone[] getBoughtPhones() {
        return boughtPhones;
    }

    public void buyPhone(Phone phone) {
        int maxboughtPhones = 5;
        if (phoneCounter == maxboughtPhones) {
            System.out.println("Client can't buy more phones");
        } else {
            boughtPhones[phoneCounter] = phone;
            phoneCounter++;
        }
    }

    public void showDetails() {
        System.out.println(
                "Client : ID = " + this.id +
                        ", Name = " + this.firstName +
                        ", Last name = " + this.lastName +
                        ", client's phones = " + Arrays.toString(boughtPhones)
        );
    }
}
