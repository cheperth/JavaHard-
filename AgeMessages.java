/*
Learn Java the Hard Way Exercise15:Making Decisions with If Statements
This is the assignment after all of the changes were made. 

Study Drills: 

1. Add one more if comparing their age to 65. If their age is greater than or 
equal to 65, say “You are old enough to retire!”. 

*/

import java.util.Scanner; 

public class AgeMessages
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  int age; 
  
  System.out.print("How old are you? "); 
  age = keyboard.nextInt(); 
  
  System.out.println( "You are: " ); 
  if ( age < 13 )
  {
   System.out.println( "\ttoo young to create a Facebook account" ); 
  }
  if ( age < 16 ) 
  {
   System.out.println("\ttoo young to get a driver's license");
  }
  if ( age < 18 ) 
  { 
   System.out.println("\ttoo young to get a tattoo" ); 
  }
  if ( age < 21 ) 
  {
   System.out.println( "\ttoo young to drink alcohol" ); 
  }
  if ( age < 35 ) 
  {
   System.out.println( "\ttoo young to run for President of the U.S." ); 
   System.out.println( "\t\t(How sad!)" );   
  }
  if ( age >= 65 ) 
  {
   System.out.println( "\tYou are old enough to retire!"); 
  }
 }
}
