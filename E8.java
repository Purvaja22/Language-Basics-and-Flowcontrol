import java.util.*;
class E8 
{
	public static void main(String[] args) 
	{
        	char c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a characters");
			c=s.nextChar();
        	if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            		System.out.println(c + "Alphabet");
		if( (c >= '0' && c <= '9') || (c >= '0' && c <= '9'))
            		System.out.println(c + "Digit");
        	else
            		System.out.println(c + "Special Symbol");
    }
}