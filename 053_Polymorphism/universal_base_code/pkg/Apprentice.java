package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;
	
	public Apprentice(){
	    this("CVHS", 0);
	}
	
	public Apprentice(String school, int yearsOfExperience){
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String instrument, String school, int yearsOfExperience){
	    super(instrument);
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
	}
	
	public Apprentice(String name, int age, String instrument, String school, int yearsOfExperience){
	    super(name, age, instrument);
	    this.school = school;
	    this.yearsOfExperience = yearsOfExperience;
	}
	
	public void playInstrument(){
	    System.out.println("Currently playing " + instrument);
	}
	
	public void practice(){
	    super.practice();
	    System.out.println(yearsOfExperience + " of practice");
	}
	
	public void perform(){
	    super.perform();
	    System.out.println("plays piece");
	}
	
	public void praticeAtUniversity(){
	    super.practice();
	    System.out.println("at " + school);
	}
}