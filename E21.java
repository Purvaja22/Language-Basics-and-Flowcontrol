import java.util.*;
class E21
{
	public static void main(String args[])
	{
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
			number=s.nextInt();
		int rev=0,r;
		while(number>0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		System.out.println("After reversing, number becomes:"+rev);
	}
}