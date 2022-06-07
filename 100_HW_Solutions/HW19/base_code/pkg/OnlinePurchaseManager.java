import java.util.ArrayList;


public class OnlinePurchaseManager {
   
   private ArrayList<Gizmo> purchases;
   
   public countElectronicsByMaker(String mkr){
      int d = purchases.size();
      int c = 0;
      int t = 0;
      boolean is = false;
      String what = "";
      while(true){
         what = [purchase.get(c)].getMaker();
         if(mkr.equals(what)){
            is = [purchase.get(c)].isElectronic();
            if(is){
               t++;
            }
         }
         c++;
         if(c == d){
            break;
         }
      }
      return t;
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	int d = purchases.size();
   	int c = 0;
   	double val = 0;
   	double smallest = 100000000000000000000000000000000000000000000000000000000000000000000000.0;
   	String what = "";
   	while(true){
   	   what = [purchase.get(c)].getMaker();
   	   if(mkr.equals(what)){
   	      val = [purchase.get(c)].getCost();
   	      if(val < smallest){
   	         smallest = val;
   	      }
   	   }
   	   c++;
   	   if(c == d){
   	      break;
   	   }
   	}
   	return smallest;
   }
   
   public boolean hasAdjacentEqualPair(){
      int c = 0;
      int d = purchases.size() - 1;
      double costi = 0;
      double costf = 0;
      boolean de = false;
      while(true){
         costi = [purchase.get(c)].getCost();
         costf = [purchase.get(c + 1)].getCost();
         if(costi == costf){
            de = true;
         }else if(costi != costf){
            de = false;
         }
         c++;
         if(c == d){
            break;
         }
      }
      return de;
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
