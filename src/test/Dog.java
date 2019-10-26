package test;

public class Dog {
	
		   String name;
		   String color;
		   int age;
		   
			  public Dog (String name , String color, int age) {
				  this.name = name;
				  this.age = age;
				  this.color = color;
			  }
			  
		   public String toString() {
			   return "Dog's name is " + this.name + ", he has  " + this.age + " years, and he has "+ this.color + " color";
		   }
}
