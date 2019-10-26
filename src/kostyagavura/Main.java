package kostyagavura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write dog's name:");

        String name = reader.readLine();
        System.out.println("Write dog's age:");

        int age = Integer.parseInt(reader.readLine());
        System.out.println("Write dog's length:");

        int length = Integer.parseInt(reader.readLine());
        DogKG dogKG = new DogKG(age, name, length);
        System.out.println(dogKG);
        reader.close();
    }
}
