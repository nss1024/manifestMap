/*
 * The class reads a map file and returns it's contents as an arrayList
 * The arrayList will be an input to the mapProcessor class that will be able to 
 * get cell locations based on the data stored in the fileContent arrayList
 */

package manifestMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mapReader {
	
	String[] cols = new String[] {"shippingLine","vesselName","containerNumber","temptaleSerialNumber","destinationPort",
			"loadingPort","comodity","grower","origin","palletBarcode1","palletQty1","palletBarcode2","palletQty2","palletBarcode3","palletQty3",
			"palletBarcode4","palletQty4","palletBarcode5","palletQty5","palletBarcode6","palletQty6","palletBarcode7","palletQty7","palletBarcode8","palletQty8",
			"palletBarcode9","palletQty9","palletBarcode10","palletQty10","palletBarcode11","palletQty11","palletBarcode12","palletQty12","palletBarcode13","palletQty13",
			"palletBarcode14","palletQty14","palletBarcode15","palletQty15","palletBarcode16","palletQty16","palletBarcode17","palletQty17","palletBarcode18","palletQty18",
			"palletBarcode19","palletQty19","palletBarcode20","palletQty20","palletBarcode21","palletQty21","palletBarcode22","palletQty22",};
	private String filePath;
	private List <String> fileContent;
	
	public List<String> getFileContent() {
		return fileContent;
	}

	public mapReader( String filePath ) {
		this.filePath = filePath;
		fileContent = fileReader();
	}
	
	/*
	 * A simple fileReader class to retrieve data stored in  map file
	 */
	
	private List<String> fileReader() {
		
		List <String> fileContents = new ArrayList<String>();
		String lineContents = "";
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(filePath));
			while((lineContents=bf.readLine())!=null) {
				fileContents.add(lineContents);
			}
			bf.close();
			if(fileContents.size()==53) {System.out.println("Map File read successful");}
			else {System.out.println("Map file incomplete, missing" + validateMapFileContents(cols,fileContents)+ " column(s)");}
			return fileContents;
			
		} catch (FileNotFoundException e) {
			System.out.println("Map file not found!");
			e.printStackTrace();
			return fileContents;
		}catch(IOException e) {
			System.out.println("Canot read contents of map file");
			e.printStackTrace();
			return fileContents;
		}
		
	}
	
	private List<String> validateMapFileContents(String [] s,List<String> fc){			
		ArrayList<String> refList = new ArrayList<String>(Arrays.asList(s));
		ArrayList <String> colsInFile = new ArrayList<String>();
		for(String str : fc) {
			colsInFile.add(str.split(",")[0]);
		}
		refList.removeAll(colsInFile);
		
		return refList;
			}
		

	}


