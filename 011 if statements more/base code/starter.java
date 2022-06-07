import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a number");
		int a = sc.nextInt();
		System.out.println("Choose another number");
		int b = sc.nextInt();
		
		if(a != b)
		{
			System.out.println("lmao the numbers are different");
		}
	}
}
