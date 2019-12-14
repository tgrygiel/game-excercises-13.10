package Yehor.BonusGame;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Google.com");
        DotCom two = new DotCom();
        two.setName("Facebook.com");
        DotCom three = new DotCom();
        three.setName("Microsoft.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("You must sink 3 WebSites");
        System.out.println("------------------------");
        System.out.println("Google.com" + " | " + "Facebook.com" + " | " +  "Microsoft.com");
        System.out.println("------------------------");
        System.out.println("Try to sink them in the minimum number of moves");
        System.out.println("------------------------");
        System.out.println("Your must use: A, B, C, D, E, F, G  with  0, 1, 2, 3, 4, 5, 6");

        for(DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuest = helper.getUserInput("Do something...");
            checkUserGuest(userGuest);
        }
        finishGame();
    }

    private void checkUserGuest(String userGuess){
        numOfGuesses++;
        String result = "Miss";
        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Hit")){
                break;
            }
            if (result.equals("Sank")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Finish! ");
        if(numOfGuesses <= 18){
            System.out.println("It took you only " + numOfGuesses + " attempts");
        } else {
            System.out.println("It took you a lot of time. ");
            System.out.println(numOfGuesses + " attempts.");
        }
    }
}
