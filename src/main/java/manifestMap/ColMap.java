package manifestMap;
//This class provides a map by which we can map column names to integers that can be used in the  
//excelReader as an argument to getCelldata method to specify the column number from where data 
//can be retrieved.
import java.util.HashMap;
import java.util.Map;

public class ColMap {
	
		
	private Map<String,Integer> colmap;
	
	void ColMap(){
		colmap = new HashMap<String, Integer>();
		colmap.put("A", 0);
		colmap.put("B", 1);
		colmap.put("C", 2);
		colmap.put("D", 3);
		colmap.put("E", 4);
		colmap.put("F", 5);
		colmap.put("G", 6);
		colmap.put("H", 7);
		colmap.put("I", 8);
		colmap.put("J", 9);
		colmap.put("K", 10);
		colmap.put("L", 11);
		colmap.put("M", 12);
		colmap.put("N", 13);
		colmap.put("O", 14);
		colmap.put("P", 15);
		colmap.put("Q", 16);
		colmap.put("R", 17);
		colmap.put("S", 18);
		colmap.put("T", 19);
		colmap.put("U", 20);
		colmap.put("V", 21);
		colmap.put("W", 22);
		colmap.put("X", 23);
		colmap.put("Y", 24);
		colmap.put("Z", 25);
	}

	public Map<String, Integer> getColmap() {
		return colmap;
	}

}
