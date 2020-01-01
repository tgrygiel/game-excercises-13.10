package KostiantynGavuraElectronicShopAndSetImplementation.electronicShop;

public class TV {
    private int id;
    private String brand;
    private String model;
    private double price;
    private int resolution;
    private static int idCounter;

    public TV(String brand, String model, double price, int resolution) {
        this.id = ++idCounter;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.resolution = resolution;
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

    public int getResolution() {
        return resolution;
    }
    public void showDetails() {
        System.out.println(
                "TV : ID = " + this.id +
                        ", Brand = " + this.brand +
                        ", Model = " + this.model +
                        ", Price = " + this.price + " zł " +
                        ", Screen resolution = " + this.resolution + "\""
        );
    }
}
