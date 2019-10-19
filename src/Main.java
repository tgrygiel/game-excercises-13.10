public class Main {
	
    public static void main(final String[] args) {
        final Player tomek = new Player("Tomek", true);
        final Player kamila = new Player("Adrianna", false);
        
        //Sparametryzuj wielkosc tablicy
        final Board board = new Board();
        System.out.println(board);
        
        System.out.println(tomek);
        System.out.println(kamila);
    }
}