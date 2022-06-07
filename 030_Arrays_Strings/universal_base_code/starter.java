import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String[] y = new String[10];
		y[0] = "하루 한 달 일 년쯤 되면";
		y[1] = "서로 다른 일상을 살아가";
		y[2] = "나는 아니야";
		y[3] = "쉽지 않을 것 같아";
		y[4] = "여전하게도 넌 내 하루하루를 채우고";
		y[5] = "아직은 아니야";
		y[6] = "바보처럼 되뇌는 나";
		y[7] = "입가에 맴도는 말을 삼킬 수 없어";
		y[8] = "It's not fine";
		y[9] = "It's not fine";
		int c = 0;
		while(true){
			System.out.println(y[c]);
			c++;
			if(c == 10){
				break;
			}
		}
	}
}
