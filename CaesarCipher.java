/*
Learn Java the Hard Way 45: Caesar Cipher (Looping ThroughaString)
This is the code after changes 
from the study drill were applied. 

Study Drill: 

Modify the code to read the plain text message from a text file 
instead of letting the human type it in. Then, instead of just 
displaying the ciphertext on the screen, add code to store the 
ciphertext into a file.
*/ 

import java.util.Scanner;
import java.io.File; 
import java.io.PrintWriter; 


public class CaesarCipher {
	/**
	 * Returns the character shifted by the given number of letters.
	 */
	public static char shiftLetter( char c, int n ) {
		int u = c;

		if ( ! Character.isLetter(c) )
			return c;

		u = u + n;
		if ( Character.isUpperCase(c) && u > 'Z'
	      || Character.isLowerCase(c) && u > 'z' ) {
			u -= 26;
		}
		if ( Character.isUpperCase(c) && u < 'A'
		  || Character.isLowerCase(c) && u < 'a' ) {
			u += 26;
		}

		return (char)u;
	}

	public static void main( String[] args ) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		//i added the String variable fileName
		String plaintext, fileName, fileNameOut, cipher = "";
		int shift; 
		
		System.out.print( "What file do you want to read from?" ); 
                fileName = keyboard.nextLine(); 
         
		//I tried to get the Scanner file in to accept user input
		Scanner fileIn = new Scanner(new File(fileName));  
		plaintext = fileIn.nextLine();		
		shift = fileIn.nextInt(); 
		fileIn.close(); 
		
		System.out.println("Encrypting message: " + plaintext); 
		System.out.println("Using shift: " + shift); 
		

		for ( int i=0; i<plaintext.length(); i++ ) {
			cipher += shiftLetter( plaintext.charAt(i), shift);
		}
		
		System.out.println("What file do you want to print out to?"); 
		fileNameOut = keyboard.nextLine(); 
		
		
		
		//store the ciphertext into a file
		PrintWriter owt = new PrintWriter(fileNameOut); 
	        owt.println( cipher );
		owt.close(); 
		
		System.out.println("cipher-in.txt"); 
		
		
		
	}
}
