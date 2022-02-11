import java.util.Scanner;
public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userEntry;
		int[] perfectNumber;
		int[] divisor;
		int sum;
		int perfectNumberFound=0;

		int result;
		boolean numberFound = false;

		//l'utilisateur rentre un chiffre, qui donne le nombre de valeur à afficher
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of perfect number you want");
		userEntry = sc.nextInt();

		//Boucle qui répète le calcul tant que la valeur de l'utilisateur n'est pas atteinte

		while (perfectNumberFound < userEntry)
		{
			//boucle qui calcul si un nombre est parfait

			int index = 1;
			
			while (numberFound == false)
			{
				
					for (int i = 1; i < index; i++)
					{
	
						result = index%i;
	
						if (result == 0)
						{
	
						}
	
					}

			}
		}

	}
}
