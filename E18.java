import java.util.*;
class E18
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not");
		int n=s.nextInt();
		int i;
		int c=0;
		if(n==0 || n==1)
			System.out.println("Number "+n+" is neither prime nor composite");
		else
		{
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
					c=c+1;
			}
			if(c>2)
				System.out.println("Number "+n+" is a composite");
			else
				System.out.println("Number "+n+" is a prime");
		}
	}
}