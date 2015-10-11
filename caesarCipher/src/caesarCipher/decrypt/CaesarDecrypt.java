package caesarCipher.decrypt;
/**
 * CaesarDecrypt --- Purpose of class is to provide functionality to decipher ciphered text.
 * Class implements CaesarCipherI
 */
public class CaesarDecrypt implements CaesarCipherI {
/**
   * Decodes a ciphered line of text and returns the result.
   * @param cipheredLine The ciphered line of text
   * @param n 'N' in the casear cipher algorithm
   * @return The decoded line of text
   */ 
	public String convertCipher(String cipheredLine, int n){
		
		String decodedLine = "";
		// check cipheredLine to see if null string was passed
		if(cipheredLine != null){
			for(int i = 0; i < cipheredLine.length(); i++){
				
				char decodedCharacter = (char) (cipheredLine.charAt(i) - n);
				decodedLine = decodedLine + decodedCharacter;
			}
		}
		return decodedLine;
	}

}