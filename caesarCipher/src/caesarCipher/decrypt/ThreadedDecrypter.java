package caesarCipher.decrypt;

import caesarCipher.store.DecodedStore;
import caesarCipher.util.FileProcessor;
import caesarCipher.util.Logger;
/**
 * This class implements runnables method run. This method will be executed by newly created threads.
 * @author Anthony Stella
 *
 */
public class ThreadedDecrypter implements Runnable  {
	
	private DecodedStore store;
	private FileProcessor fp;
	private CaesarDecrypt decrypter;
	private int shiftValue;
	/**
	 * This function creates an instance of ThreadDecrypter
	 * @param store Stores the decrypted text
	 * @param fp Reads the file of cipher text
	 * @param decrypter Decrypts the text
	 * @param shiftValue The number of characters the caesar cipher should shift
	 */
	public ThreadedDecrypter(DecodedStore store,FileProcessor fp,CaesarDecrypt decrypter,int shiftValue){
		this.store = store;
		this.fp = fp;
		this.decrypter = decrypter;
		this.shiftValue = shiftValue;
		Logger.writeOutput("ThreadDecrypter Constructor called", 4);
		
	}
	
	
	/**
	 * This function Invokes a method in the file processor to read a single line
	 * It decrypts the line using an instance of caesarCipher decrypt
	 * writes the decodedline to decode store
	 */
    public void run() {
	   String name = Thread.currentThread().getName();
	   Logger.writeOutput("Thread "+ name+"'s run method has started",3);
       String cipheredLine ="";
       
	   while((cipheredLine = fp.readLineFromFile()) != null){
	    	String decodedLine = decrypter.convertCipher(cipheredLine,shiftValue);
	    	store.addString(decodedLine);
	   }
    }
    

}