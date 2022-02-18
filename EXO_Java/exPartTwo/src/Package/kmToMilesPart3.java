package Package;
import java.util.Scanner;
public class kmToMilesPart3
{

	public static void main(String[] args) 
	{
		String userInput;
		String[] userInputArray;
		boolean userQuit = false;


		Scanner sc = new Scanner(System.in);

		do
		{
			//on cr�� un tableau de 100 cases de m�moire pour y stocker les valeurs que va entrer l'utilisateur
			userInputArray = new String[100];
			int userCount = 0;
			boolean userGo = false;
			
			while (!userGo && !userQuit)
			{
				System.out.println("Please enter value to convert");
				userInput = sc.nextLine();
				
				if (userInput.equals("quit"))
				{
					userQuit = true;
				}
				else if (userInput.equals("go"))
				{
					userGo = true;
				}
				else
				{
					userInputArray[userCount] = userInput;
					userCount++;
				}
			}
			
			for (int i = 0 ; i < userCount; i++)
			{
				String value = userInputArray[i];
				convert(value);
			}

		}while (!userQuit);
sc.close();
	}

	public static void convert(String valueToConvert)
	{
		String[] inputToParse = valueToConvert.split(" ");
		String measure;
		double value;
		double result;

		if (inputToParse.length > 1)
		{
			measure = inputToParse[1];
		}
		else
		{
			measure = "km";
		}
		
		value = Double.parseDouble(inputToParse[0]);
		
		if (measure.equals("mi"))
		{
			result = value*1.609;
			System.out.println(value+"mi = "+result+"km");
		}
		else
		{
			result = value/1.609;
			System.out.println(value+"km = "+result+"mi");
		}
		
	}

}