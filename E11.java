import java.util.*;
class E11
{
	public static void main(String[] args) 
	{       
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.nextChar();
        	if(c.isUpperCase())
			c.toLowerCase();
		else
			c.UpperCase();
}
}