package finalcipher;

import java.io.IOException;
import java.util.Scanner;

public class cipher_selection {
    /************************************************************************* 
    *  Project 1 for IT501 
    *  Encryption of data. 
    * 
    *  Programmer: Group2
    *  Last modified: 10th February 2023.
    * 
    *  Purpose: This Program allows an instructor to: Encryption of data using Caesar cipher, 
    *  mono-alphabetic cipher and homophonic substitution cipher.
    *
    ***********************************************************************/ 
	 // This method selects the desired cipher based on the user's input by selecting the specfic integer 	    
public static void select(int choice) throws IOException
  {
    switch (choice) {
      case 1:
    	  CaesarCipher.runCaesarCipher_main();  // calling the class CaesarCipher and method runCaesarCipher_main
        break;
      case 2:
    	  MonoalphabeticCipher.runMonoalphabeticCipher_main(); // calling the class MonoalphabeticCipher and method runMonoalphabeticCipher_main
        break;
      case 3:
    	  HomophonicCipher.runHomophonicCipher_main(); // calling the class HomophonicCipher and method runHomophonicCipher_main
        break;
      default:
    	  //If in case of an invalid input for the selection other than the interger
        System.out.println("Invalid choice. Please select a valid option (select options from 1,2 and 3).");
        break;
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 // Prompt user to select a cipher
    System.out.println("Please select the cipher you would like to use:"
        + "\n1. Caesar cipher"
        + "\n2. Mono-alphabetic cipher"
        + "\n3. Homophonic Substitution cipher");
    int choice = input.nextInt();
    try {
      select(choice);
    } catch (IOException e) {
    	// In case of any input/output errors
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}