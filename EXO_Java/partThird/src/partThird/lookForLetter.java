package partThird;
import java.util.Scanner;

public class lookForLetter {

	public static void main(String[] args) 
	{
		String userInput;
		char input[];
		char letterToCount = 'a';

		int letterCount = 0;
		boolean end = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your sentence");
		userInput = sc.nextLine();

		input = userInput.toCharArray();

		if (input.length == 0)
		{
			System.out.println("No sentence found");
			end = true;
		}
		if (!end)
		{
			if (input.length < 2)
			{
				if (input[0] == '.')
				{
					System.out.println("LA CHAINE EST VIDE");
					end = true;
				}
			}
		}
		else if (input.length < 120)
		{
			System.out.println("sentence must have more than 120 letters");
			end = true;
		}


		if (!end)
		{
			for (letterToCount = 'a'; letterToCount <= 'z'; letterToCount++)
			{
				letterCount = 0;
				for (int i = 0; i < input.length ; i++)
				{
					if (letterToCount == input[i])
					{
						letterCount++;
					}
				}

				if (letterCount == 0)
				{
					System.out.println(letterToCount+" Not found");
				}
				else
				{
					System.out.println(letterToCount +" is present " +letterCount +" times");
				}
			}
		}
		sc.close();

	}

}
