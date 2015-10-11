package caesarCipher.decrypt;
import caesarCipher.util.Logger;
import caesarCipher.util.FileProcessor;
import caesarCipher.store.DecodedStore;

/**
 * This class creates the worker threads to decrypt the cipher.
 * 
 * @author Anthony Stella
 */
 public class CreateWorkers  {
	 
	 private FileProcessor fp;
	 private DecodedStore  store;
	 private CaesarDecrypt decrypter;
	 private int shiftValue;
	 /**
	 * This method returns an instance of CreateWorkers
	 * @param store Stores the decoded text
	 * @param fp Reads and parsed the input file
	 * @param decrypter Decrypts the encrypted text
	 * @param shiftValue The number of characters that must be shifted in the Caesar algorithm
	 * @return Instance of CreateWorkers
      	 */
	public CreateWorkers(DecodedStore store, FileProcessor fp, CaesarDecrypt decrypter, int shiftValue){
		this.store = store;
		this.fp = fp;
		this.decrypter = decrypter;
		this.shiftValue = shiftValue;
		Logger.writeOutput("Create Workers Constructor called", 4);
	}
	/**
	 * This method will start NUM_THREADS number of threadDecrypter instances.
	 * @param NUM_THREADS The parameter was made final because the NUM_THREADs variable passed should not be changed by the method.
	 * @return NO return value
	 */
	public void startWorkers(final int NUM_THREADS){
		Thread[] thread = new Thread[5];
    	for(int i = 0; i < NUM_THREADS; i++){
    		ThreadedDecrypter runnableObject = new ThreadedDecrypter(store,fp,decrypter,shiftValue);
    		thread[i] = new Thread(runnableObject,""+(i+1));
    		thread[i].start();
    	}
    	for(int j = 0; j < NUM_THREADS; j++){
    		try{
    			thread[j].join();
    		}
    		catch(InterruptedException e){
			
    		}
    	}
    }
	
}