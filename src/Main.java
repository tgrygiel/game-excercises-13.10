
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
    }
}