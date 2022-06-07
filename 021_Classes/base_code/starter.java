import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		character wee = new character();
		System.out.println(wee.role);
		System.out.println(wee.Strength);
		System.out.println(wee.Dexterity);
		System.out.println(wee.Intelligence);
		System.out.println(wee.Constitution);
		System.out.println(wee.Charisma);
		
	}
}

class character{
	String role = new String("Wizard");
	int Strength = 5;
	int Dexterity = 6;
	int Intelligence = 4;
	int Constitution = 7;
	int Charisma = 9;
}