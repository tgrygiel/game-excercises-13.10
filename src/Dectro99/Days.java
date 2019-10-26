package Dectro99;


public class Days {
    String month;
    int day;
	
    
    public Days(String month, int day) {
        this.month = month;
        this.day = day;
    }
	
    public String toString() {
        return "Data: " + this.month + " " + this.day;
    }

}
