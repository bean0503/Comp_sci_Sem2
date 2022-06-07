import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number!");
		int num = sc.nextInt();
		printPrimes(num);
	}
	
	public static void printPrimes(int num){
		int c = num;
		while(true){
			boolean cor = checkPrime(num);
			if(cor == true){
				System.out.println(num);
			}
			num = num - 1;
			c = c - 1;
			if(c == 1){
				break;
			}
		}
	}
	
	public static boolean checkPrime(int num){
		int base = num;
		boolean right = true;
		
		while(true){
			if(num == 2){
				right = true;
				return right;
			}
			num = num - 1;
			if((base%num) != 0){
				right = true;
			}else if((base%num) == 0){
				right = false;
				return right;
			}
		}
	}
}
