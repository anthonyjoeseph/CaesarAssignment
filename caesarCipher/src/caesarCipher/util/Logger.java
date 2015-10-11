
package caesarCipher.util;

public class Logger{

    private static int debugLevel;

    /**
     * Sets the debug value of this logger
     * @param levelIn The debug value
     */
    public static void setDebugValue (int levelIn) {
    	debugLevel = levelIn;
    }

    /*
     * Print a message to stdout
     * @param message The message to print
     * @param levelIn the level of Debugging
     */

    // @return None
    public static void writeOutput (String message, int levelIn) {
    	if (levelIn == debugLevel){
	    System.out.println(message);
    	}
    }

    /*
     * Gets the debug level as a String
     * @return A string of the debug level
     */
    public String toString() {
    	return "Debug Level is " + debugLevel;
    }
}
