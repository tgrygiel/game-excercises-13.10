package Yehor.Zadanie;

public class Tv {
    private int id;
    private String brand;
    private String model;
    private int resolution;

    public Tv(int id, String brand, String model, int resolution) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    public String showDetails(){
        return (" | "+ brand + " "+ model +" | "+ resolution + "'");
    }


}
