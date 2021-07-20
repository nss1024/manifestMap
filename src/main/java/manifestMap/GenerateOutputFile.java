/*
 * This class generates a CSV file that it the converted manifest. It is the final 
 * product of the app.
 */
package manifestMap;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateOutputFile {

	private String outputFileNameAndPath;
	private manifestData mfData;
	private String [] cols = {"Pallet Barode","Fruit Size","Comodity","Grower","Container","TempTale","Vessel","Shipping Line","Loading Port","Destination Port"};
	private List <String> columns = new ArrayList<String>(Arrays.asList(cols));
	
	public GenerateOutputFile(String outputFileNameAndPath, manifestData mfData) {
		super();
		this.outputFileNameAndPath = outputFileNameAndPath;
		this.mfData = mfData;
		generateFile();
	}
	
	private void generateFile() {
		
		try {
			FileWriter writer = new FileWriter(outputFileNameAndPath);
			StringBuilder sb = new StringBuilder();
			sb.append(mfData.getComodity());
			sb.append(",");
			sb.append(mfData.getGrower());
			sb.append(",");
			sb.append(mfData.getContainerNumber());
			sb.append(",");
			sb.append(mfData.getTemptaleSerialNumber());
			sb.append(",");
			sb.append(mfData.getVesselName());
			sb.append(",");
			sb.append(mfData.getShippingLIne());
			sb.append(",");
			sb.append(mfData.getLoadingPort());
			sb.append(",");
			sb.append(mfData.getDestinationPort());
			String manifestDataText = sb.toString();
			sb.setLength(0);
			writer.write(columns.toString());
			for(String key:mfData.getPalletBarcodes().keySet()) 
			{
				sb.append(key);
				sb.append(",");
				sb.append(mfData.getPalletBarcodes().get(key));
				sb.append(",");
				sb.append(manifestDataText);
				writer.write("\n");
				writer.write(sb.toString());
				
				sb.setLength(0);
			}
														
			writer.close();
			System.out.println("Output file generated");
		}
		catch(Exception e) 
		{
			System.out.println("Error writing to file");
			System.out.println(e.getStackTrace());
		
		}
		
	}
	
	
}
