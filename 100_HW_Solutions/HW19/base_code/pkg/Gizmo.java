package pkg;

public class Gizmo {
   String maker;
   boolean isE;
   double cost;
   public Gizmo(){
      this.("none", false, 0.0);
   }
   
   public Gizmo(String maker){
      this.(maker, false, 0.0);
   }
   
   public Gizmo(boolean isE){
      this.("none", isE, 0.0);
   }
   
   public Gizmo(double cost){
      this.("none", false, cost);
   }
   
   public Gizmo(String maker, boolean isE){
      this.(maker, isE, 0.0);
   }
   
   public Gizmo(String maker, double cost){
      this.(maker, false, cost);
   }
   
   public Gizmo(boolean isE, double cost){
      this.("none", isE, cost);
   }
   
   public Gizmo(String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public boolean isElectronic(){
      return isE;
   }
   
   public String getMaker(){
      return maker;
   }
   
   public double getCost(){
      return cost;
   }
   
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
