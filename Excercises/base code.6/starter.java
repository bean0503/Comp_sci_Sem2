import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int value = eeka();
		
		if(value == 0){
			System.out.println("Not right");
		}else{
			System.out.println(value);
		}
	}
	
	public static int eeka(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a number");
		int a = sc.nextInt();
		System.out.println("Choose another number");
		int b = sc.nextInt();
		int ooka = a*b;
		int dooka = 0;
		
		if((ooka % 3) == 0){
			return ooka;
		}else{
			return dooka;
		}
	}
} 
