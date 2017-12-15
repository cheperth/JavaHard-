/*
Learn Java The Hard Way 40 : Programs that Write to Files
This is the code after the changes from the Study Drills were 
applied.

Assignment parameter: 

Pick a price per gallon and put it into a double variable, 
then let the human enter in how many gallons of gas they want. 
Figure out the total cost. Then print the receipt to the file, 
but substitute their details so the file will look different 
depending on what they put in. I would remove the bars on the 
right side of the receipt, since making things line up would be hard.
*/ 

import java.util.Scanner; 
import java.io.IOException; 
import java.io.PrintWriter; 

public class ReceiptRevisetedException { 
	public static void main( String[]args ) {
		Scanner keyboard = new Scanner(System.in); {
		
		double milePerGallon; 
		double gasPrice; 
		double finalTotal; 
		
		System.out.println("What was the Gas Price?"); 
		gasPrice = keyboard.nextDouble();
		
		System.out.println("What was the Miles Per Gallon?"); 
		milePerGallon = keyboard.nextDouble();
		
		finalTotal = gasPrice * milePerGallon; 
		
		System.out.println("The final is" + " " + finalTotal + "."); 
		
		PrintWriter fileout; 
		
		try {
			fileout = new PrintWriter("receipt.txt"); 
		}
		catch (IOException err) {
			System.out.println("Sorry, I can't open 'receipt.txt' for writing."); 
			System.out.println("Maybe the file exists and is read-only?"); 
			fileout = null; 
			System.exit(1); 
			
		}
		
		fileout.println( "     CORNER STORE    " );
		fileout.println( "                     " ); 
		fileout.println( "2014-06-25   04:38PM " ); 
		fileout.println( "                     " ); 
		fileout.println( "Gallons:" + " " + gasPrice + " " + "per gallon. " ); 
		fileout.println( "Price/gallon:  $"+milePerGallon       ); 
		fileout.println( "                                         " ); 
		fileout.println( "Fuel total:    $"+finalTotal          ); 
		fileout.close(); 

		
		
		
	}
  } 
}
		
