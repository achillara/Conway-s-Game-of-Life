import java.util.Random;

public class NocturnalCow extends Cow{
	
	
	
	public NocturnalCow( int x, int y, String name1) {
		super( x, y, name1);
		// TODO Auto-generated constructor stub
	}

	public void move(int hour){ 
		 
		 if(hour>12){
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
	 }
	

}


