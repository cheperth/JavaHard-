/*
Learn Java The Hardway Lesson 25 : Repeating Yourself with the While Loop
This is the original source code provided by the book before any of the 
changes from the Study Drill were applied. 

Study Drill: 

1. BeforeyouaskthepersonforaPIN,askthemforapassword.(ItshouldbeaString.) 
Thenaddasecond while loop before the first one that loops as long as their 
answer is not the right password. So after you’re done, the person must enter 
the correct password and then enter the correct PIN in order to see their 
account balance. Remember that you need to use .equals() when comparing Strings, 
and “not equals” looks like this: ( ! typedPassword.equals("hunter2") ) 
*/ 

import java.util.Scanner;

public class EnterPIN 
{
	public static void main( String[] args ) 
  {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;

		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}
