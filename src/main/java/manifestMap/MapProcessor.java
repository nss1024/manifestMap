/*
 * This class will the contents of a map file, the arrayList provided to it by mapReader.
 * it returns a list of numbers denoting cell locations that excel reader uses to access specific cells.
 * 
 */

package manifestMap;

import java.util.List;

public class MapProcessor {
	
	private String mapFilePath;
	private  List <String> fileContents;
	private mapReader mapreader;
	private CellLocations cellLocations ;
	private ColMap colMap;
	
	
	public MapProcessor(String mapFilePath) {
		super();
		this.mapFilePath = mapFilePath;
		fileContents = new mapReader(mapFilePath).getFileContent();
		cellLocations = new CellLocations();
		colMap = new ColMap();
	}
	
	

}
