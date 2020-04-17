import java.util.Scanner;
class SumTwoNumbers
{
	public static void main(String args[])
	{
		int n1,n2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 value:");
		n1=sc.nextInt();
		
		System.out.println("Enter n2 value:");
		n2=sc.nextInt();
		sc.close();
		sum=n1+n2;
		System.out.println("Sum of two numbers is:"+sum);
	}
}