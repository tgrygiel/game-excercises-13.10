public class Pawn {
    String id;
    Player player;
    
    Pawn(final String id, final Player player) {
        this.id = id;
        this.player = player;
    }
    
    @Override
    public String toString() {
        return "Id Pionka: " + this.id;
    }
}