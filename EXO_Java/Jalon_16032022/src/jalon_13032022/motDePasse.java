package jalon_13032022;
import java.util.Scanner;

public class motDePasse {

	public static void main(String[] args) {
		
		String userInput;
		String password = "Bonjour";
		int mistakes = 3;
		
		boolean passwordFound = false;
		
		System.out.println("Please, enter your password");
		
		Scanner sc = new Scanner(System.in);

		
		while (!passwordFound)
		{
			userInput = sc.nextLine();
			
			boolean mistakeFound = false;
			
			for (int i=0; i<userInput.length();i++)
			{
				if (password.charAt(i) != userInput.charAt(i))
				{
					mistakeFound = true;
				}
			}
			if (mistakeFound == true)
			{
				mistakes--;
				System.out.println("wrong answer, you have "+mistakes+" try left");
			}
			else
			{
				System.out.println("Vous êtes connecté");
				passwordFound = true;
			}
			
			if (mistakes == 0)
			{
				passwordFound = true;
				System.out.println("Echec de l'authentification");
			}
			
		}
		sc.close();
	}

}
