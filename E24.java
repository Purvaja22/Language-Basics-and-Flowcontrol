import java.util.*;
class E24
{
	public static void main(String args[])
	{
		int a,b,sum,diff;
		String m;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("****MENU****");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("Enter your option");
			int opt=s.nextInt();
			switch(opt)
			{
				case 1: System.out.println("Enter two integers for addition");
					a=s.nextInt();
					b=s.nextInt();
					sum=a+b;
					System.out.println("The sum of entered two integers is:"+sum);
					break;
				case 2: System.out.println("Enter two integers for subtraction");
					a=s.nextInt();
					b=s.nextInt();
					if(a>b)
						diff=a-b;
					else if(b>a)
						diff=b-a;
					else
						diff=0;
					System.out.println("The difference of entered two integers is:"+diff);
					break;
				default: System.out.println("Enter valid option");
			}
			System.out.println("Do you want to continue(Y/N)");
			m=s.nextLine();
		}while(m.equals("Y") || m.equals("y"));
	}
}