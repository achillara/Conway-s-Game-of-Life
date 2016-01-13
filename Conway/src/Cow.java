import java.util.Random;

public class Cow extends FarmObject {
	private String name; 
	private int hungy; 
	private int age;
	private int sicknessLevel; 
	private int x; 
	private int y;
	private boolean grass; 
	
	 public Cow(int x, int y, String name1){
		 this.x =x;
		 this.y =y;
		 name = name1; 
		 hungy = 0; 
		 age =0; 
		 sicknessLevel = 0;
		
	}
	 public void move(int hour){ 
		  
		 if(hour <=12){
			 Random ran = new Random();
			 int num = ran.nextInt(4);// randomizes the direction 0- 3
			 System.out.println(num);
			 if (num ==0){
				 x++; 
			 }
			 else if( num ==1){
				 x--;
			 }
			 else if( num ==2){
				 y++;
			 }
			 else {
				 y--;
			 }
		 }
		 else {
			 doStuffForAnHour(hour);
		 }
	 }
	 
	 public void eatGrass(grass){
			grass = Math.rand(9) + 1;
			hungriness -= grass; 
		}
		
		//method for removing cows
		public void testForDeath() {
			if (hungy >= 100 || age >= 90001) {
				remove();
			}
			double chance = 0.0001 * age * sicknessLevel;
			if (Math.random() < chance) {
				removeObject();
			}
		}
	

}
	 
