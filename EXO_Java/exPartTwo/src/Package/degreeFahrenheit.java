package Package;
import java.util.Scanner;
public class degreeFahrenheit {

	public static void main(String[] args) 
	{
		String userInput;
		String[] userInputArray;
		double userValue;
		double result;
		boolean validAnswer = false;

		while (!validAnswer)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter value to convert");
			userInput = sc.nextLine();

			userInputArray = userInput.split(" ");
			userValue = Double.parseDouble(userInputArray[0]);

			if (userInputArray[1].equals("F") || userInputArray[1].equals("C"))
			{
				validAnswer = true;
				if (userInputArray[1].equals("F"))
				{
					result = (userValue-32d)*(5d/9d);
				}
				else
				{
					result = (userValue*(9d/5d))+32d;
				}

				if (result < -459.67 || result > 5000000)
				{
					System.out.println("Incorect value");
				}
				else
				{
					if (userInputArray[1].equals("F"))
					{
						System.out.println(userValue+" F = "+result+" C");

					}
					else
					{
						System.out.println(userValue+" C = "+result+" F");
					}
				}

			}

			else
			{
				System.out.println("Please enter valid answer");
			}

			sc.close();
		}
	}
}
