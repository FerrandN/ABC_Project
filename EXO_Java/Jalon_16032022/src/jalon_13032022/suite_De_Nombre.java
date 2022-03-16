package jalon_13032022;
import java.util.Scanner;

public class suite_De_Nombre {

	public static void main(String[] args) {
		
		int userInput;
		
		System.out.println("Please, enter a number");
		
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextInt();
		
		for (int i=0; i<12; i++)
		{
			System.out.println(userInput+i);
		}
		sc.close();
	}
}
