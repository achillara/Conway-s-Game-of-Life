
public class Grass extends FarmObject{
	
	private int grass; 
	private int x; 
	private int y; 
	
	public Grass(int x, int y, int grass){
		this.x =x;
		this.y =y;
		this.grass = grass;
	}
	
	public void increaseGrass(){
		grass++;
	}
	
	public int getGrass(){ 
		return this.grass;
	}
	public void randomGrass(){
		double chance = 0.1 * grass;
		if (Math.random() < chance) {
			grass += 1;
		}
	}
	

}
