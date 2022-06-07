import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		dog t = new dog("Tous Les Jous", 5);
		dog b = new dog("Bingle", "JIndo");
		boolean sleepa = t.isSleeping();
		if(sleepa == true){
			System.out.println(t.name + " is asleep");
		}else if( sleepa == false){
			t.bark();
		}
		boolean sleepb = b.isSleeping();
		if((sleepb == true)||(sleepa == false)){
			b.bark();
		}else if((sleepb == false)||(sleepa == false)){
			b.bark();
		}
	}
}

class dog{
	String name;
	int age;
	String breed;
	public dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public dog(String a){
		//name
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public dog(String a, String b){
		//name and breed
		name = a;
		breed = b;
		age = 1;
	}
	public dog(String a, int c){
		//name and age
		name = a;
		age = c;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int c){
		age = c;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		int coin = rand.nextInt(1);
		boolean sleeping = true;
		if(coin == 1){
			sleeping = true;
		}else if(coin == 0){
			sleeping = false;
		}
		return sleeping;
	}
	public void bark(){
		System.out.println(name + " barks");
	}
}