import java.util.Scanner;
public class RunMeRevised
{

	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CalcTypes calc = new CalcTypes();
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		System.out.print("Enter a second number: ");
		double num2 = sc.nextDouble();
		System.out.println("The sum is: " + calc.addBoth(num,num2));
		System.out.println("The difference is: " + calc.subtractBoth(num,num2));
		System.out.println("The product is: " + calc.multBoth(num,num2));
		System.out.println("The quotient is: " + calc.diviBoth(num,num2));
	}
}