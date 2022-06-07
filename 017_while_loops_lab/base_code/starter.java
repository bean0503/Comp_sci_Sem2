import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is you name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like to print your name?");
		int amount = sc.nextInt();
		
		int total;
		total = 1;
		
		while(true){
			System.out.println(name);
			if(total == amount){
				break;
			}
			total = total + 1;
		}
	}
}
