import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		Warrior[]Warrior = new Warrior[100];
		while(true){
			Warrior[c] = new Warrior();
			c++;
			if(c == 100){
				break;
			}
		}
		
		c = 0;
		Wizard[]Wizard = new Wizard[100];
		while(true){
			Wizard[c] = new Wizard();
			c++;
			if(c == 100){
				break;
			}
		}
		
		int wi = 99;
		int wa = 99;
		
		while(true){
			if(Wizard[wi].isDead() == true){
				wi = wi - 1;
			}
			if(wi == -1){
				break;
			}
			Wizard[wi].attack(Warrior[wa]);
			if(Warrior[wa].isDead() == true){
				wa = wa - 1;
			}
			if(wa == -1){
				break;
			}
			Warrior[wa].attack(Wizard[wi]);
		}
		
		int survivors;
		if(wi == -1){
			System.out.println("Warriors won");
			wa = wa + 1;
			survivors = 100 - wa;
			System.out.println("There are " + survivors + " warrios left");
		}else if(wa == -1){
			System.out.println("Wizards won");
			wi = wi + 1;
			survivors = 100 - wi;
			System.out.println("There are " + survivors + " wizards left");
		}
		
	}
}
