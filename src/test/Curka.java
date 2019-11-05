package test;

public class Curka {
     String name;
     String lastname;
     int age;
     
     public Curka (String name , String lastname , int age ) {
    	 this.name = name;
    	 this.lastname = lastname;
    	 this.age = age;
    	
     }
     public String toString () {
    	 return "Curka ma naime " + this.name + " Nazwisko " + this.lastname + " i ma " + this.age + " lat";
     }     
}
