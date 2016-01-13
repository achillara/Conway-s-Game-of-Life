import java.util.ArrayList;

public class World {
	
	 ArrayList<Farm> array = new ArrayList<Farm> ();   
	 private int hour;
	 
	 
	 public World(int numFarms){ 
		 for( int i =0; i< numFarms; i++){
		 array.add(new Farm(5,5));
		 }
		 this.hour = 0; 
		 
	 }
	 public int getHour(){
		 return this.hour; 
	 }
	 
	  public int addHour(){ 
		 return hour+1;
	 }
}
