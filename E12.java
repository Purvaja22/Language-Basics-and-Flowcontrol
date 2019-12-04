import java.util.*;
class E12
{
	public static void main(String args[])
	{
		String colour;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character in upper case");
			colour=s.nextLine();
		switch(colour)
		{
			case "R": System.out.println("RED");
					break;
			case "W": System.out.println("WHITE");
					break;
			case "O": System.out.println("ORANGE");
					break;
			case "Y": System.out.println("YELLOW");
					break;
			case "G": System.out.println("GREEN");
					break;
			case "B": System.out.println("BLUE");
					break;
			default: System.out.println("Invalid Code");
		}
}
}