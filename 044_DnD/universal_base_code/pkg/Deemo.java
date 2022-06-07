package pkg;
import java.util.Scanner;
import java.util.Random;


public class Deemo {
	String name;
	int health;
	int attack;
	Random rand = new Random();

	public Deemo() {
		this("deemo");
	}
	
	public Deemo(String name){
		this.name = name;
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Warrior w){
		int roll = rand.nextInt(attack) + 1;
		int warriorhealth = w.getHealth();
		int finalhealth = warriorhealth - roll;
		w.setHealth(finalhealth);
	}
	
	public void attack(Wizard i){
		int roll = rand.nextInt(attack) + 1;
		int wizardhealth = i.getHealth();
		int finalhealth = wizardhealth - roll;
		i.setHealth(finalhealth);
	}

}

