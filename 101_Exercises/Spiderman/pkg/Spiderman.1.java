package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name!
	int age;			// How many times should it be printed
	String villain;		// Who's the arch nemesis of this Spiderman

	public Spiderman() {			// Default constructor!
		actor = "Tobey Maguire";
		age = 46;
		villain = "Green Goblin";
	}
	public Spiderman(String actor, int age, String villan){
		this.actor = actor;
		this.age = age;
		this.villain = villain;
	}
	public Spiderman(String actor){
		this.actor = actor;
		age = 46;
		villain = "Green Goblin";
	}
	public Spiderman(int age){
		actor = "Tobey Maguire";
		this.age = age; 
		villain = "Green Goblin";
	}
	public Spiderman(String villain){
		actor = "Tobey Maguire";
		age = 46;
		this.villain = villain;
	}
	public Spiderman(String actor, int age){
		this.actor = actor;
		this.age = age;
		villain = "Green Goblin";
	}
	public Spiderman(String actor, String villain){
		this.actor = actor;
		age = 46;
		this.villain = villain;
	}
	public Spiderman(int age, String villain){
		actor = "Tobey Maguire";
		this.age = age;
		this.villain = villain;
	}
	
	public void setActor(String actor){
		this.actor = actor;
	}	
	public String getActor(){
		return actor;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		int age = age;
	}
	
	public void setVillan(String villain){
		this.villain = villain;
	}
	public String getVillain(){
		return villain;
	}
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.


	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)



	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}

	

}
