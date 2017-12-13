/*
Learn Java The Hard Way Lesson 28 : Using Loops for Error-Checking
The is the code after the  changes from the Study Drill were applied.

Study Drill: 

Add another input protection loop toward the top of the program. 
Ask them “Are you ready?!?” and don’t go on until they reply "YES!". 
Remember to use .equals() to compare Strings and use ! for “not”.
*/ 

import java.util.Scanner; 

public class SafeSquareRoot
{ 
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  double x, y; 
  String YES, ready; 
  
  System.out.println("Are you ready?"); 
  ready = keyboard.next(); 
  
  while (!ready.equals("YES"))
  {	  
   System.out.println("You are not ready.");
   System.out.println("Lets try again.\n"); 
   System.out.println("Are you ready?"); 
   ready = keyboard.next();
  }
  
  System.out.print("Give me a number, and I'll find its square root."); 
  System.out.print("(No negatives, please.)"); 
  x = keyboard.nextDouble(); 
  
  while ( x < 0 )
  {
   System.out.println("I won't take the square root of a negative."); 
   System.out.print("\nNew number:"); 
   x = keyboard.nextDouble(); 
  }
  
  y = Math.sqrt(x); 
  
  System.out.println("The square root of "+x+" is "+y); 
 }
}
