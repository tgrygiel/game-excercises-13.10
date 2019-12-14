package Yehor.Zadanie;

public class Client {
    private int id;
    private String name;
    private String lastname;
    private Phone[] boughtPhones;
    private int countPhone;

    public Client(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.boughtPhones = new Phone[5];
        this.countPhone = 0;
    }

    public String showDetails(){
        return " - "+name+" "+lastname+" | "+boughtPhones.toString();
    }

    public void buyPhone(Phone phone){
        if(countPhone<5){
            boughtPhones[countPhone] = phone;
//            System.out.println("Phone is bought");
            countPhone++;
        }else{
            System.out.println("Client can't buy more phones");
        }
    }
}
