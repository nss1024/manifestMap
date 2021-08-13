package manifestMap;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class NewManifestGenerator {
	
	private ExcelReader excelreader;
	private MapProcessor maprocessor;
	private GenerateOutputFile generateoutputfile;
	private manifestData manifestdata;
	private HSSFSheet excelData;
	private CellLocations cellLocations;
	private String excelFilePath;
	private String mapFilePath;
	private String outputFilePath;
	private String outpuFileName;
	
	
	
	/*
	 * This method extracts data from the sheet stored in the excelData variable
	 */
	
	public NewManifestGenerator(String excelFilePath, String mapFilePath, String outputFilePath, String outpuFileName) {
		super();
		this.excelFilePath = excelFilePath;
		this.mapFilePath = mapFilePath;
		this.outputFilePath = outputFilePath;
		this.outpuFileName = outpuFileName;
		
		maprocessor = new MapProcessor(mapFilePath); 
		cellLocations = maprocessor.getCellLocations();
		excelreader=new ExcelReader(excelFilePath);		
		excelData = excelreader.getExcelData();		
		
	}

	private String getSheetCellData(int row, int col) {
		
		String cellData = excelData.getRow(row).getCell(col).toString();
		//System.out.println(cellData);
		
		return cellData;
	}
	
	private String getSheetCellData (Integer[]rowcol) {
		
		String cellData= excelData.getRow(rowcol[0].intValue()).getCell(rowcol[1].intValue()).toString();
		
		return cellData;
	}
	
	/*
	 * The method is responsible for extracting relevant header data from the sheet stored in excelData.
	 * It instantiates a manifestData object and stores all of the manifest details for further 
	 * processing in by the GeberateOutputFile class.
	 */
	
	 private void generateManifestData() {
		 	System.out.println("Shipping line : " +cellLocations.getShippingLineRowCol()[0].intValue());
		 	System.out.println("Shipping line : " +cellLocations.getShippingLineRowCol()[1].intValue());
		 	System.out.println("Pallet barcode : " +cellLocations.getPalletBarcodesRowCol("palletBarcode1")[0].intValue());
		 	System.out.println(excelData.getRow(9).getCell(7));
		 manifestdata = new manifestData(
				 getSheetCellData(cellLocations.getShippingLineRowCol()),//shiping line				 
				 getSheetCellData(cellLocations.getVesselNameRowCol()),//vessel
				 getSheetCellData(cellLocations.getContainerNumberRowCol()),//container
				 getSheetCellData(cellLocations.getTemptaleSerialNumberRowCol()),//temptale
				 getSheetCellData(cellLocations.getDestinationPortRowCol()),//destPort
				 getSheetCellData(cellLocations.getLoadingPortRowCol()),//loadPort
				 getSheetCellData(cellLocations.getComodityRowCol()),//comodity
				 getSheetCellData(cellLocations.getGrowerRowCol()),//grower
				 getSheetCellData(cellLocations.getOriginLocation())//origin
				 );
		 //System.out.println("manifets header generated");
		 
	 }
	 
	 /*
	  * The method extracts pallet data from the sheet stored in excelData variable and 
	  * writes that data into the pallets variable of manifestdata. 
	  */
	 
	 private void generatePalletData() {
		 Map<String,String> palletBarcodes = new HashMap<String,String>(22);
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode1")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty1")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode2")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty2")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode3")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty3")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode4")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty4")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode5")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty5")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode6")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty6")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode7")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty7")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode8")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty8")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode9")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty9")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode10")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty10")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode11")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty11")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode12")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty12")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode13")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty13")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode14")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty14")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode15")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty15")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode16")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty16")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode17")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty17")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode18")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty18")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode19")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty19")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode20")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty20")));
		 palletBarcodes.put(getSheetCellData(cellLocations.getPalletBarcodesRowCol("palletBarcode21")),getSheetCellData(cellLocations.getPalletQTYRowCol("palletQty21")));
		 
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
	
	public void generateOutputFile () {
		String filePathAndName = outputFilePath+outpuFileName;
		generateoutputfile = new GenerateOutputFile(filePathAndName,manifestdata);
	}

}
