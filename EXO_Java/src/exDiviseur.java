import java.util.Scanner;
public class exDiviseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userEntry;
		int remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bonjour, quel est le nombre que vous pensez être un nombre parfait");
		userEntry = sc.nextInt();
		System.out.println("Voici tout les diviseurs: \n");
		for (int i=2; i<userEntry; i++)
		{
			remainder = userEntry%i;
			if(remainder == 0)
			{
				System.out.println(i);
			}
		}
		
	}

}
