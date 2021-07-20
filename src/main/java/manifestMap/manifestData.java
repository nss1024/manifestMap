/*
 * An object created to store data read in from the original manifest that requires converting.
 * This data is then used to generate the output file.
 */

package manifestMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class manifestData {

	private String shippingLIne;
	private String vesselName;
	private String containerNumber;
	private String temptaleSerialNumber;
	private String destinationPort;
	private String loadingPort;
	private String comodity;
	private String grower;
	private Map <String,String> palletBarcodes = new HashMap<String,String>(22);//key=pallet barcode, value = fruit size
	
	

	public String getShippingLIne() {
		return shippingLIne;
	}

	public String getVesselName() {
		return vesselName;
	}

	public String getContainerNumber() {
		return containerNumber;
	}

	public String getTemptaleSerialNumber() {
		return temptaleSerialNumber;
	}

	public String getDestinationPort() {
		return destinationPort;
	}

	public String getLoadingPort() {
		return loadingPort;
	}

	public String getComodity() {
		return comodity;
	}

	public String getGrower() {
		return grower;
	}

	public Map<String, String> getPalletBarcodes() {
		return palletBarcodes;
	}

	public void setPalletBarcodes(Map<String, String> palletBarcodes) {
		this.palletBarcodes = palletBarcodes;
	}

	public manifestData(String shippingLIne, String vesselName, String containerNumber,
			String temptaleSerialNumber, String destinationPort, String loadingPort, String comodity, String grower) {
		super();
		this.shippingLIne = shippingLIne;
		this.vesselName = vesselName;
		this.containerNumber = containerNumber;
		this.temptaleSerialNumber = temptaleSerialNumber;
		this.destinationPort = destinationPort;
		this.loadingPort = loadingPort;
		this.comodity = comodity;
		this.grower = grower;
	}

	@Override
	public String toString() {
		return "manifestHeaderData [shippingLIne=" + shippingLIne + ", vesselName=" + vesselName + ", containerNumber="
				+ containerNumber + ", temptaleSerialNumber=" + temptaleSerialNumber + ", destinationPort="
				+ destinationPort + ", loadingPort=" + loadingPort + ", comodity=" + comodity + ", grower=" + grower
				+ ", palletBarcodes=" + palletBarcodes + "]";
	}



	
	
}
