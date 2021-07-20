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
import java.util.List;

public class mapReader {
	
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

}
