/*
Learn Java The Hard Way Lesson 54 : Records from a File
This is the original source code provided by the book before 
any of the changes from the study drill were applied. 

Study Drill: 

Add a counter inside the loop that reads in all the records. 
After the loop is over display a message on the screen about 
how many records were processed.
*/ 

import java.util.Scanner;

class Actor 
{
	String name;
	String role;
	String birthdate;
}

public class ActorList 
{
	public static void main(String[] args) throws Exception 
  {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		// Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());

		while ( inFile.hasNext() ) 
    {
			Actor a = getActor(inFile);
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.println(" and played " + a.role);
		}
		inFile.close();
	}

	public static Actor getActor( Scanner input ) 
  {
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();

		return a;
	}
}
