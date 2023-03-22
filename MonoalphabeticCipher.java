package finalcipher;

import java.util.Scanner;

public class MonoalphabeticCipher {

private static final String KEY = "MUALVOZKRNJXQDFSHPEBCTIWYG"; //26 letter  the key for monoalphabetic cipher

public static void runMonoalphabeticCipher_main() // main method for the  monoalphabetic cipher encryption 
{
    Scanner scanner = new Scanner(System.in); // scan the input 
    System.out.println("Enter the plain text to encrypt in MonoalphabeticCipher : ");
    String plainText = scanner.nextLine();

    String encryptedText = performMonoalphabeticCipher(plainText, KEY);

    System.out.println("Encrypted text : " + encryptedText);  // Print the encrypted text
  }

  private static String performMonoalphabeticCipher(String plainText, String key) // method to perform monoalphabetic cipher encryption
  {
    StringBuilder encryptedText = new StringBuilder();

    for (char c : plainText.toCharArray())  // If the character is a letter, then perform the encryption
    {
      if (Character.isLetter(c)) {
        int alphabetPosition = (int) c; // Get the ASCII code of the letter
        int shiftedPosition;
     
        if (Character.isUpperCase(c)) // Checking if the input is uppercase or lowercase
        {
        	
          shiftedPosition = key.charAt(alphabetPosition - 65); // If it's uppercase, get the corresponding character from the key
        } else {
          shiftedPosition = key.charAt(alphabetPosition - 97);
        }
        
        encryptedText.append((char) shiftedPosition); // Append the encrypted character to the encryptedText
      } else {
    	  
        encryptedText.append(c); // If the character is not a letter, just append it to the encryptedText
      }
    }
    return encryptedText.toString();  // Return the encrypted text
  }
}
