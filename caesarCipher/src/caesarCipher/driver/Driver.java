
package caesarCipher.driver;

import caesarCipher.decrypt.CreateWorkers;
import caesarCipher.store.DecodedStore;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import caesarCipher.util.FileProcessor;
import caesarCipher.util.Logger;
import caesarCipher.decrypt.CaesarDecrypt;
import java.io.File;

public class Driver{

	public static void main(String[] args) {

	/*
	 *Default values if no command line args are passed
	 *-------------------------------------------------
	 */
		String cipherText = "input.txt";	
	    String decodedText = "output.txt";
		int n = 1;
		int numThreads = 1;
		int debugValue = 1;
	//--------------------------------------------------
		if(args.length == 5)
		{
			cipherText = args[0];	
			decodedText = args[1];
			n = Integer.parseInt(args[2]);
			numThreads = Integer.parseInt(args[3]);
			if(numThreads <= 5 && numThreads >= 1){}
			else
			{
				System.err.println("NUM_THREADS is an invalid value. It must be between 1 and 5. Program terminating");
				System.exit(1);
			}
			debugValue = Integer.parseInt(args[4]);
			if(debugValue <= 4 &&  debugValue >= 0){}
			else
			{
				System.err.println("debugValue is an invalid value. It must be between 0 and 4. Program terminating");
				System.exit(1);
			}
		}
		else
		{
			System.err.println("Recieved " + args.length + " arguments. Expected: inputFilePath outputFilePath n numThreads debugValue. Exiting");
			System.exit(1);
		}
		
		Logger.setDebugValue(debugValue);
		
		
		File cipherFile = new File(cipherText);
		File decodedFile = new File(decodedText);

		CaesarDecrypt decrypter = new CaesarDecrypt();
		DecodedStore storedDecodedLines = new DecodedStore(decodedFile);
		FileProcessor fp = new FileProcessor(cipherFile);
		CreateWorkers workers = new CreateWorkers(storedDecodedLines,fp,decrypter,n);
		workers.startWorkers(numThreads);
	
		storedDecodedLines.writeToFile();
		
		

	} // end main(...)

} // end public class Driver

