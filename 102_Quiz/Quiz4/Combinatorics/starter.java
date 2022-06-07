import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	

		
	}
	
	public static int factorial(int n){
		int f = n;
		int m;
		int c = 1;
		if(n == 1){
			f = 1;
		}else if(n > 1){
			while(true){
				m = n - c;
				f = f * m;
				c++;
				if((n - 1) == c){
					break;
				}
			}
		}
		return f;
	}
	
	public static int numCombinations(int r, int n){
		int num = 0;
		int denr;
		int dendif;
		int numer;
		int dif;
		if(r > n){
			num = 0;
		}else if(r <= n){
			numer = factorial(n);
			denr = factorial(r);
			dif = n - r;
			dendif = factorial(dif);
			num = numer/(denr*dendif);
		}
		System.out.println("There is " + num + " ways of choosing " + r + " items from " + n + " choices.");
		return num;
	}
}
