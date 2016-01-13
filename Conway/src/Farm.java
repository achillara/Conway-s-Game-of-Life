import java.util.ArrayList;

public class Farm {
	private FarmObject[][] grid;
	ArrayList<FarmObject> array = new ArrayList<FarmObject> ();
	private int gridX; 
	private int gridY; 
	Farm(int gridX, int gridY){ 
		this.gridX =gridX;
		this.gridY =gridY; 
	}			
	
	public int getGrid(){
		return grid.length;
		
	}
}
