package manifestMap;

public class tester {

	public static void main(String[] args) {
		
		//excelReadtest();
		mapReadertest();
		

	}
	
	public static void excelReadtest() {
		
		manifestData mfh;
		ExcelReader er = new ExcelReader("VISA.xls");
		mfh = er.getManifestData();
		//System.out.println(mfh.getPalletBarcodes().keySet());
		System.out.println(mfh.toString());
		GenerateOutputFile output = new GenerateOutputFile("myTestOutput.csv",er.getManifestData());
		
	}
	
	public static void mapReadertest() {
		
		mapReader mr = new mapReader("testMap.map");
		System.out.println(mr.getFileContent());
		
	}

}
