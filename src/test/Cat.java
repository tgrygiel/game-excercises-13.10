package test;

public class Cat {
	String name ;
	String breed = "ragdoll";
	String color = "white";
	int age = 4;
	
	
	
	public Cat(String name, String breed, String color, int age) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;		
	}
	
	public Cat() {
		
	}

	public String toString() {
		return this.name + " " +  this.breed + " " + this.color + " " + this.age + " ";
	}

	public void showCatData() {
	System.out.println(this.name + " " +  this.breed + " " + this.color + " " + this.age + " ");	
		
	}

}