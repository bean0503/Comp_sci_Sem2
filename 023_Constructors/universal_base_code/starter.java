import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose, Wizard, Warrior, or Rogue");
		String charac = sc.nextLine();
		myCharacter a = new myCharacter();
		a.isIt();
		myCharacter b = new myCharacter(charac);
		b.isIt();
	}
}
