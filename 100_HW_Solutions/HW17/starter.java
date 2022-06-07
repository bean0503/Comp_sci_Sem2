import pkg.*;

class starter {
	public static void main(String args[]) {
		
	}
}

public static boolean forwardMoveBlocked(){
	boolean blocked;
	if((pos == 0)||(pos == hall.length)){
		blocked = true;
	}else{
		blockedv = false;
	}
	return blocked;
}

public static void move(){
	if(hall[pos] > 0){
		hall[pos] = hall[pos] - 1;
		return;
	}

	boolean forb = true;
	
	if((forwardMoveBlocked() == true)&&(pos != 0)){
		pos--;
		forb = false;
		return;
	}else if((forwardMoveBlocked() == true)&&(pos == 0)){
		pos++;
		forb = true;
		return;
	}
	
	if((forwardMoveBlocked() == false)&&(forb == true)){
		pos++;
		return;
	}if else((forwardMoveBlocked() == false)&&(forb == false)){
		pos--;
		return;
	}
}

public int void clearHall(){
	int c = 0;
	while(true){
		move();
		c++;
		if((hall[0] == 0)||(hall[1] == 0)||(hall[2] == 0)||(hall[3] == 0)){
			return c;;
		}
	}
	
}