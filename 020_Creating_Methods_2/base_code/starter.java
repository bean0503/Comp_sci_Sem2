import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number");
		int x = sc.nextInt();
		System.out.println("Give another number");
		int y = sc.nextInt();
		int ans = pow(x, y);
		System.out.println(ans);
	}
	
	public static int pow(int x, int y){
		int xy = x;
		int c = 0;
		while(true){
			xy = xy * x;
			c = c + 1;
			if(c == (y - 1)){
				break;
			}
		}
		return xy;
	}
}
