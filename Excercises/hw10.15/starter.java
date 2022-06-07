import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int total = 100;
		
		while(true){
			if(total == 0){
				System.out.println("Sorry but youre broke");
				break;
			}
			
			System.out.println("Would you like to play slots?");
			String will = sc.nextLine();
		
			if((will.equals("Yes"))||(will.equals("yes"))||(will.equals("Y"))||(will.equals("y"))){
				System.out.println("You have " + total + ", how much would you like to wager?");
				int sone = sc.nextInt();
				String shizzle = sc.nextLine();
				
				if((sone <= total) && (sone > 0)){
					total = total - sone;
				
					int a1 = rand.nextInt(10);
					int a = a1 + 1;
					int b1 = rand.nextInt(10);
					int b = b1 + 1;
					int c1 = rand.nextInt(10);
					int c = c1 + 1;
					
					if((a == b) && (b == c) && ( c == a)){
						sone = sone * 3;
						System.out.println("Three numbers are the same, it’s a jackpot! Your money has tripled");
					}else if((a == b)||(b == c)||(a == c)){
						sone = sone * 2;
						System.out.println("Two numbers are the same, your money has doubled");
					}else if((a != b) && (b != c) && ( c != a)){
						sone = 0;
						System.out.println("Lmao you lost this time and lost all your money better luck next time <3");
					}
					
					total = total + sone;
					System.out.println("You now have " + total);
				}else if((sone > total)||(sone < 0)){
					System.out.println("Sorry you can't wager that much");
				}
				
			}else if((will.equals("No"))||(will.equals("no"))||(will.equals("N"))||(will.equals("yn"))){
				System.out.println("Come again next time, you ended with " + total);
				break;
			}
		}
	}
}
