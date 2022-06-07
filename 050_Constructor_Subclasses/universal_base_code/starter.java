import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Musician m1 = new Musician("joe", "flute");
		System.out.println(m1.getName());
		m1.practice();
		m1.getInstrument();
		Musician m2 = new Musician("dan", 22, "clarinet");
		System.out.println(m2.getName());
		m2.perform();
		m2.playInstrument();
	}
}
