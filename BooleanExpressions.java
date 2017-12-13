/*
Learn Java the Hard Way Lesson 12 Boolean Expressions.
This is the assignment after the changes are made. 

Study Drill: 1. Add comments at the bottom re-typing all six operators and their meanings. 
For example: // less than is < // greater than is >
*/ 

import java.util.Scanner; 

public class BooleanExpression
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  boolean a, b, c, d, e, f; 
  double x, y; 
  
  System.out.print("Give me two numbers. First: " ); 
  x = keyboard.nextDouble(); 
  System.out.print("Second: "); 
  y = keyboard.nextDouble(); 
  
  a = (x < y); //less than
  b = (x <= y); //less than or equals to
  c = (x == y); //equals to
  d = (x != y); //not equal to 
  e = (x > y); //greater than 
  f = (x >= y); //greater than or equal to
  
  System.out.println( x + " is LESS THAN " + y + ": " + a ); 
  System.out.println( x + " is LESS THAN / EQUAL TO " + y + ": " + b ); 
  System.out.println( x + " is EQUAL TO " + y + ": " + c ); 
  System.out.println( x + " is NOT EQUAL TO " + y + ": " + d ); 
  System.out.println( x + " is GREATER THAN " + y + ": " + e ); 
  System.out.println( x + " is GREATER THAN / EQUAL TO " + y + ": " + f ); 
  System.out.println(); 
  
  System.out.println( !(x < y) + " " + (x >= y) ); 
  System.out.println( !(x <= y) + " " + (x > y) ); 
  System.out.println( !(x == y) + " " + (x != y) ); 
  System.out.println( !(x != y) + " " + (x == y) ); 
  System.out.println( !(x > y) + " " + (x <= y) ); 
  System.out.println( !(x >= y) + " " + (x < y) ); 
 }
}
  
  
  
  
  
