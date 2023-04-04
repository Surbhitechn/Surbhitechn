import java.util.Scanner;
class AlfaNumSymbol
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:-");
		char ch= sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z' || ch>= 'a' && ch <= 'z')
		{
			System.out.println(ch+" is an alphabate");
		}
		else if(ch >= '0' && ch <= '9')
		{
			System.out.println(ch+" is a number");
		}
		else
		{
			System.out.println(ch+" is a specail symbol");
		}
	}
}