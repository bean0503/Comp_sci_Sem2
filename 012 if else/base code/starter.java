import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int real = rand.nextInt(1000);
		int answer;
		answer = real + 1;
		
		System.out.println("Guess a number from 1 to 1000");
		int guess = sc.nextInt();
		
		if(guess == answer)
		{
			System.out.println("🌟You guessed correctly🌟");
		}else{
			System.out.println("👾GAME OVER👾");
		}
	}
}
