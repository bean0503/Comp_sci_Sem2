package pkg;
import java.util.Scanner;
import java.util.Random;


public class set {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	public Scanner sc = new Scanner(System.in);

	public set() {
		role = setRole();
		strength = setStrength();
		dexterity = setDexterity();
		intelligence = setIntelligence();
		constitution = setConstitution();
		charisma = setCharisma();
		
	}
	public String setRole(){
		System.out.println("Choose a role");
		String dd = sc.nextLine();
		String a;
		a = "No role";
		if((dd.equals("Wizard"))||(dd.equals("wizard"))){
			a = "wizard";
		}else if((dd.equals("Rogue"))||(dd.equals("rogue"))){
			a = "rogue";
		}else if((dd.equals("Warrior"))||(dd.equals("warrior"))){
			a = "warrior";
		}
		return a;
	}
	public int setStrength(){
		System.out.println("Choose a stat for your strength");
		int a = sc.nextInt();
		return a;
	}
	public int setDexterity(){
		System.out.println("Choose a stat for your dexterity");
		int a = sc.nextInt();
		return a;
	}
	public int setIntelligence(){
		System.out.println("Choose a stat for your intelligence");
		int a = sc.nextInt();
		return a;
	}
	public int setConstitution(){
		System.out.println("Choose a stat for your constitution");
		int a = sc.nextInt();
		return a;
	}
	public int setCharisma(){
		System.out.println("Choose a stat for your charisma");
		int a = sc.nextInt();
		return a;
	}
	public void printSet(){
		System.out.println("Role: " + role);
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Constitution: " + constitution);
		System.out.println("Charisma: " + charisma);
	}
}	

