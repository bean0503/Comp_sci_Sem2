package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength;
	public int dexterity;
	public int inteligence;
	public int constitution;
	public int charisma;
	
	public myCharacter(){
		role = "Rogue";
		strength = 0;
		dexterity = 0;
		inteligence = 0;
		constitution = 0;
		charisma = 0;
	}

	public void myTostring() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your inteligence is " + inteligence);
		System.out.println("Your constitution is " + constitution);
		System.out.println("Your charisma is " + charisma);
	}

}

