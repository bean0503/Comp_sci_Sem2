package pkg;

public class CVMath {		
	public static int[] specialSquare(int n){
		int[]x = new int[n];
		int cf = n;
		int ci = 0;
		
		int square = 2;
		double squareRoot;
		int squareRound;
		int checkSquare;
		
		int starter = 1;
		int factorial = 0;
		
		while(true){
			squareRoot = Math.sqrt(square);
			squareRound = (int) Math.round(squareRoot);
			checkSquare = squareRound*squareRound;
			if(square == checkSquare){
				while(true){
					factorial = factorial + starter;
					starter++;
					if(factorial == square){
						x[ci] = square;
						ci++;
						break;
					}
					if(factorial > square){
						starter = 1;
						factorial = 0;
						break;
					}
				}
			}
			square++;
			if(ci == cf){
				break;
			}
		}
		return x;
	}
	
	
	
}
