/*Learn Java the Hard Way after changes are made.*/ 

mport java.util.Scanner; 

public class RudeQuestions
{
 public static void main(String[]args)
 {
  String name; 
  int age, weight; 
  double income, bankBalance; 
 
  Scanner keyboard = new Scanner(System.in); 
 
  System.out.print( "Hello. What is your name?" ); 
  name = keyboard.next(); 
 
  System.out.print( "Hi, " + name + "!" + " " + "How old are you?" ); 
  age = keyboard.nextInt(); 
 
  System.out.println( "so you're " + age + ", eh? That's not very old." ); 
  System.out.print( "How much do you weigh, " + name + "? " ); 
  weight = keyboard.nextInt(); 
 
  System.out.println( weight + "! Better keep that quite!!" ); 
  System.out.print( "Finally, what's your income, " + name + "? " ); 
  income = keyboard.nextDouble(); 
  
  System.out.print( "Hopefully that is " + income + " per hour" ); 
  System.out.println( " and not per year!" ); 
  
  System.out.print( "What is your bank balance?" ); 
  bankBalance = keyboard.nextDouble(); 
  System.out.println( "Your bank balance is " + bankBalance + ".\n" + "That's fucked up!!!!");
  System.out.print( "Well, thanks for answering my rude question, " ); 
  System.out.println( name + "." ); 
 }
}
 
