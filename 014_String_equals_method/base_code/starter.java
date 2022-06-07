import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String role = new String("");
		
		int apply = rand.nextInt(3);
		if(apply == 0){
			role = "Wizard";
		}else if(apply == 1){
			role = "Warrior";
		}else if(apply == 2){
			role = "Rogue";
		}
		
		System.out.println(role);
		
		System.out.println("What role do you choose?(Choose from Wizard, Warrior, or Rogue)");
		String guess = sc.nextLine();
		
		String answer = new String("");
		if(guess.equals("wizard")){
			answer = "Wizard";
		}else if(guess.equals("warrior")){
			answer = "Warrior";
		}else if(guess.equals("rogue")){
			answer = "Rogue";
		}
		
		System.out.println(answer);
		
		System.out.println(role.equals(answer));
	}
}
