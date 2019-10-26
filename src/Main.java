import test.ClothesKCH;
import test.TestTomekG;

public class Main {
	
    public static void main(final String[] args) {
        final Player tomek = new Player("Tomek", true);
        final Player kamila = new Player("Kamila", false);
        
        //Sparametryzuj wielkosc tablicy
        Board board = new Board();
        System.out.println(board);
        
        tomek.makeAMove(1, 2, 1, board);
        kamila.makeAMove(2, 2, 0, board);
        System.out.println(board);
        
        
        
        System.out.println(tomek);
        System.out.println(kamila);
        
        
        //test SYSO
        System.out.println();
        
        
        
        
        
        
        
        
        
        // Tests classes
        TestTomekG testObjectTomeksClass =  new TestTomekG("Tomek");
        System.out.println(testObjectTomeksClass);
        
        //	kasiachy
        
        ClothesKCH dress = new ClothesKCH("dress", "beige", 34, 179.70);
        dress.showDetails();
        System.out.println();
        
        String x = dress.toString();
        System.out.println(x);
        
        ClothesKCH jacket = new ClothesKCH("jacket", "black", 36, 299.90);
        System.out.println(jacket);
        ClothesKCH skirt = new ClothesKCH("skirt", "snake print", 34, 119.90);
        System.out.println(skirt);
        ClothesKCH shirt = new ClothesKCH("shirt", "white", 36 , 19.90);
        System.out.println(shirt);
    }
    
    
    
    	
    	
}