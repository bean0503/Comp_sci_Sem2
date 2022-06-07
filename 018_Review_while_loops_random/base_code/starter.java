import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int number;
		number = rand.nextInt(1000);
		int correct;
		correct = number + 1;
		
		while(true){
			System.out.println("Guess a number between 1 and 1000");
			int guess = sc.nextInt();
			if(guess == correct){
				break;
			}
			System.out.println("Try again");
		}
		System.out.println("YAY you got it");
	}
}
