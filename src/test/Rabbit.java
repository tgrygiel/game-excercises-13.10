package test;

public class Rabbit {
	
	String color;
	int bristleLength;
	int speed;
	String eyeColor;
	
	
	
	public Rabbit(String kolory, int futerko, int szybkosc, String kolorOczku){
		this.color = kolory;
		this.bristleLength = futerko;
		this.speed = szybkosc;
		this.eyeColor = kolorOczku;
		
	}
	
	public void rabbitParameters() {
		
		System.out.println("Kolor krolika to  " + this.color + " jego d³ugosc wlosia to " + this.bristleLength + " szybkosc: " + this.speed + " a kolor oczu " + this.eyeColor);
	}
	
	public String toString() {
		return "Szybkosc królika: " + this.speed;
	}
}
