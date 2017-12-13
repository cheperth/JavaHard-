/*
Learn Java the Hard Way Lesson 12 Boolean Expressions.
This is the original source code provided by the book 
before any changes are made. 
Study Drill: 1. Add comments at the bottom re-typing all six operators and their meanings. 
For example: // less than is < // greater than is >
*/ 

import java.util.Scanner;

public class BooleanExpressions 
{
	public static void main( String[] args ) 
 {
		Scanner keyboard = new Scanner(System.in);
		boolean a, b, c, d, e, f;
		double x, y;

		System.out.print( "Give me two numbers. First: " );
		x = keyboard.nextDouble();
		System.out.print( "Second: " );
		y = keyboard.nextDouble();

		a = (x <  y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x >  y);
		f = (x >= y);

		System.out.println( x + " is LESS THAN " + y + ": " + a );
		System.out.println( x + " is LESS THAN / EQUAL TO " + y + ": " + b );
		System.out.println( x + " is EQUAL TO " + y + ": " + c );
		System.out.println( x + " is NOT EQUAL TO " + y + ": " + d );
		System.out.println( x + " is GREATER THAN " + y + ": " + e );
		System.out.println( x + " is GREATER THAN / EQUAL TO " + y + ": " + f );
		System.out.println();

		System.out.println( !(x < y) + " " + (x >= y) );
		System.out.println( !(x <= y) + " " + (x > y) );
		System.out.println( !(x == y) + " " + (x != y) );
		System.out.println( !(x != y) + " " + (x == y) );
		System.out.println( !(x > y) + " " + (x <= y) );
		System.out.println( !(x >= y) + " " + (x < y) );
	}
}
