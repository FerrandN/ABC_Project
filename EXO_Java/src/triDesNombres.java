import java.util.Scanner;
public class triDesNombres {

	public static void main(String[] args) 
	{
		String userAnswer;
		String[] convertedValue;
		int[] arrayAnswer;
		boolean isParsed = false;

		Scanner sc = new Scanner(System.in);


		{
			System.out.println("What're the number you want to parse (please separate each by a space)");


			userAnswer = sc.nextLine();
			convertedValue = userAnswer.split(" ");

			arrayAnswer = new int[convertedValue.length];

			for (int i = 0;  i < convertedValue.length ; i++)
			{
				arrayAnswer[i] = Integer.valueOf(convertedValue[i]);
				//fill array with user value
			}

			while (isParsed = false)
			{

				for (int i = 0; i < arrayAnswer.length; i++)
				{
					int isSmallest = arrayAnswer[i];
					//take array index value and stock

					for (int index = i+1; index < arrayAnswer.length; index++)
					{
						//check if number is the smallest
						if (isSmallest > arrayAnswer[index])
						{
							int swap = arrayAnswer[index];
							arrayAnswer[index] = isSmallest;
							arrayAnswer[i] = swap;
							index--;
						}
					}
				}
			}

			sc.close();
		}
	}
}
