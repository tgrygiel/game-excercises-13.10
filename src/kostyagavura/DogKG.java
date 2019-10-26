package kostyagavura;

public class DogKG {
    private int age;
    private String name;
    private int length;

    public DogKG(int age, String name, int length) {
        this.age = age;
        this.name = name;
        this.length = length;
    }


    @Override
    public String toString() {
        return "My dog has: " + this.age + " years, " +  "He's name: " + this.name + ", He's length: " + this.length;
    }
}
