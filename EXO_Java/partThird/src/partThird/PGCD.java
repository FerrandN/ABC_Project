package partThird;
import java.util.Scanner;

public class PGCD 
{
	public static void main(String[] args) 
	{
		int firstNumber;
		int secondNumber;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please input 2 numbers");
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		
		while (firstNumber != secondNumber)
		{
			if (firstNumber > secondNumber)
			{
				firstNumber = firstNumber - secondNumber;
			}
			else if (firstNumber < secondNumber)
			{
				secondNumber = secondNumber - firstNumber;
			}
		}

		System.out.println(firstNumber);
	}
}
