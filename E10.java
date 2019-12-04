import java.util.*;
class E10
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[1]);
		if(args[0].equals("Female") && (n>=1 && n<=58))
			System.out.println("Interest Rate : 8.2%");
		
		if(args[0].equals("Female") && (n>=59 && n<=120))
			System.out.println("Interest Rate : 7.6%");
		
		if(args[0].equals("Male") && (n>=1 && n<=60))
			System.out.println("Interest Rate : 9.2%");
		
		if(args[0].equals("Male") && (n>=61 && n<=120))
			System.out.println("Interest Rate : 8.3%");
	}
}