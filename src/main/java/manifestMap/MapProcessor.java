/*
 * This class will process the contents of a map file, the arrayList provided to it by mapReader.
 * it returns a list of numbers denoting cell locations that excel reader uses to access specific cells.
 * 
 */

package manifestMap;

import java.util.HashMap;
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
		processMapFile();
	}
	
	private void processMapFile () {
		
		for (String s : fileContents) {	
			String cellName = s.split(",")[0];			
			int col =colmaps.getColmap().get(s.split(",")[1].substring(0,1));
			int row = Integer.parseInt(s.split(",")[1].substring(1,s.split(",")[1].length()));
			
			if(cellName.equals("shippingLine"))
			{ 
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setShippingLineRowCol(tempMap);
			}else if (cellName.equals("vesselName")) 
			{ 
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setVesselNameRowCol(tempMap);
			}else if (cellName.equals("containerNumber")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setContainerNumberRowCol(tempMap);
			}else if (cellName.equals("temptaleSerialNumber")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setTemptaleSerialNumberRowCol(tempMap);
			}else if (cellName.equals("destinationPort")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setDestinationPortRowCol(tempMap);
			}else if (cellName.equals("loadingPort")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setLoadingPortRowCol(tempMap);
			}else if (cellName.equals("comodity")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setComodityRowCol(tempMap);
			}else if (cellName.equals("grower")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setGrowerRowCol(tempMap);
			}else if (cellName.equals("origin")) 
			{
				HashMap <String, Integer []> tempMap = new HashMap<String,Integer[]>();
				tempMap.put(cellName, new Integer[] {row,col});
				cellLocations.setOrigin(tempMap);
			}else if (cellName.startsWith("palletBarcode")) {
				cellLocations.addPalletBarcodesRowCol(cellName, new Integer[] {row,col});
			}else if (cellName.startsWith("palletQty")) {
				cellLocations.addPalletQTYRowCol(cellName, new Integer[] {row,col});
			}
		}		
		
	}
	
	public CellLocations getCellLocations() {
		return cellLocations;
	}

}
