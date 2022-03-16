package jalon_13032022;
import java.util.Scanner;
public class first_EX_PlageDeValeur {

	public static void main(String[] args) {
		
		int userInput;
		
		System.out.println("Please, enter a number between 5 and 10");
		
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextInt();
		
		if (userInput > 10)
		{
			System.out.println("Number is too high !");
		}
		else if (userInput < 5)
		{
			System.out.println("Number is too low !");
		}
		else
		{
			System.out.println(userInput+" is correct");
		}
		sc.close();
	}

}
