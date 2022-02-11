import java.util.Scanner;
public class yearsBissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userEntry;
		int result;

		boolean replay = true;
		String userReplayAnswer;

		Scanner sc = new Scanner(System.in);
		Scanner userString = new Scanner(System.in);
		
		while (replay == true)
		{
			System.out.println("Hello, please enter the year you want to check.");
			userEntry = sc.nextInt();

			result = userEntry%4;
		
			if (result != 0)
			//l'année n'est pas bissextile
			{
				System.out.println(userEntry+" Unfortunatly, your year is not bissextile.");
			}
			else
				//on considère que l'année est bissextile puis on test
			{
				if (userEntry%100 != 0 && userEntry%400>0)
					//sous cette condition l'année n'est pas bissextile
				{
					System.out.println(userEntry+" is not bissextile.");
				}
				
				else
					//sinon elle est bissextile
				{
					System.out.println(userEntry+" Is a bissextile year, congratulation !");
				}
			}
			
			System.out.println("Do you want to try another year? y/n");
			userReplayAnswer = userString.nextLine();
			if (!userReplayAnswer.equals("y"))
			{
				System.out.println("So sad... have a nice day !");
				replay = false;
			}
		}
		sc.close();
		userString.close();
	}

}
