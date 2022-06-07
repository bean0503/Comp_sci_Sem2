import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dwarf[]dwarf = new Dwarf[100];
		int c = 0;
		while(true){
			dwarf[c] = new Dwarf();
			c++;
			if(c == 100){
				break;
			}
		}
		
		Random rand = new Random();
		int nm;
		int ae;
		c = 0;
		while(true){
			nm = rand.nextInt(7) + 1;
			if(nm == 1){
				dwarf[c].setName("Grumpy");
			}else if(nm == 2){
				dwarf[c].setName("Dopey");
			}else if(nm == 3){
				dwarf[c].setName("Doc");
			}else if(nm == 4){
				dwarf[c].setName("Happy");
			}else if(nm == 5){
				dwarf[c].setName("Bashful");
			}else if(nm == 6){
				dwarf[c].setName("Sneezy");
			}else if(nm == 7){
				dwarf[c].setName("Sleepy");
			}
			c++;
			if(c == 100){
				break;
			}
		}
		c = 0;
		while(true){
			ae = rand.nextInt(100) + 1;
			dwarf[c].setAge(ae);
			c++;
			if(c == 100){
				break;
			}
		}
		
		c = 0;
		String name;
		int age;
		while(true){
			name = dwarf[c].getName();
			age = dwarf[c].getAge();
			System.out.println("A dwarf named " + name + " is " + age + " years old");
			c++;
			if(c == 100){
				break;
			}
		}
		
		c = 1;
		name = dwarf[0].getName();
		String nameguess;
		int nam = 0;
		boolean isit;
		while(true){
			isit = dwarf[0].isSameName(dwarf[c].getName());
			if(isit){
				nam++;
			}
			c++;
			if(c == 100){
				break;
			}
		}
		System.out.println("");
		System.out.println("The name of the first dwarf is " + name + " and there are " + nam + " duplicates");
	}
}
