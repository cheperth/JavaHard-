/*
Learn Java the Hard Way Lesson 9: Calculations with User Input.
This is the assignment after the changes are made to it. 
Study Drills: 
1. Add some variables and change the program so that the human can input their 
weight and height using pounds and inches, and then convert those values to kilograms 
and meters to figure the BMI. Your height in inches: 69 Your weight in pounds: 160 Your BMI is 23.625289. 
2. Make it so the human can input their height in feet and inches separately.
Your height (feet only): 5 Your height (inches): 9 Your weight in pounds: 160 Your BMI is 23.625289
*/ 


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
