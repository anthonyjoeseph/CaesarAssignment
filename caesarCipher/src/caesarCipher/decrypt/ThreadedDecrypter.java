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
	 * @return returns instance of ThreadDecrypter
	 */
	public ThreadedDecrypter(DecodedStore store,FileProcessor fp,CaesarDecrypt decrypter,int shiftValue){
		this.store = store;
		this.fp = fp;
		this.decrypter = decrypter;
		this.shiftValue = shiftValue;
		Logger.writeMessage("ThreadDecrypter Constructor called", 4);
		
	}
	
	
	/**
	 * This function Invokes a method in the file processor to read a single line
	 * It decrypts the line using an instance of caesarCipher decrypt
	 * writes the decodedline to decode store
	 * @return no return
	 */
    public void run() {
	   String name = Thread.currentThread().getName();
	   Logger.writeMessage("Thread "+ name+"'s run method has started",3);
       String cipheredLine ="";
       
	   while((cipheredLine = fp.readLineFromFile()) != null){
	    	String decodedLine = decrypter.convertCipher(cipheredLine,shiftValue);
	    	store.addString(decodedLine);
	   }
    }
    

}