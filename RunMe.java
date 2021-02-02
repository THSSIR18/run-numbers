import java.util.Scanner;
public class RunMe
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double age1 =sc.nextDouble();
		System.out.print("Enter a second number: ");
		double age2 =sc.nextDouble();
		double answer1 = addBoth(age1,age2);
		System.out.println(answer1);
		double answer2 = subtractBoth(age1,age2);
		System.out.println(answer2);
		double answer3 = multBoth(age1,age2);
		System.out.println(answer3);
		double answer4 = diviBoth(age1,age2);
		System.out.println(answer4);
		
	}
	public static double addBoth(double x, double y)
	{
		return x+y;
	}
	public static double subtractBoth(double x, double y)
	{
		return x-y;
	}
	public static double multBoth(double x, double y)
	{
		return x*y;
	}
	public static double diviBoth(double x, double y)
	{
		return x/y;
	}
}