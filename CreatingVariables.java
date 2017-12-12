  /* 
  Learn Java the Hard Way Exercise 5.
  Provided code before any changes are made. 
  Study Drill: Add four more variables to the program: another integer, 
  another double, and two Strings. 
  Name them whatever you want. Give them values. Print them out.
 */ 




public class CreatingVariables 
  { 
   public static void main( String[] args ) 
   {  
    int x, y, age; 
    double seconds, e, checking; 
    String firstName, lastName, title; 
       
    x = 10; 
    y = 400; 
    age = 39;
    seconds = 4.71; 
    e = 2.71828182845904523536; 
    checking = 1.89; 
    firstName = "Graham"; 
    lastName = "Mitchell"; 
    title = "Mr."; 
    System.out.println( "The variable x contains " + x ); 
    System.out.println( "The value " + y + " is stored in the variable y." ); 
    System.out.println( "The experiment took " + seconds + " seconds." ); 
    System.out.println( "A favorite irrational # is Euler's number: " + e ); 
    System.out.println( "Hopefully you have more than $" + checking + "!" ); 
    System.out.println( "My name's " + title + " " + firstName + lastName ); 
    } 
   }
