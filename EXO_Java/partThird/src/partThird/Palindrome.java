package partThird;
import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		boolean isPalindrome = true;
		boolean emptyInput = true;

		String userInput;

		Scanner sc = new Scanner(System.in);

		
		do{
			System.out.print("Please, enter a sentence that you think is a palindrome");
			userInput = sc.nextLine();
			
			if (userInput.length() > 0)
			{
				emptyInput = false;
			}
			else
			{
				System.out.println("no sentence detected. Please retry");
			}
		}while (emptyInput);
		
		userInput = userInput.replace(" ", "");

		int i=0;
		if (userInput.length() > 2) {
			while (isPalindrome && i < userInput.length()/2) {
				if (userInput.charAt(i) != userInput.charAt(userInput.length()-(i+1)))
					isPalindrome = false;
				i++;
			}
		}
		
		if (isPalindrome == true)
		{
			System.out.println("Sentence is a palindrome, weldone !");
		} else
		{
			System.out.println("Sentence is not a palindrome");
		}
		
		sc.close();
	}

}
