import java.util.*;
class E5
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
			num=s.nextInt();
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}
		