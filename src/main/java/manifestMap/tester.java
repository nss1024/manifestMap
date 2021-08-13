package manifestMap;

public class tester {

	public static void main(String[] args) {
		/*
		GenerateMapFile gmf = new GenerateMapFile("A2.map","","R5","R4","D3","D4","J2","J2","A1","A2","R3");
		for (int i=0;i<23;i++)
		{
			int j = i+10;
			gmf.addPalletData("B"+j, "P"+j);
		}
		gmf.generateMapFile();
		*/
		/*
		NewManifestGenerator nmg = new NewManifestGenerator("Acon2.xls","A2.map","","myTestOutput3.csv");
		nmg.getManifestData();
		nmg.generateOutputFile();
		*/
		//excelReadtest();
		//mapReadertest();
		//mapProcessorTest();
				

	}
	
	public static void excelReadtest() {
		
		manifestData mfh;
		ExcelReader er = new ExcelReader("VISA.xls");
		//mfh = er.getManifestData();
		//System.out.println(mfh.getPalletBarcodes().keySet());
		//System.out.println(mfh.toString());
		//GenerateOutputFile output = new GenerateOutputFile("myTestOutput.csv",er.getManifestData());
		
	}
	
	public static void mapReadertest() {
		
		mapReader mr = new mapReader("testMap.map");
		System.out.println(mr.getFileContent());
		
	}
	
	public static void mapProcessorTest() {
		MapProcessor mp = new MapProcessor("testMap.map");		
		
	}

}
