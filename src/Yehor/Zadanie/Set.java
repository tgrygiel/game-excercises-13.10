package Yehor.Zadanie;

import java.util.ArrayList;
import java.util.Arrays;

public class Set {
    private ArrayList<String> names;

    public Set() {
        this.names = new ArrayList<>();
    }

    public void add(String name){
        String temp = "";
        if(names.isEmpty()){
            names.add(name);
        }else {
            for (int i = 0; i<names.size(); i++) {
                if (names.get(i).equals(name)) {
                    temp = name;
                }
            }
            if(!temp.equals(name)){
                names.add(name);
            }
        }


    }

    public void remove(String s){
        names.remove(s);
    }

    public boolean hasElement(String name){
        boolean temp = false;
        for (String s:names) {
            if (s.equals(name)) {
                temp = true;
            }
        }
        return temp;
    }

    public String toString(){
        return "" + names.toString();
    }


}
