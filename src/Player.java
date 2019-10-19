import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class Player
{
    String name;
    boolean color;
    Pawn[] pawns;
    
    // Maybe it is good to add board as field
    Player(final String name, final boolean color) {
        this.name = name;
        this.color = color;
        this.pawns = new Pawn[4];
        for (int index = 0; index < this.pawns.length; ++index) {
            this.pawns[index] = new Pawn(String.valueOf(name) + index, this);
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.name) + ", " + this.color + " " + Arrays.toString(this.pawns);
    }
}