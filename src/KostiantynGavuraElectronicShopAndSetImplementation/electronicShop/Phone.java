package KostiantynGavuraElectronicShopAndSetImplementation.electronicShop;

public class Phone {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int cameraResolution;
    private static int idCounter;

    public Phone(String brand, String model, double price, int cameraResolution) {
        this.id = ++idCounter;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.cameraResolution = cameraResolution;

    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void showDetails() {
        System.out.println(
                "Phone : ID = " + this.id +
                        ", Brand = " + this.brand +
                        ", Model = " + this.model +
                        ", Price = " + this.price + " zł" +
                        ", Camera resolution = " + this.cameraResolution + " Mpx"
        );
    }

    @Override
    public String toString() {
        return "\n" + "Phone : ID = " + this.id +
                ", Brand = " + this.brand +
                ", Model = " + this.model +
                ", Price = " + this.price +
                ", Camera resolution = " + this.cameraResolution + " Mpx";
    }
}
