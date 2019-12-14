package Yehor.Zadanie;

public class Phone {
    protected int id;
    private String brand;
    private String model;
    private int cameraResolution;

    public Phone(int id, String brand, String model, int cameraResolution) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.cameraResolution = cameraResolution;
    }

    public int getId() {
        return id;
    }

    public String showDetails(){
        return (" | "+ brand + " "+ model +" | "+ cameraResolution + "-mp");
    }


}
