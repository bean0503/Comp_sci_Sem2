import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer!");
		int a = sc.nextInt();
		int b = a;
		
		while(a>=2){
			a = a-1;
			b = a*b;
		}
		System.out.println(b);
	}
}
