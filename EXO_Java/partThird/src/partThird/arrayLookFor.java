package partThird;
import java.util.Random;
import java.util.Scanner;


public class arrayLookFor 
{

	public static void main(String[] args) 
	{
		int array[] = new int[9];
		//remplit le tableau de nombre aléatoire
		for (int i = 0; i < array.length; i++)
		{
		Random randomNumber = new Random();
		int randomGenerated = randomNumber.nextInt(10 - 1);
		array[i] = randomGenerated;
		}
		
		//tri le tableau par ordre croissant
		for(int i = 0; i < array.length; i++)
		{
			for (int index = 0; index < array[i];index++)
			{
				if (array[i] > array[index])
				{
					int swap = array[i];
					array[i] = array[index];
					array[index]=swap;
					index--;
				}
			}
		}
		
		//cherche le nombre entrée par l'utilisateur
		Scanner sc = new Scanner(System.in);
		String userInput;
		boolean numberFound = false;
		
		System.out.println("Please enter a number");
		userInput = sc.nextLine();
		
		int userInputToInt = Integer.valueOf(userInput);
		
		for (int i = 0; i < array.length;i++)
		{
			if (array[i] == userInputToInt)
			{
				System.out.println(userInput+" was found on memory slot " +i +" in the array");
				numberFound = true;
				
			}
		}
		if (numberFound == false)
		{
			System.out.println("Sorry, number wasn't found ;( ");
		}
		sc.close();
	}

}
