import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Apprentice a1 = new Apprentice();
		Apprentice a2 = new Apprentice("HHS", 2);
		Apprentice a3 = new Apprentice("drums", "GHS", 3);
		Apprentice a4 = new Apprentice("John", 15, "piccolo", "Clark", 4);
		a1.playInstrument();
		a2.practice();
		a3.perform();
		a4.praticeAtUniversity();
	}
}
