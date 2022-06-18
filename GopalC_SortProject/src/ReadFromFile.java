import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
	
	private String fileName;
	ReadFromFile(String fName) 
	{
		this.fileName=fName;
	}

	public String readFile1() throws IOException {
		FileReader fr = new FileReader(fileName);		
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		try {
			while (line != null) {
				sb.append(line);
				sb.append("line.separator");
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
			fr.close();
		}		
			
	}
	
	
	public String readFile2() throws IOException {
			
		StringBuilder sb = new StringBuilder();	
		String line = null;
		try (FileReader fr = new FileReader(fileName);BufferedReader br = new BufferedReader(fr)) 
		{
			    line = br.readLine();
				while (line != null) {
				sb.append(line);
				sb.append("line.separator");
				line = br.readLine();
				}
		}
		return sb.toString();
	} 			
	
	
	public String readFile3() throws FileNotFoundException  {
		FileReader fr = new FileReader(fileName);
		Scanner myReader = new Scanner(fr);
		StringBuilder sb = new StringBuilder();
		while (myReader.hasNextLine()) {
			String line = myReader.nextLine();
			sb.append(line);
		}
		myReader.close();
		return sb.toString();		
	}
	
	public String readFile4() throws FileNotFoundException  {
		FileReader file = new FileReader(fileName);
		Scanner myReader = new Scanner(file);
		StringBuilder stringBuilder = new StringBuilder();
		while (myReader.hasNext()) {
			String line = myReader.next();
			stringBuilder.append(line);
		}
		myReader.close();
		return stringBuilder.toString();		
	}
}
