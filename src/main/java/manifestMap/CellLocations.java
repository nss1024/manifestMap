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

	private int[] shippingLineRowCol=new int[2];
	private int[] vesselNameRowCol=new int[2];
	private int[] containerNumberRowCol=new int[2];
	private int[] temptaleSerialNumberRowCol=new int[2];
	private int[] destinationPortRowCol=new int[2];
	private int[] loadingPortRowCol=new int[2];
	private int[] comodityRowCol=new int[2];
	private int[] growerRowCol=new int[2];
	private int[][] palletBarcodesRowCol=new int[22][2];
	
	
	public CellLocations() {
		super();
	}


	public int[] getShippingLineRowCol() {
		return shippingLineRowCol;
	}


	public void setShippingLineRowCol(int[] shippingLineRowCol) {
		this.shippingLineRowCol = shippingLineRowCol;
	}


	public int[] getVesselNameRowCol() {
		return vesselNameRowCol;
	}


	public void setVesselNameRowCol(int[] vesselNameRowCol) {
		this.vesselNameRowCol = vesselNameRowCol;
	}


	public int[] getContainerNumberRowCol() {
		return containerNumberRowCol;
	}


	public void setContainerNumberRowCol(int[] containerNumberRowCol) {
		this.containerNumberRowCol = containerNumberRowCol;
	}


	public int[] getTemptaleSerialNumberRowCol() {
		return temptaleSerialNumberRowCol;
	}


	public void setTemptaleSerialNumberRowCol(int[] temptaleSerialNumberRowCol) {
		this.temptaleSerialNumberRowCol = temptaleSerialNumberRowCol;
	}


	public int[] getDestinationPortRowCol() {
		return destinationPortRowCol;
	}


	public void setDestinationPortRowCol(int[] destinationPortRowCol) {
		this.destinationPortRowCol = destinationPortRowCol;
	}


	public int[] getLoadingPortRowCol() {
		return loadingPortRowCol;
	}


	public void setLoadingPortRowCol(int[] loadingPortRowCol) {
		this.loadingPortRowCol = loadingPortRowCol;
	}


	public int[] getComodityRowCol() {
		return comodityRowCol;
	}


	public void setComodityRowCol(int[] comodityRowCol) {
		this.comodityRowCol = comodityRowCol;
	}


	public int[] getGrowerRowCol() {
		return growerRowCol;
	}


	public void setGrowerRowCol(int[] growerRowCol) {
		this.growerRowCol = growerRowCol;
	}


	public int[][] getPalletBarcodesRowCol() {
		return palletBarcodesRowCol;
	}


	public void setPalletBarcodesRowCol(int[][] palletBarcodesRowCol) {
		this.palletBarcodesRowCol = palletBarcodesRowCol;
	}
	
	
	
	
	
}
