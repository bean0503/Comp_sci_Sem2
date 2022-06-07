package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	public int numSeats;
	public double desirability;
	public double viewQuality;
	
	public CombinedTable(){
		numSeats = 0;
		desirability = 0.0;
	}
	
	public CombinedTable(SingleTable tab1, SingleTable tab2){
		numSeats = getNumSeats(tab1,tab2);
		desirability = whatDesirability(tab1, tab2);
	}
	
	public static int getNumSeats(SingleTable tab1, SingleTable tab2){
		int a = tab1.getNumSeats() + tab2.getNumSeats() - 2;
		return a;
	}
	
	public static int whatDesirability(SingleTable tab1 SingleTable tab2){
		viewQuality = (tabl.getViewQuality() + tab2.getViewQuality()) / 2;
		double b;
		if(tabl.getHeight() == tab2.getHeight()){
			b = viewQuality;
		}else if(tabl.getHeight() != tab2.getHeight()){
			b = viewQuality - 10.0;
		}
		return b;
	}
	
	public static boolean canSeat(int guestNumber){
		if(guestNumber <= numSeats){
			return true;
		}else{
			return false;
		}
	}
	
	public static double getDesirability(){
		return desirability;
	}
}

