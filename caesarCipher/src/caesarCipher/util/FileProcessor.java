
package caesarCipher.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;;

/** Class Description of FileProcessor
 * 
 * I did not add getters or setters for either BufferedReader or FileInputStream because the only functionality you need with the FileProcessor is to read lines and close it. this is handeled
 * by the functions I have provided.
 */
public class FileProcessor {

	private BufferedReader reader;
	private FileInputStream inputStream;
	
	public FileProcessor(File file)
	{
		try{
			inputStream = new FileInputStream(file);
			reader = new BufferedReader(new InputStreamReader(inputStream));
		}
		catch(FileNotFoundException ex)
		{
			System.err.println("FileNotFoundException: " + ex.getMessage());		
			System.err.println("Make sure the file name is valid and that the file is located in the directory you are executing from");
			System.exit(1);
		}
		
	}	
	
	/** Readline from file.
	 * @return The next line read from the input file
	 */
	
	public String readLineFromFile()
	{
		String nextLine = "";
		try{
			nextLine = reader.readLine();
		}
		catch(IOException ex){
			System.err.println("Error reading file Program terminating");
			closeFileProcessor();
			System.exit(1);
		}
		return nextLine;
		
	}
	
	public void closeFileProcessor(){
		
		try {
			reader.close();
		} 
		catch (IOException e) {
			System.err.println("error closing the file processor program terminating");
			System.exit(1);
		}
		
	}
	
}
