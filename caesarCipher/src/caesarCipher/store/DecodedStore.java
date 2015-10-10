
package caesarCipher.store;

import java.util.Vector;
import caesarCipher.util.Logger;
public class DecodedStore implements DisplayI {

    /*
     * We decided to use a vector because they are thread safe.
     */
	private static volatile int count = 0;
	private Vector<String> decodedLines;
	/**
	 * This function creates an instance of DecodedStore
	 * @return Instance of DecodedStore
	 */
    public DecodedStore(){
    	decodedLines = new Vector<String>();
    }
	public void writeToFile() {
		// write all data from decodedLines to outputfile
    }
	public void addString(String decodedLine){
		count++;
		decodedLines.add(decodedLine);
		Logger.writeMessage(count+" "+decodedLine,2);
	}
} 


