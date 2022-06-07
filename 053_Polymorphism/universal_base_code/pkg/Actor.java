package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;
	
	public Actor(){
		type = "theater";
	}
	
	public Actor(String name, String type){
		super(name);
		this.type = type;
	}
	
	public void practice(){
		System.out.println(name + " does something <3");
	}
	
	public void perform(){
		System.out.println(name + " screeches");
	}
	
	public void monologue(){
		System.out.println("I forgot what comes next");
	}
}

