package KostiantynGavuraElectronicShopAndSetImplementation.setImplementation;

import static org.junit.Assert.*;

public class SetTest {
    SetInterface set = new Set();
    @org.junit.Test
    public void addAndSizeTests() {
        set.add("Tomek");
        set.add("Natalia");
        set.add("Roman");
        set.add("Tomek");
        set.add("Anna");
        set.add("Natalia");
        set.add("Anna");
        set.add("anna");
        assertSame(5, set.size());
    }

    @org.junit.Test
    public void clear() {
        set.add("Tomek");
        set.add("Natalia");
        set.add("Anna");
        assertSame(3,set.size());
        set.clear();
        assertSame(0,0);

    }

    @org.junit.Test
    public void isEmpty() {
    set.clear();
    assertTrue(set.isEmpty());
    }

    @org.junit.Test
    public void remove() {
        set.add("Tomek");
        set.add("Natalia");
        set.add("Anna");
        assertSame(3,set.size());
        set.remove("Tomek");
        assertSame(2,set.size());
    }

    @org.junit.Test
    public void contains() {
        set.add("Tomek");
        assertTrue(set.contains("Tomek"));
        assertFalse(set.contains("tomek"));
    }
}