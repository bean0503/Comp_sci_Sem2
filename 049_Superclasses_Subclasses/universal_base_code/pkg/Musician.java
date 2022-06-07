package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	String instrument;
	
	public Musician(){
		this("Cello");
	}
	
	public Musician(String instrument){
		this.instrument = instrument;
	}
	
	public String getInstrument(){
		return instrument;
	}
	
	public void playInstrument(){
		System.out.println("Plays " + instrument);
	}
}

