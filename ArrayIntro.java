/* 
Learn Java The Hard Way 48 : Arrays - Many Values in a Single Variable
This is the original source code provided by the book before any 
changes from the study drill are applied. 

Study Drill: 

Create a second array of Strings and use an initializer list to put several 
values into it. Then add a second foreach loop to display the values from 
the new array on the screen, one at a time.
*/ 
public class ArrayIntro 
{
	public static void main( String[] args ) 
  {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
		                     "Jupiter", "Saturn",  "Uranus",  "Neptune" };

		for ( String p : planets ) 
    {
			System.out.println( p + "\t" + p.toUpperCase() );
		}
	}
}
