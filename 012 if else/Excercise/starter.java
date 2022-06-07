import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is it raining today?(reply with yes or no)");
		String answer = sc.nextLine();
		
		if(answer == "yes")
		{
			System.out.println("Bring an umbrella with you!");
		}else{
			System.out.println("Take some sunscreen with you!");
		}
	}
}
