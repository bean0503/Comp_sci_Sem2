import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii a = new Ascii();
		Ascii b = new Ascii("dog");
		Ascii c = new Ascii("cactus", 2);
		Ascii d = new Ascii("Other", "Semi", 3);
		a.printArt();
		b.printArt();
		c.printArt();
		d.printArt();
		
	}
}
