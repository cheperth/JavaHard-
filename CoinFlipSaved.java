/*
Learn Java The Hard Way Lesson 43:Saving a HighScore
This is code after the  changes from the study drill are made. 

Study Drill: 

 Change the program so that it only saves to the high score file if 
 there is a new winner. It currently rewrites the highscore file from 
 scratch every time the program runs, even if there are no changes. 
 */ 

import java.io.File; 
import java.io.PrintWriter; 
import java.util.Scanner; 

public class CoinFlipSaved {
	public static void main( String[]args)throws Exception {
		Scanner keyboard = new Scanner(System.in); 
		String coin, again, bestName, saveFileName = "coin-flip-score.txt"; 
		int streak = 0, best; 
		double gotHeads; 
		
		File f = new File(saveFileName); 
		if ( f.exists() && f.length() > 0 ) { 
			Scanner input = new Scanner(f); 
			bestName = input.next(); 
			best = input.nextInt(); 
			input.close(); 
			System.out.print("HIgh score is " + best); 
			System.out.print(" flips in a row by " + bestName); 
		}
		else {
			System.out.println("Save game file doesn't exist or is empty."); 
			best = -1; 
			bestName = ""; 
		}
		
        do { 
			gotHeads = 0.6; 
			
			if ( gotHeads > 0.5 ) 
			coin = "HEADS"; 
		else 
			coin = "TAILS"; 
		
		System.out.println( "You flip a coin and it is... " + coin );

        if ( gotHeads > 0.5 ) {
		streak++; 
		System.out.println( "\tThat's " + streak + " in a row...." ); 
		System.out.print("\tWould you like to flip again (y/n)?"); 
		again = keyboard.next(); 
	}
	else {
	   streak = 0; 
	   again = "n"; 
	} 
   }while ( again.equals("y")); 
 
   System.out.println( "Final score: " + streak ); 
 
   if ( streak > best ) { 
	   System.out.println("That's a new high score!");
	   System.out.print("Your name: "); 
	   bestName = keyboard.next(); 
	   best = streak; 
	   
	   PrintWriter out = new PrintWriter(f); 
       out.println(bestName); 
       out.println(best); 
       out.close();    
   }
   
   else if ( streak == best ) { 
	   System.out.println("That ties the high score. Cool."); 
   }
   else { 
	   System.out.print("Youl'll have to do better than "); 
	   System.out.print(streak + " if you want a high score."); 
   }
   
   // Save this name and high score to the file. 
   
   
   
   
   
   
   
   
  }
}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
