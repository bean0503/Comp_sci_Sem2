import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer p1 = new Performer();
		Performer p2 = new Performer("John", 18);
		Musician m1 = new Musician();
		Musician m2 = new Musician("flute");
		System.out.println(p1.getName());
		p1.practice();
		System.out.println(p2.getName());
		p2.perform();
		System.out.println(m1.getName());
		m1.perform();
		m1.playInstrument();
		m2.practice();
		System.out.println(m2.getInstrument());
	}
}
