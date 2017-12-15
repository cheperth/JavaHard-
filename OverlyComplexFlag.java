/*
Learn Java the Hard Way Lesson 34 : Calling Functions to Draw a Flag
This is the source code after the changes from the study drill are applied.

Study Drill: 

At the end of main() add a function call to run this function 
so that it shows up underneath the flag.
*/ 



import static java.lang.System.*; 

public class OverlyComplexFlag
{
 public static void main(String[]args)
 {
  printTopHalf(); 
  print48Colons(); 
  print48Ohs(); 
  print48Colons(); 
  print48Ohs(); 
  print48Colons();
  print48Ohs(); 
  printPledge();
 }
 
 public static void print48Colons()
 {
  out.println( "|:::::::::::::::::::::::::::::::::::::::::|" ); 
 }
 
 public static void print48Ohs()
 {
  out.println("|00000000000000000000000000000000000000000|" ); 
 } 
 
 public static void print29Colons()
 {
  out.println( " |:::::::::::::::::::::::::::::|"); 
 }
 
 public static void printPledge()
 {
  out.println( "I pledge allegiance to the flag." ); 
 }
 
 public static void print290hs()
 {
  out.println( "|00000000000000000000000000000|" ); 
 }
 
 
 
 public static void print6Stars()
 {
  out.print( "|* * * * * *" ); 
 } 
 
 public static void print5Stars()
 {
  out.print( "| * * * * *"); 
 } 
 
 public static void printSixStarLine()
 {
  print6Stars(); 
  print290hs(); 
 }
 
 public static void printFiveStarLine()
 {
  print5Stars(); 
  print29Colons(); 
 } 
 
 public static void printTopHalf()
 {
  out.println( " _________________________________________" ); 
 
  // the line above has 1 space then 48 underscores between the quotes
  
  printSixStarLine(); 
  printFiveStarLine(); 
  printSixStarLine(); 
  printFiveStarLine(); 
  printSixStarLine(); 
  printFiveStarLine();  
  printSixStarLine(); 
 }
 
}
 
