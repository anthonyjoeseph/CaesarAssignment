
package caesarCipher.driver;

public class Driver{

	public static void main(String[] args) {

		
		String cipherText;	
	    String decodedText;
		int n;
		int numThreads;
		int debugValue;
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
			System.err.println("invalid number of arguments program terminating");
			System.exit(1);
		}

		

	} // end main(...)

} // end public class Driver

