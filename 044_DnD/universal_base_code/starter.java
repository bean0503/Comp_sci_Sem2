import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Warrior warrior = new Warrior("Leviathen");
		Wizard wizard = new Wizard("Alice");
		Deemo deemo = new Deemo("Composer");
		
		System.out.println(warrior.getName());
		System.out.println(wizard.getName());
		System.out.println(deemo.getName());
	}
}
