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
	//only need mapProcessor instance as MapRedarer is instanciated within mapProcessor constructor.
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
			System.out.println("Excel File read OK");
			return sheet;
		} catch (Exception e) {
			System.out.println("File read failed!");
			e.printStackTrace();
			return null;
		}		
	}

	public HSSFSheet getExcelData() {
		return excelData;
	}
	
	
	
	

}
