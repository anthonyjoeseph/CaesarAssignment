
package caesarCipher.store;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Vector;
import caesarCipher.util.Logger;


public class DecodedStore implements DisplayI {

    /*
     * We decided to use a vector because they are thread safe.
     */
    private static volatile int count = 0;
    private File decodedFile;
    private Vector<String> decodedLines;
    /**
     * This function creates an instance of DecodedStore
     * @param decodedFilePath The file path to write to
     * @return Instance of DecodedStore
     */
    public DecodedStore(File decodedFile){
    	decodedLines = new Vector<String>();
	this.decodedFile = decodedFile;
    }
    /**
     * Writes the contents of its decoded text storage to a file
     */
    public void writeToFile() {
	try{
	    if(!decodedFile.exists()){
		decodedFile.createNewFile();
	    }

	    FileWriter decodedFileIO = new FileWriter(decodedFile.getAbsoluteFile());
	    BufferedWriter bufDecodedFileIO = new BufferedWriter(decodedFileIO);
	    for(int i = 0; i < decodedLines.size(); i++){
		bufDecodedFileIO.write(decodedLines.get(i));
		bufDecodedFileIO.newLine();
	    }
	    bufDecodedFileIO.close();
	}catch(IOException e){
	    System.err.println("Error writing the file.");
	    System.exit(1);
	}
    }
    /**
     * Adds a string to the storage of decoded text
     * @param decodedLine The line of decoded text
     */
    public void addString(String decodedLine){
	count++;
	decodedLines.add(decodedLine);
	Logger.writeOutput(count+" "+decodedLine,2);
    }
} 


