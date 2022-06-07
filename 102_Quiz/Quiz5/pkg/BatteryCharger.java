package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger{
	
	private int getChargingCost(int startHour, int chargeTime){
		int totalCost = 0;
		int timeTook = chargeTime;
		int c = startHour;
		
		if((startHour <= 23)||(startHour >= 0)||(chargeTime > 0)){
			while(true){
				totalCost = totalCost + rateTable[c];
				timeTook--;
				if(timeTook == 0){
					break;
				}
				if(c == 23){
					c = -1;
				}
				c++;
			}
		}
		return totalCost;
	}
	
	public int getChargeStartTime(int chargeTime){
		int lowestCost = getChargingCost(0, chargeTime);
		int cost = 0;
		int lowestTime = 0;
		int time = 0;
		
		if(chargeTime > 0){
			while(true){
				cost = getChargingCost(time, chargeTime);
				if(cost <= lowestCost){
					lowestCost = cost;
					lowestTime = time;
				}
				if(time == 23){
					break;
				}
				time++;
			}
		}
		return lowestTime;
	}
}