package Package;
import java.util.Scanner;
public class youngAndOld 
{

	public static void main(String[] args) 
	{
		int youngCount=0;
		
		int allPeopleAge[];
		
		allPeopleAge = new int[20];
		
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < allPeopleAge.length; i++)
		{
			String userAnswer;
			System.out.println("How old is the "+i+" person");
			userAnswer = sc.nextLine();
			
			allPeopleAge[i] = Integer.valueOf(userAnswer);
			if (allPeopleAge[i] < 20)
			{
				youngCount++;
			}
		}
		System.out.println("il y a "+youngCount+" jeunes");
		sc.close();
	}

}
