import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	

		System.out.println("Choose a number");
		int hana = sc.nextInt();
		System.out.println("Choose another number");
		int dul = sc.nextInt();
		
		if((hana % 2) == 0){
			System.out.println(hana + " is a even number");
		}else if((hana % 2) == 1){
			System.out.println(hana + " is an odd number");
		}
		if((hana % 3) == 0){
			System.out.println(hana + " is divisible by 3");
		}	
		if((hana % 4) == 0){
			System.out.println(hana + " is divisible by 4");
		}	
		if((hana % 5) == 0){
			System.out.println(hana + " is divisible by 5");
		}	
	
	
		if((dul % 2) == 0){
			System.out.println(dul + " is a even number");
		}else if((dul % 2) == 1){
			System.out.println(dul + " is an odd number");
		}
		if((dul % 3) == 0){
			System.out.println(dul + " is divisible by 3");
		}	
		if((dul % 4) == 0){
			System.out.println(dul + " is divisible by 4");
		}	
		if((dul % 5) == 0){
			System.out.println(dul + " is divisible by 5");
		}
	}
}
