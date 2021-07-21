/*
 * This class processes the manifest file that needs to be converted to a different format
 */

package manifestMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class ExcelReader {
	
	private String excelFilePath;
	private HSSFSheet excelData;
	public manifestData manifestdata;
	
	
	public ExcelReader(String excelFilePath){
			this.excelFilePath=excelFilePath;	
			this.excelData=readExcelFile();
	}
	
	/*
	 * This method reads an excel file with .xls extension and returns a sheet object
	 * that is stored in the excelData variable.
	 */
	
	private HSSFSheet readExcelFile() {
				
		try {
			FileInputStream fis = new FileInputStream(new File(excelFilePath));
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet sheet = workbook.getSheetAt(0);
			System.out.println("File read OK");
			return sheet;
		} catch (Exception e) {
			System.out.println("File read failed!");
			e.printStackTrace();
			return null;
		}		
	}
	
	/*
	 * This method extracts data from the sheet stored in the excelData variable
	 */
	
	public String getSheetCellData(int row, int col) {
		
		String cellData = excelData.getRow(row).getCell(col).toString();
		//System.out.println(cellData);
		
		return cellData;
	}
	
	public String getSheetCellData (int[]rowcol) {
		
		String cellData= excelData.getRow(rowcol[0]).getCell(rowcol[1]).toString();
		
		return cellData;
	}
	
	/*
	 * The method is responsible for extracting relevant header data from the sheet stored in excelData.
	 * It instantiates a manifestData object and stores all of the manifest details for further 
	 * processing in by the GeberateOutputFile class.
	 */
	
	 private void generateManifestData() {
		 
		 manifestdata = new manifestData(
				 getSheetCellData(9,7),//shiping line
				 getSheetCellData(13,7),//vessel
				 getSheetCellData(19,2),//container
				 getSheetCellData(19,7),//temptale
				 getSheetCellData(24,2),//destPort
				 getSheetCellData(15,7),//loadPort
				 getSheetCellData(21,2),//comodity
				 getSheetCellData(1,4)//grower
				 );
		 //System.out.println("manifets header generated");
		 
	 }
	 
	 /*
	  * The method extracts pallet data from the sheet stored in excelData variable and 
	  * writes that data into the pallets variable of manifestdata. 
	  */
	 
	 private void generatePalletData() {
		 Map<String,String> palletBarcodes = new HashMap<String,String>(22);
		 palletBarcodes.put(getSheetCellData(29,2), getSheetCellData(29,3));
		 palletBarcodes.put(getSheetCellData(30,2), getSheetCellData(30,3));
		 palletBarcodes.put(getSheetCellData(31,2), getSheetCellData(31,3));
		 palletBarcodes.put(getSheetCellData(32,2), getSheetCellData(32,3));
		 palletBarcodes.put(getSheetCellData(33,2), getSheetCellData(33,3));
		 palletBarcodes.put(getSheetCellData(34,2), getSheetCellData(34,3));
		 palletBarcodes.put(getSheetCellData(35,2), getSheetCellData(35,3));
		 palletBarcodes.put(getSheetCellData(36,2), getSheetCellData(36,3));
		 palletBarcodes.put(getSheetCellData(37,2), getSheetCellData(37,3));
		 palletBarcodes.put(getSheetCellData(38,2), getSheetCellData(38,3));
		 palletBarcodes.put(getSheetCellData(39,2), getSheetCellData(39,3));
		 palletBarcodes.put(getSheetCellData(29,8), getSheetCellData(29,9));
		 palletBarcodes.put(getSheetCellData(30,8), getSheetCellData(30,9));
		 palletBarcodes.put(getSheetCellData(31,8), getSheetCellData(31,9));
		 palletBarcodes.put(getSheetCellData(32,8), getSheetCellData(32,9));
		 palletBarcodes.put(getSheetCellData(33,8), getSheetCellData(33,9));
		 palletBarcodes.put(getSheetCellData(34,8), getSheetCellData(34,9));
		 palletBarcodes.put(getSheetCellData(35,8), getSheetCellData(35,9));
		 palletBarcodes.put(getSheetCellData(36,8), getSheetCellData(36,9));
		 palletBarcodes.put(getSheetCellData(37,8), getSheetCellData(37,9));
		 palletBarcodes.put(getSheetCellData(38,8), getSheetCellData(38,9));
		 palletBarcodes.put(getSheetCellData(39,8), getSheetCellData(39,9));
		 manifestdata.setPalletBarcodes(palletBarcodes);
	 }
	 
	 /*
	  * manifestdata is used by GenerateOutputFile class
	  */

	public manifestData getManifestData() {
		generateManifestData();
		generatePalletData();
		return manifestdata;
	}

	
	
	

}
