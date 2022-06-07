import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor
		
		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
		
		Pet [] pet = new Pet[10];
		
		pet[0] = new Teenager(17);
		pet[1] = new Teenager(true);
		pet[2] = new Teenager("Helly");
		pet[3] = new Teenager("Gale", true);
		pet[4] = new Teenager("Ash", 15, false);
		pet[5] = new Rock(108);
		pet[6] = new Rock(true);
		pet[7] = new Rock("Sage");
		pet[8] = new Rock("Rocky", true);
		pet[9] = new Rock("Sheam", 190, false);
		
		int c = 0;
		while(true){
			pet[c].trick();
			c++;
			if(c == pet.length){
				break;
			}
		}
	}
}