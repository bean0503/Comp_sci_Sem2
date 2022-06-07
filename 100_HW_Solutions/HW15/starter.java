import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many special squares?");
		int n = sc.nextInt();
		int[]x = CVMath.specialSquare(n);
		int c = 0;
		while (true){
			System.out.print(x[c] + ", ");
			c++;
			if(c == (n - 1)){
				System.out.print(x[n - 1]);
				break;
			}
		}
	}
}
