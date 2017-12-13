/*
Learn Java the Hard Way Lesson 19 : Mutual Exclusion with Chains of If and Else
This is the original source code provided by the book before any changes were made. 

Study Drill: 

Instead of making the human enter their BMI directly, allow them to type in their
height and weight and compute the BMI for them.
 */ 

import java.util.Scanner; 

public class BMICategories 
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  double height,inches,weight,bmi; 
  double weightConversion, inchesConversion; 
  double actualHeight, actualactualHeight; 
  
  
  System.out.print("Enter your height in feet:"); 
  height = keyboard.nextDouble(); 
  
  System.out.print("Enter your height in inches:"); 
  inches = keyboard.nextDouble(); 
  
  System.out.print("Enter your weight:"); 
  weight = keyboard.nextDouble(); 
  
  weightConversion = weight * 0.45; 
  actualHeight = height * 12 + inches; 
  actualactualHeight = 0.025 * actualHeight;
   
  bmi = weightConversion / (actualactualHeight * actualactualHeight);
  
  System.out.println("Your BMI is: " + bmi); 
  
  System.out.print("BMI category: " ); 
  if (bmi < 15.0) 
  {
   System.out.println( "very severely underweight" ); 
  }
  else if (bmi <= 16.0)
  {
   System.out.println( "severely underweight" ); 
  }
  else if ( bmi < 18.5) 
  {
   System.out.println( "underweight" ); 
  } 
  else if (bmi < 25.0)
  {
   System.out.println( "normal weight" ); 
  }
  else if (bmi < 30.0) 
  {
   System.out.println( "overweight" ); 
  } 
  else if (bmi < 35.0) 
  {
   System.out.println( "moderately obese"); 
  }    
  else if (bmi < 40.0)
  {
   System.out.println("severely obese"); 
  }
  else
  {
   System.out.println( "very severely/\"morbidly\"obese"); 
  }   
 }
}
