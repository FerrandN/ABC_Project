package Package;
import java.util.Scanner;
public class barnabe 
{

	public static void main(String[] args) 
	{
		int shopCount = 0;
		double barnabeMoney;
		String userInput;
		
		System.out.println("How much money does Barnabe have?");
		Scanner sc = new Scanner(System.in);
		
		userInput = sc.next();
		barnabeMoney = Double.parseDouble(userInput);
		
		while (barnabeMoney > 1)
		{
			if (barnabeMoney <= 2)
			{
				shopCount++;
				System.out.println("Barnab� a d�pens� ces derniers "+barnabeMoney+" �"+"dans le "+shopCount+" magasin");
				barnabeMoney = 0;
			}
			else
			{
			barnabeMoney = (barnabeMoney/2)-1;
			shopCount++;
			System.out.println("Barnab� a "+barnabeMoney+" �"+" apr�s avoir visit� "+shopCount+"magasin");
			}
		}
		sc.close();
	}

}