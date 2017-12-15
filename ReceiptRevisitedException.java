/*
Learn Java The Hard Way 40 : Programs that Write to Files
This is the original source code provided by the book 
before any of the changes from the Study Drills were 
applied.

Study Drill: 

Pick a price per gallon and put it into a double variable, 
then let the human enter in how many gallons of gas they want. 
Figure out the total cost. Then print the receipt to the file, 
but substitute their details so the file will look different 
depending on what they put in. I would remove the bars on the 
right side of the receipt, since making things line up would be hard.
*/ 

import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptRevisitedException {
	public static void main( String[] args ) {
		PrintWriter fileout;

		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err ) {
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}

		fileout.println( "+------------------------+" );
		fileout.println( "|                        |" );
		fileout.println( "|      CORNER STORE      |" );
		fileout.println( "|                        |" );
		fileout.println( "| 2014-06-25  04:38PM    |" );
		fileout.println( "|                        |" );
		fileout.println( "| Gallons:       12.464  |" );
		fileout.println( "| Price/gallon: $ 3.459  |" );
		fileout.println( "|                        |" );
		fileout.println( "| Fuel total:  $ 43.11   |" );
		fileout.println( "|                        |" );
		fileout.println( "+------------------------+" );
		fileout.close();
	}
}

