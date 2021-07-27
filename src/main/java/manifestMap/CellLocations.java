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

	//private int[] shippingLineRowCol=new int[2];
	private Map <String, Integer[]> shippingLineRowCol = new HashMap<String,Integer[]>();
 	//private int[] vesselNameRowCol=new int[2];
	private Map <String, Integer[]>vesselNameRowCol=new HashMap<String,Integer[]>();
	//private int[] containerNumberRowCol=new int[2];
	private Map <String, Integer[]> containerNumberRowCol = new HashMap<String,Integer[]>();
	//private int[] temptaleSerialNumberRowCol=new int[2];
	private HashMap<String,Integer[]> temptaleSerialNumberRowCol = new HashMap<String,Integer[]>();
	//private int[] destinationPortRowCol=new int[2];
	private HashMap<String,Integer[]> destinationPortRowCol = new HashMap<String,Integer[]>();
	//private int[] loadingPortRowCol=new int[2];
	private HashMap<String,Integer[]> loadingPortRowCol = new HashMap<String,Integer[]>();
	//private int[] comodityRowCol=new int[2];
	private HashMap<String,Integer[]> comodityRowCol = new HashMap<String,Integer[]>();
	//private int[] growerRowCol=new int[2];
	private HashMap<String,Integer[]> growerRowCol = new HashMap<String,Integer[]>();
	//private int[][] palletBarcodesRowCol=new int[22][2];
	private HashMap<String,Integer[][]> palletBarcodesRowCol = new HashMap<String,Integer[][]>();
	
	public Map<String, Integer[]> getShippingLineRowCol() {
		return shippingLineRowCol;
	}
	public void setShippingLineRowCol(Map<String, Integer[]> shippingLineRowCol) {
		this.shippingLineRowCol = shippingLineRowCol;
	}
	public Map<String, Integer[]> getVesselNameRowCol() {
		return vesselNameRowCol;
	}
	public void setVesselNameRowCol(Map<String, Integer[]> vesselNameRowCol) {
		this.vesselNameRowCol = vesselNameRowCol;
	}
	public Map<String, Integer[]> getContainerNumberRowCol() {
		return containerNumberRowCol;
	}
	public void setContainerNumberRowCol(Map<String, Integer[]> containerNumberRowCol) {
		this.containerNumberRowCol = containerNumberRowCol;
	}
	public HashMap<String, Integer[]> getTemptaleSerialNumberRowCol() {
		return temptaleSerialNumberRowCol;
	}
	public void setTemptaleSerialNumberRowCol(HashMap<String, Integer[]> temptaleSerialNumberRowCol) {
		this.temptaleSerialNumberRowCol = temptaleSerialNumberRowCol;
	}
	public HashMap<String, Integer[]> getDestinationPortRowCol() {
		return destinationPortRowCol;
	}
	public void setDestinationPortRowCol(HashMap<String, Integer[]> destinationPortRowCol) {
		this.destinationPortRowCol = destinationPortRowCol;
	}
	public HashMap<String, Integer[]> getLoadingPortRowCol() {
		return loadingPortRowCol;
	}
	public void setLoadingPortRowCol(HashMap<String, Integer[]> loadingPortRowCol) {
		this.loadingPortRowCol = loadingPortRowCol;
	}
	public HashMap<String, Integer[]> getComodityRowCol() {
		return comodityRowCol;
	}
	public void setComodityRowCol(HashMap<String, Integer[]> comodityRowCol) {
		this.comodityRowCol = comodityRowCol;
	}
	public HashMap<String, Integer[]> getGrowerRowCol() {
		return growerRowCol;
	}
	public void setGrowerRowCol(HashMap<String, Integer[]> growerRowCol) {
		this.growerRowCol = growerRowCol;
	}
	public HashMap<String, Integer[][]> getPalletBarcodesRowCol() {
		return palletBarcodesRowCol;
	}
	public void setPalletBarcodesRowCol(HashMap<String, Integer[][]> palletBarcodesRowCol) {
		this.palletBarcodesRowCol = palletBarcodesRowCol;
	}
	
}
	
	
	
	
	
	

