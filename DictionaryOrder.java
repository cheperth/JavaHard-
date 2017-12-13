/*
Learn Java Hard Way Lesson 23 : More String Comparisons

The is the code after the changes from the Study Drill were applied. 

Study Drill: 

Using the technique of your choice, make this program work correctly 
even if the human types in words with different capitalization.
*/ 



import java.util.Scanner; 

public class DictionaryOrder
{
 public static void main(String[]args)
 {
  Scanner keyboard = new Scanner(System.in); 
  String name; 
  
  System.out.print("Make up the name of a programming language!");
  name = keyboard.nextLine(); 
  
  if ( name.compareToIgnoreCase("c++") < 0 )
      System.out.println( name + "comes BEFORE c++" ); 
  if ( name.compareToIgnoreCase("c++") == 0 ) 
      System.out.println( "c++ isn't a made-up language!"); 
  if ( name.compareToIgnoreCase("c++") > 0 )
      System.out.println( name + " comes AFTER c++" );
	  
  if ( name.compareToIgnoreCase("go") < 0 )
      System.out.println( name + " comes BEFORE go" ); 
  if ( name. compareToIgnoreCase("go") == 0 ) 
      System.out.println( "go isn't a made-up language!"); 
  if ( name.compareToIgnoreCase("go") > 0 ) 
      System.out.println( name + " comes AFTER go" ); 
	  
  
  if ( name.compareToIgnoreCase( "java" ) < 0 )
       System.out.println( name + " comes BEFORE java" ); 
  if ( name.compareToIgnoreCase( "java" ) == 0 ) 
       System.out.println("java isn't a made-up language!"); 
  if ( name.compareToIgnoreCase("java") > 0 )
       System.out.println( name + " comes AFTER java" ); 
	   
  if ( name.compareToIgnoreCase("lisp") < 0 ) 
       System.out.println( name + " comes BEFORE lisp" ); 
  if ( name.compareToIgnoreCase("lips") == 0 ) 
       System.out.println( "lisp isn't a made-up language!" ); 
  if ( name.compareToIgnoreCase("lisp") > 0 ) 
       System.out.println( name + " comes AFTER lisp" ); 
	   
  if ( name.compareToIgnoreCase("python" ) < 0 ) 
       System.out.println( name + " comes BEFORE python" ); 
  if ( name.compareToIgnoreCase("python") == 0 ) 
       System.out.println( "python isn't a made-up language!" ); 
  if ( name.compareToIgnoreCase("python") > 0 )
       System.out.println( name + " comes AFTER python" ); 
	   
  if ( name.compareToIgnoreCase("ruby") < 0 ) 
       System.out.println( name + " comes BEFORE ruby" ); 
  if ( name.compareToIgnoreCase("ruby") == 0 ) 
       System.out.println("ruby isn't a made-up language!"); 
  if ( name.compareToIgnoreCase("ruby") > 0 ) 
       System.out.println( name + " comes AFTER ruby" ); 
  
  if ( name.compareToIgnoreCase("visualbasic") < 0 ) 
       System.out.println( name + " comes BEFORE visualbasic" ); 
  if ( name.compareToIgnoreCase("visualbasic") == 0 ) 
       System.out.println("visualbasic isn't a made-up language!" ); 
  if ( name.compareToIgnoreCase("visualbasic") > 0 ) 
       System.out.println( name + " comes AFTER visualbasic" ); 
 }
} 
  
