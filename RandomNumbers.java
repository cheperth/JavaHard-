/*
Learn Java The Hard Way 24 : Choosing Numbers Randomly
This is the code after the changes from the Study Drill were 
applied. 

Study Drill: 

1. Add extra code at the bottom to make the computer pick three random integers from 1 to 3 
and print them out on the screen. 2. Add code to pick three random integers from 
5 to 10 and display them. Run the program a bunch of times to confirm your numbers 
always stay in that range.
*/ 

public class RandomNumbers
{
 public static void main(String[]args)
 {
  int a, b, c, d; 
  double r, rps; 
  
  rps = Math.random(); 
  if ( rps < 0.3333333 ) // will be true 1/3 of the time
  {
   System.out.println( "ROCK" ); 
  }
  else if ( rps < 0.6666667 ) 
  {
   System.out.println( "PAPER" ); 
  }
  else 
  {
   System.out.println("SCISSORS"); 
  }
  
  // pick four random integers, each 1-10
  a = 1 + (int)(10*Math.random()); 
  b = 1 + (int)(10*Math.random()); 
  c = 1 + (int)(10*Math.random()); 
  d = 1 + (int)(10*Math.random()); 
  System.out.println( "1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d ); 
  
  // pick four random integers, each 1-6
  a = 1 + (int)(6*Math.random());
  b = 1 + (int)(6*Math.random());
  c = 1 + (int)(6*Math.random());
  d = 1 + (int)(6*Math.random());

  System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d ); 

  // pick a single random integer, 1 - 100
  a = 1 + (int)( 100*Math.random()); 
  System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a + "\t" + a ); 

  // pick four random integers, each 1-100
  a = 1 + (int)( 100*Math.random()); 
  b = 1 + (int)( 100*Math.random()); 
  c = 1 + (int)( 100*Math.random()); 
  d = 1 + (int)( 100*Math.random());  
  System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d ); 
  
  //pick four random integers, each 0-99
  a = 0 + (int)( 100*Math.random()); 
  b = 0 + (int)( 100*Math.random()); 
  c = (int)( 100*Math.random()); 
  d = (int)( 100*Math.random()); 
  System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d ); 
  
  //pick four random integers, each 10-20
  a = 10 + (int)( 11*Math.random()); 
  b = 10 + (int)( 11*Math.random()); 
  c = 10 + (int)( 11*Math.random()); 
  d = 10 + (int)( 11*Math.random()); 
  System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d ); 
  
  // display four random doubles, each [0-1) 
  System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random()); 
  System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random());
  
  r = 10 * Math.random(); 
  System.out.println( "0-9.99:\t" + r ); 
  System.out.println( "0-9:\t" + (int)r); 
  System.out.println( "1-10:\t" + (1+(int)r)); 
  
  int q = 1 + (int)(3*Math.random()); // picks int from 1 to 3
  System.out.println( "1 - 3\t" + q );
  
  int z = 5 + (int)(6*Math.random()); // picks int from 5 to 10
  System.out.println( "5-10\t" + z); 
 }
} 
  
