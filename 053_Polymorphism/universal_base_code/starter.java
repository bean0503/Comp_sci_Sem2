import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Performer[]Performer = new Performer[4];
		Performer[0] = new Performer();
		Performer[1] = new Musician();
		Performer[2] = new Apprentice();
		Performer[3] = new Actor();
		
		Performer[0].perform();
		Performer[0].practice();
		Performer[1].perform();
		Performer[1].practice();
		((Apprentice)Performer[2]).praticeAtUniversity();
		((Apprentice)Performer[2]).playInstrument();
		((Actor)Performer[3]).monologue();
		Performer[3].perform();
	}
}
