package KostiantynGavuraElectronicShopAndSetImplementation.setImplementation;


public class Set implements SetInterface {

    private java.util.ArrayList<String> list;

    Set() {
        list = new java.util.ArrayList<>();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public boolean add(String elem) {
        boolean consist = false;
        for (String element : list) {
            if (element.equals(elem)) {
                consist = true;
                break;
            }
        }
        if (!consist) list.add(elem);
        return true;
    }

    public boolean remove(String elem) {
        list.remove(elem);
        return true;
    }

    public boolean contains(String elem) {

        return list.contains(elem);
    }

    @Override
    public String toString() {
        return "Set{" + list.toString() +
                '}';
    }
}
