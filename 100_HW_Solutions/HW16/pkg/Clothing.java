package pkg;

public class Clothing{
	public double price;
	public String producer;
	
	public static double getPrice(){
		return price;
	}
	
	public static void setPrice(double price){
		this.price = price;
	}
	
	public static String getProducer(){
		return producer;
	}
	
	public static void setProducer(String producer){
		this.producer = producer;
	}
}