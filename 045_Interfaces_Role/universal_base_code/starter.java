import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role[]x = new Role[3];
		x[0] = new Deemo("Alice");
		x[1] = new Warrior("Garfield");
		x[2] = new Wizard("Merlin");
		System.out.println(x[0].getName());
		System.out.println(x[1].getName());
		System.out.println(x[2].getName());
		
	}
}
