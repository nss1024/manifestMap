/*
 * This class will process the contents of a map file, the arrayList provided to it by mapReader.
 * it returns a list of numbers denoting cell locations that excel reader uses to access specific cells.
 * 
 */

package manifestMap;

import java.util.List;

public class MapProcessor {
	
	private  List <String> fileContents;
	private CellLocations cellLocations ;
	private ColMap colmaps;
	
	
	public MapProcessor(String mapFilePath) {
		super();
		fileContents = new mapReader(mapFilePath).getFileContent();
		cellLocations = new CellLocations();
		colmaps = new ColMap();
	}
	
	private void processMapFile () {
		
		for (String s : fileContents) {			
			int col =colmaps.getColmap().get(s.split(",")[1].substring(0,1));
			int row = Integer.parseInt(s.split(",")[1].substring(1,s.split(",")[1].length()));
		}
		
	}

}
