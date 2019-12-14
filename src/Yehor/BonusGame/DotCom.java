package Yehor.BonusGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String s){
        name = s;
    }

    public String checkYourself(String userInput){
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Sank";
                System.out.println("Ou! You sank " + name + " :-(" );
            } else {
                result = "Hit";
            }
        }
//        System.out.println(result);
            return result;
    }
}
