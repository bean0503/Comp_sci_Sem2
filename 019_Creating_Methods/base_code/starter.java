import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a sentence");
		String a = sc.nextLine();
		System.out.println("Give me another sentence");
		String b = sc.nextLine();
		toString(a, b);
		
		toStringCombined(a, b);
	}
	
	public static void toString(String a, String b){
		System.out.println(a);
		System.out.println(b);
		return;
	}
	
	public static void toStringCombined(String a, String b){
		System.out.print(a + " " + b);
		return;
	}
}
