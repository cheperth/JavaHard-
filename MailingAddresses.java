/*
Learn Java The Hard Way Lesson 53 : Mailing Addresses(Records)
This is the original source code provided by the book before 
any of the changes from the Study Drill were applied. 

Study Drill: 

Create a fourth Address variable online 10 and change the code 
to put your mailing address in it. Don’t forget to print it out at the bottom.
*/ 

class Address 
{
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses 
{
	public static void main(String[] args) 
   {
		Address uno, dos, tres;

		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city   = "Miami";
		uno.state  = "FL";
		uno.zip    = 33179;

		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city   = "Crafton";
		dos.state  = "PA";
		dos.zip    = 15205;

		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city   = "Hickory";
		tres.state  = "NC";
		tres.zip    = 28601;

		System.out.println( uno.street );
		System.out.println( uno.city + ", " + uno.state + "  " + uno.zip );
		System.out.println( "\n" + dos.street );
		System.out.println( dos.city + ", " + dos.state + "  " + dos.zip );
		System.out.println( "\n" + tres.street );
		System.out.println( tres.city + ", " + tres.state + "  " + tres.zip );
	}
}
