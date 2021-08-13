/*
 * This class holds cell locations corresponding to members of the manifestData class.
 * all members of this class are an array whose first elements denotes a row number 
 * and second element denotes the column number needed to look up data from an excel sheet 
 * as defined in the map file.
 */
package manifestMap;

import java.util.HashMap;
import java.util.Map;

public class CellLocations {

	
	private Map <String, Integer[]> shippingLineRowCol = new HashMap<String,Integer[]>(); 
	private Map <String, Integer[]>vesselNameRowCol=new HashMap<String,Integer[]>();	
	private Map <String, Integer[]> containerNumberRowCol = new HashMap<String,Integer[]>();	
	private HashMap<String,Integer[]> temptaleSerialNumberRowCol = new HashMap<String,Integer[]>();
	private HashMap<String,Integer[]> destinationPortRowCol = new HashMap<String,Integer[]>();
	private HashMap<String,Integer[]> loadingPortRowCol = new HashMap<String,Integer[]>();
	private HashMap<String,Integer[]> comodityRowCol = new HashMap<String,Integer[]>();	
	private HashMap<String,Integer[]> growerRowCol = new HashMap<String,Integer[]>();
	private HashMap<String,Integer[]> origin = new HashMap<String,Integer[]>();		
	private HashMap<String,Integer[]> palletBarcodesRowCol = new HashMap<String,Integer[]>();
	private HashMap<String,Integer[]> palletQTYRowCol = new HashMap<String,Integer[]>();
	
	public Integer[] getOriginLocation() {
		Integer [] originLocation = origin.get("origin");		
		return originLocation;
	}
	public void setOrigin(HashMap<String, Integer[]> origin) {
		this.origin = origin;
	}
	
	
	public Integer[] getPalletQTYRowCol(String s) {
		Integer[] i = palletQTYRowCol.get(s);		
		return i;
	}
	public void addPalletQTYRowCol(String s, Integer[] i) {
		this.palletQTYRowCol.put(s, i) ;
	}
	
	public Integer[] getShippingLineRowCol() {
		Integer [] shippingLineLocation = shippingLineRowCol.get("shippingLine");
		return shippingLineLocation;
	}
	public void setShippingLineRowCol(Map<String, Integer[]> shippingLineRowCol) {
		this.shippingLineRowCol = shippingLineRowCol;
	}
	
	public Integer[] getVesselNameRowCol() {
		Integer [] vesselNameLocation = vesselNameRowCol.get("vesselName");
		return vesselNameLocation;
	}
	public void setVesselNameRowCol(Map<String, Integer[]> vesselNameRowCol) {
		this.vesselNameRowCol = vesselNameRowCol;
	}
	public Integer[] getContainerNumberRowCol() {
		Integer [] containerNumberLocation = containerNumberRowCol.get("containerNumber");		
		return containerNumberLocation;
	}
	public void setContainerNumberRowCol(Map<String, Integer[]> containerNumberRowCol) {
		this.containerNumberRowCol = containerNumberRowCol;
	}
	public Integer[] getTemptaleSerialNumberRowCol() {
		Integer[] tempTaleSerialNoLocation = temptaleSerialNumberRowCol.get("temptaleSerialNumber");		
		return tempTaleSerialNoLocation;
	}
	public void setTemptaleSerialNumberRowCol(HashMap<String, Integer[]> temptaleSerialNumberRowCol) {
		this.temptaleSerialNumberRowCol = temptaleSerialNumberRowCol;
	}
	public Integer[] getDestinationPortRowCol() {
		Integer [] destinationPortLocation = destinationPortRowCol.get("destinationPort");
		
		return destinationPortLocation;
	}
	public void setDestinationPortRowCol(HashMap<String, Integer[]> destinationPortRowCol) {
		this.destinationPortRowCol = destinationPortRowCol;
	}
	public Integer[] getLoadingPortRowCol() {
		Integer [] loadinProtLocation = loadingPortRowCol.get("loadingPort");
		return loadinProtLocation;
	}
	public void setLoadingPortRowCol(HashMap<String, Integer[]> loadingPortRowCol) {
		this.loadingPortRowCol = loadingPortRowCol;
	}
	public Integer[] getComodityRowCol() {
		Integer[] comodityLocation  = comodityRowCol.get("comodity");
		return comodityLocation;
	}
	public void setComodityRowCol(HashMap<String, Integer[]> comodityRowCol) {
		this.comodityRowCol = comodityRowCol;
	}
	public Integer[] getGrowerRowCol() {
		Integer[] growerLocation = growerRowCol.get("grower");
		return growerLocation;
	}
	public void setGrowerRowCol(HashMap<String, Integer[]> growerRowCol) {
		this.growerRowCol = growerRowCol;
	}
	public Integer[] getPalletBarcodesRowCol(String s) {
		Integer [] i = palletBarcodesRowCol.get(s);
		return i;
	}
	public void addPalletBarcodesRowCol(String s, Integer [] i) {
		this.palletBarcodesRowCol.put(s, i) ;
	}
		
}
	
	
	
	
	
	

