import java.util.*;
class E22
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a palindrome or not");
		int number=s.nextInt();
		int t=number;
		int rev=0,r;
		while(number>0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		if(rev==t)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}
}	