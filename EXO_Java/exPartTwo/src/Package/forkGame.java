package Package;
import java.util.Random;
import java.util.Scanner;
public class forkGame 
{

	public static void main(String[] args)
	{
		int min = 0;
		int max = 100;
		int randomNumber;
		String userInput;
		int userInputValue;
		
		int userMin=0;
		int userMax=100;
		
		boolean numberFound = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the selected number between"+min+" "+max+":)");
		randomNumber = genererAleatoire(0,100);
		while (!numberFound)
		{
		
		userInput = sc.nextLine().trim();
		userInputValue = Integer.valueOf(userInput);
		
		if (userInputValue == randomNumber)
		{
			System.out.println("Well done!");
			numberFound = true;
		}
		else if (userInputValue < randomNumber)
		{
			userMin = userInputValue;
			System.out.println("Too low ! \nTry to guess between "+userMin+"-"+userMax);
		}
		else
		{
			userMax = userInputValue;
			System.out.println("Too high ! \nTry to guess between "+userMin+"-"+userMax);
		}
		
		}
		sc.close();
	}
	
	public static int genererAleatoire(int min, int max)
	{
		Random rndObj = new Random();
		return rndObj.nextInt((max+1)-min)+min;
	}
}
