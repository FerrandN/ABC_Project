package Package;
import java.util.Scanner;
public class degreeToFarhenheitAllValue 
{

	public static void main(String[] args) 
	{
		String measureUnit;
		double maxValue;
		double minValue;
		double result;

		boolean userQuit = false;
		Scanner sc = new Scanner(System.in);

		while (!userQuit)
		{
			System.out.println("Enter C to convert Celsius to farhenheit, else enter F to convert farhenheit to Celsius");
			measureUnit = sc.nextLine();

			if (measureUnit.equals("quit"))
			{
				userQuit = true;
			}
			else if (measureUnit == "C")
			{
				System.out.println("Enter min value");
				minValue = sc.nextInt();

				System.out.println("Enter max value");
				maxValue = sc.nextInt();

				for (double i = minValue; i < maxValue; i++)
				{
					result = (i*(9d/5d))+32d;
					System.out.println(i+" Celsius = "+result+" farhenheit");
				}
			}
			else
			{
				System.out.println("Enter min value");
				minValue = sc.nextInt();

				System.out.println("Enter max value");
				maxValue = sc.nextInt();

				for (double i = minValue; i < maxValue; i++)
				{
					result = (i-32d)*(5d/9d);
					System.out.println(i+" farhenheit = "+result+" Celsius");
				}
			}
			sc.nextLine();
		}
		sc.close();
	}
}
