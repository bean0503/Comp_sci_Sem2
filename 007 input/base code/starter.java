import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		System.out.println("What month were you born? (enter a number please!)");
		int month = sc.nextInt();
		
		System.out.println("What day were you born?");
		int day = sc.nextInt();
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty? (enter a number please!)");
		double amount = sc.nextDouble();
		
		System.out.println("Your name is " + name + " and you were born on " + month + "/" + day  + "/" + year + ". You thought that a buck fifty was $" + amount + ".");
	}
}
