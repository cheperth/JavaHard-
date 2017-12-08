/*Learn Java the Hard Way assignment. Code that was provided by the author plus changes that were made afterwards.*/ 

import java.util.Scanner; 

public class BMICalculator
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  double inches, pounds, feet, bmi; 
  
  System.out.print("What is your height in feet?");
  feet = keyboard.nextDouble();
  
  System.out.print("and inches?: "); 
  inches = keyboard.nextDouble(); 
  
  System.out.print("Your weight in pounds: "); 
  pounds = keyboard.nextDouble(); 
  
  inches = feet * 12 + inches; 
  bmi = pounds * 703 / (inches * inches); 
  
  System.out.println( "Your BMI is " + bmi ); 
  }
 } 
