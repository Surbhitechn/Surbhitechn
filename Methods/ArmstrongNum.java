import java.util.*;
class ArmstrongNum
{
	//Method to return len of a num
	static int length(int n)
	{
		int len=0;
		while(n>0)
		{
			len++;
			n/=10;
		}
		return len;
	}
	//Method to check given num is armstrong number
	static boolean isArmstrong(int n)
	{
		int num=n;
		int p=length(n);
		int sum=0;
		while(n>0)
		{
			int b=n%10;
			sum+=(int)Math.pow(b,p);
			n/=10;
		}
		return sum==num;
	}
	//Method to display Armstrong Numbers
	static void displayArmstrongNums(int a, int b)
	{
		for(int i=a; i<=b; i++)
		{
			if(isArmstrong(i))
				System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower range:-");
		int n1 = sc.nextInt();
		System.out.println("Enter higher range:-");
		int n2 = sc.nextInt();
		displayArmstrongNums(n1,n2);
	}
}
