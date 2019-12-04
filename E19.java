import java.util.*;
class E19
{
	public static void main(String args[])
	{
		int number,t,sum,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
			number=s.nextInt();
		sum=0;
		t=number;
		while(number>0)
		{
			r=number%10;
			sum=sum+r;
			number=number/10;
		}
		System.out.println("The sum of digits in "+t+" is "+sum);
	}
} 