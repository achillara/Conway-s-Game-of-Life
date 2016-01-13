
public abstract class FarmObject  {
	private int x; 
	private int y; 
	
	public int doStuffForAnHour(int hour){
		return hour +1; 
	}
	public void removeObject(Object object){
		object = null; 
	}
	public int getX(){ 
		return this.x;
	}
	public int getY(){ 
		return this.y;
	}

}
