
package caesarCipher.util;

public class Logger{

    private static int debugLevel;

    public static void setDebugValue (int levelIn) {
    	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String     message  , int levelIn ) {
    	if (levelIn == debugLevel){
    		System.out.println(message);
    	}
    }

    public String toString() {
    	return "Debug Level is " + debugLevel;
    }
}
