package Package;
import java.util.Scanner;
public class exPartTwo
{

	public static void main(String[] args) 
	{
		String userInput;
		char c_userInput;
		double userValue;
		boolean inputWasValid = true;
		double kmToMilesValue = 1.609;
		
		double convertedValue;

		System.out.println("Please enter a value between 0.01 and 1 000 000");
		while (inputWasValid)
		{
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextLine();
			c_userInput = userInput.charAt(0);
			
			
			if (c_userInput == 'q')
			{
				inputWasValid = false;
				System.out.println("have a nice day.");
			}
			else {
				userValue = Double.parseDouble(userInput);
				if (userValue < 0.01 || userValue > 1000000)
				{
					
					System.out.println("Please enter a value between 0.01 and 1 000 000");
				}
				
				else
				{
					convertedValue = userValue/kmToMilesValue;
					System.out.println(userValue+" = "+convertedValue+" Miles");
					inputWasValid = false;
				}
			}
			sc.close();
		}
	}
}

