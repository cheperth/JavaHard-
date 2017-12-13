/*
Learn Java The Hardway Lesson 25 : Repeating Yourself with the While Loop
This is code after the changes from the Study Drill were applied. 

Study Drill: 

Before you ask the person for a PIN, ask them for a password. (ItshouldbeaString.) 
Then add a second while loop before the first one that loops as long as their 
answer is not the right password. So after you’re done, the person must enter 
the correct password and then enter the correct PIN in order to see their 
account balance. Remember that you need to use .equals() when comparing Strings, 
and “not equals” looks like this: ( ! typedPassword.equals("hunter2") ) 
*/ 

import java.util.Scanner; 

public class EnterPIN
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  String password, entry; 
  
  password = "gloryhole"; 
  
  System.out.println("WELCOME TO THE BANK OF JAVA."); 
  System.out.println("ENTER YOUR PIN:"); 
  entry = keyboard.next(); 
  
  while( !entry.equals("gloryhole")
  { 
   System.out.println("\nINCORRECT PIN. TRY AGAIN."); 
   System.out.println("ENTER YOUR PIN:"); 
   entry = keyboard.next(); 
  } 
  
  System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17"); 
 }
}
