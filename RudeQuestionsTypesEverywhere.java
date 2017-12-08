/*Learn Java the Hard way assignment. Code provided by the author before any changes are made.*/ 

public class RudeQuestionsTypesEverywhere 
 { 
  public static void main( String[] args ) 
  { 
   keyboard[Scanner] = new Scanner(System.in); 
   System.out.print( "Hello. What is your name? " ); 
   name[String] = keyboard[Scanner].next(); 
   System.out.print( "Hi, " + name[String] + "! How old are you? " ); 
   age[int] = keyboard[Scanner].nextInt(); 
   System.out.println("So you're " + age[int] + ", eh? That's not so old."); 
   System.out.print( "How much do you weigh, " + name[String] + "? " ); 
   weight[double] = keyboard[Scanner].nextDouble(); 
   System.out.println( weight[double] + "! Better keep that quiet!!" ); 
   System.out.print("Finally, what's your income, " + name[String] + "? " );
   income[double] = keyboard[Scanner].nextDouble(); 
   System.out.print( "Hopefully that is " + income[double] + " per hour" ); 
   System.out.println( " and not " ); 
   System.out.print( "Well, thanks for answering my rude questions, " ); 
   System.out.println( name[String] + "." ); 
   } 
  }
