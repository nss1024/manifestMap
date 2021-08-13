package manifestMap;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class GenerateMapFile {
	
	private String fileName;
	private String filePath;
	
	private String shippingLIne;
	private String vesselName;
	private String containerNumber;
	private String temptaleSerialNumber;
	private String destinationPort;
	private String loadingPort;
	private String comodity;
	private String grower;
	private String origin;
	//arrayList to hold palletBarcode location and palletQty location in a String array at locations 0 and 1.
	private List<String []> palletData = new ArrayList<String[]>();
	
	
	
	/**
	 * @param shippingLIne
	 * @param vesselName
	 * @param containerNumber
	 * @param temptaleSerialNumber
	 * @param destinationPort
	 * @param loadingPort
	 * @param comodity
	 * @param grower
	 * @param origin
	 */
	public GenerateMapFile(String fileName,String filePath,String shippingLIne, String vesselName, String containerNumber,
			String temptaleSerialNumber, String destinationPort, String loadingPort, String comodity, String grower,
			String origin) {
		
		this.fileName = fileName;
		this.filePath = filePath;
		this.shippingLIne = shippingLIne;
		this.vesselName = vesselName;
		this.containerNumber = containerNumber;
		this.temptaleSerialNumber = temptaleSerialNumber;
		this.destinationPort = destinationPort;
		this.loadingPort = loadingPort;
		this.comodity = comodity;
		this.grower = grower;
		this.origin = origin;
	}



	public void addPalletData(String palletBcode,String palletQty) 
	{
		palletData.add(new String[2]);
		palletData.get(palletData.size()-1)[0]=palletBcode;
		palletData.get(palletData.size()-1)[1]=palletQty;
	}
	
	public void generateMapFile() 
	{
		try 
		{
			FileWriter writer = new FileWriter(filePath+fileName);
			StringBuilder sb = new StringBuilder();
			sb.append("shippingLine");
			sb.append(",");
			sb.append(shippingLIne);
			sb.append("\n");
			sb.append("vesselName");
			sb.append(",");
			sb.append(vesselName);
			sb.append("\n");
			sb.append("containerNumber");
			sb.append(",");
			sb.append(containerNumber);
			sb.append("\n");
			sb.append("temptaleSerialNumber");
			sb.append(",");
			sb.append(temptaleSerialNumber);
			sb.append("\n");
			sb.append("destinationPort");
			sb.append(",");
			sb.append(destinationPort);
			sb.append("\n");
			sb.append("loadingPort");
			sb.append(",");
			sb.append(loadingPort);
			sb.append("\n");
			sb.append("comodity");
			sb.append(",");
			sb.append(comodity);
			sb.append("\n");
			sb.append("grower");
			sb.append(",");
			sb.append(grower);
			sb.append("\n");
			sb.append("origin");
			sb.append(",");
			sb.append(origin);
			sb.append("\n");
			
			for( int i=0;i<palletData.size()-1;i++)
			{
				int j = i+1;
				sb.append("palletBarcode"+j);
				sb.append(",");
				sb.append(palletData.get(i)[0]);
				sb.append("\n");
				sb.append("palletQty"+j);
				sb.append(",");
				sb.append(palletData.get(i)[1]);
				sb.append("\n");
			}
			System.out.println(sb.toString());
			writer.write(sb.toString());
			writer.close();
			System.out.println("Map file created!");
			
		}
		catch(Exception e) 
		{
			System.out.println("Error creating map file");
		}
	}
	
	//All containers must have 20 or more pallets
	private boolean validatePalletCount() 
	{		
		return palletData.size()>=20;
	}
}
