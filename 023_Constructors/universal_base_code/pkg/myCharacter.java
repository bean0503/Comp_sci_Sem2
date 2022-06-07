package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;

	public myCharacter() {
		role = "No role";
		 
	}
	public myCharacter(String ch){
		role = ch;
		
	}
	public void isIt(){
		if(((role.equals("Wizard"))||(role.equals("wizard")))){
			System.out.println("Wizard how magical!");
		}else if(((role.equals("Warrior"))||(role.equals("warrior")))){
			System.out.println("Warrior how fierce!");
		}else if(((role.equals("Rogue"))||(role.equals("rogue")))){
			System.out.println("Rogue how cunning!");
		}else{
			System.out.println("No role");
		}
	}
}

