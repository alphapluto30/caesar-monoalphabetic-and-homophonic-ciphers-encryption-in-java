package finalcipher;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class HomophonicCipher
{
   private static HashMap<Character, List<Character>> homophonicSequence;
   public void initializeHomophonicSequence() //This is a public method which is used to initialize homophonicSequence with character mapping.
    {
        homophonicSequence = new HashMap<Character, List<Character>>(); //Initializing homophonicSequence
        List<Character> aCharacterList = new ArrayList<Character>();  // Character Mapping for letter 'A'
        aCharacterList.add('D');
        aCharacterList.add('9');
        HomophonicCipher.homophonicSequence.put('A', aCharacterList);
        List<Character> bCharacterList = new ArrayList<Character>();  // Character Mapping for letter 'B' and so on ......
        bCharacterList.add('X');
        HomophonicCipher.homophonicSequence.put('B', bCharacterList);
        List<Character> cCharacterList = new ArrayList<Character>();
        cCharacterList.add('S');
        HomophonicCipher.homophonicSequence.put('C', cCharacterList);
        List<Character> dCharacterList = new ArrayList<Character>();
        dCharacterList.add('F');
        HomophonicCipher.homophonicSequence.put('D', dCharacterList);
        List<Character> eCharacterList = new ArrayList<Character>();
        eCharacterList.add('Z');
        eCharacterList.add('7');
        eCharacterList.add('2');
        eCharacterList.add('1');
        HomophonicCipher.homophonicSequence.put('E', eCharacterList);
        List<Character> fCharacterList = new ArrayList<Character>();
        fCharacterList.add('E');
        HomophonicCipher.homophonicSequence.put('F', fCharacterList);
        List<Character> gCharacterList = new ArrayList<Character>();
        gCharacterList.add('H');
        HomophonicCipher.homophonicSequence.put('G', gCharacterList);
        List<Character> hCharacterList = new ArrayList<Character>();
        hCharacterList.add('C');
        HomophonicCipher.homophonicSequence.put('H', hCharacterList);
        List<Character> iCharacterList = new ArrayList<Character>();
        iCharacterList.add('V');
        iCharacterList.add('3');
        HomophonicCipher.homophonicSequence.put('I', iCharacterList);
        List<Character> jCharacterList = new ArrayList<Character>();
        jCharacterList.add('I');
        HomophonicCipher.homophonicSequence.put('J', jCharacterList);
        List<Character> kCharacterList = new ArrayList<Character>();
        kCharacterList.add('T');
        HomophonicCipher.homophonicSequence.put('K', kCharacterList);
        List<Character> lCharacterList = new ArrayList<Character>();
        lCharacterList.add('P');
        HomophonicCipher.homophonicSequence.put('L', lCharacterList);
        List<Character> mCharacterList = new ArrayList<Character>();
        mCharacterList.add('G');
        HomophonicCipher.homophonicSequence.put('M', mCharacterList);
        List<Character> nCharacterList = new ArrayList<Character>();
        nCharacterList.add('A');
        nCharacterList.add('5');
        HomophonicCipher.homophonicSequence.put('N', nCharacterList);
        List<Character> oCharacterList = new ArrayList<Character>();
        oCharacterList.add('Q');
        oCharacterList.add('0');
        HomophonicCipher.homophonicSequence.put('O', oCharacterList);
        List<Character> pCharacterList = new ArrayList<Character>();
        pCharacterList.add('L');
        HomophonicCipher.homophonicSequence.put('P', pCharacterList);
        List<Character> qCharacterList = new ArrayList<Character>();
        qCharacterList.add('K');
        HomophonicCipher.homophonicSequence.put('Q', qCharacterList);
        List<Character> rCharacterList = new ArrayList<Character>();
        rCharacterList.add('J');
        HomophonicCipher.homophonicSequence.put('R', rCharacterList);
        List<Character> sCharacterList = new ArrayList<Character>();
        sCharacterList.add('R');
        sCharacterList.add('4');
        HomophonicCipher.homophonicSequence.put('S', sCharacterList);
        List<Character> tCharacterList = new ArrayList<Character>();
        tCharacterList.add('U');
        tCharacterList.add('6');
        HomophonicCipher.homophonicSequence.put('T', tCharacterList);
        List<Character> uCharacterList = new ArrayList<Character>();
        uCharacterList.add('O');
        HomophonicCipher.homophonicSequence.put('U', uCharacterList);
        List<Character> vCharacterList = new ArrayList<Character>();
        vCharacterList.add('W');
        HomophonicCipher.homophonicSequence.put('V', vCharacterList);
        List<Character> wCharacterList = new ArrayList<Character>();
        wCharacterList.add('M');
        HomophonicCipher.homophonicSequence.put('W', wCharacterList);
        List<Character> xCharacterList = new ArrayList<Character>();
        xCharacterList.add('Y');
        HomophonicCipher.homophonicSequence.put('X', xCharacterList);
        List<Character> yCharacterList = new ArrayList<Character>();
        yCharacterList.add('B');
        HomophonicCipher.homophonicSequence.put('Y', yCharacterList);
        List<Character> zCharacterList = new ArrayList<Character>();
        zCharacterList.add('N');
        HomophonicCipher.homophonicSequence.put('Z', zCharacterList);
    }
    
    public String encrypt(String plainText)
    {
        StringBuilder cipherText = new StringBuilder(""); // used to store cipher text
        
        for (int i = 0; i < plainText.length(); i++) // Iterates through plainText
        {
 List<Character> characterList = HomophonicCipher.homophonicSequence.get(plainText.charAt(i)); // Gets List of mapping characters to the current character

            if (characterList != null)  // If character mapping is found
            {
                Integer indexToUse = new Random().nextInt(characterList.size()); // Random character index is picked from the set of characters

                cipherText.append(characterList.get(indexToUse));
            }
            // If character mapping is not found
            else
            {
                cipherText.append(plainText.charAt(i));
            }
        }

        return cipherText.toString();  // cipher text is retured
        
    }
    public static void runHomophonicCipher_main()
    {
        String           plainText;                                
        Scanner          scan             = new Scanner(System.in); 
        HomophonicCipher homophonicCipher = new HomophonicCipher(); 
        // Initializing homophonicCipher
        homophonicCipher.initializeHomophonicSequence();
        System.out.println("Enter the plain text to encrypt in HomophonicCipher : "); // Asking user to enter the input plain text
        plainText = scan.nextLine();
        String cipherText = homophonicCipher.encrypt(plainText.toUpperCase());
        System.out.println("Encrypted text : " + cipherText);  // Printing cipher text
        scan.close();
    }
}
