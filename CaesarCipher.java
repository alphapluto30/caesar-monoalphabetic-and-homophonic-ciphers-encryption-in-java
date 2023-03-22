package finalcipher;

import java.util.Scanner;

public class CaesarCipher {
	// shift key the cipher 
static int SHIFT = 2;

  public static void runCaesarCipher_main() {
	  
    Scanner scanner = new Scanner(System.in); // Getting the input from the user 
    System.out.println("Enter the plain text to encrypt in CaesarCipher :");
    String plainText = scanner.nextLine();

    String encryptedText = performCaesarCipher(plainText, SHIFT);  // Calling the performCaesarCipher method to encrypt the plain text
    System.out.println("Encrypted text : " + encryptedText);
  }
  private static String performCaesarCipher(String plainText, int shift) // performCaesarCipher  method to perform the Caesar Cipher encryption
  {
    StringBuilder encryptedText = new StringBuilder();
    for (char c : plainText.toCharArray()) {
      if (Character.isLetter(c)) // Checking if the character is a letter
      {
        int alphabetPosition = (int) c;
        int shiftedPosition = alphabetPosition + shift; // Shift the position by the shift value
        if (Character.isUpperCase(c)) {
          if (shiftedPosition > 90) {
            shiftedPosition = 65 + (shiftedPosition - 91);
          }
        } else {
          if (shiftedPosition > 122) {
            shiftedPosition = 97 + (shiftedPosition - 123);
          }
        }
        encryptedText.append((char) shiftedPosition);  // Add the shifted letter to the encrypted text
      } else {
        encryptedText.append(c); // If the input is not a letter append
      }
    }
    return encryptedText.toString(); // Return the encrypted text
  }
}
