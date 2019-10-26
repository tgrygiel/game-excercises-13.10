package test;

public class HumanMK {
	String name;
	int age;
	String job;
	
	public HumanMK(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void introduce() {
		System.out.println("Hello my name is "+this.name+" I'm "+this.age+" years old and I work as "+this.job+".");
	}
	
	
}
