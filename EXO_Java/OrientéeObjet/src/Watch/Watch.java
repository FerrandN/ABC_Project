package Watch;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Watch {
	String ownerName;
	int hour;
	int minute = 0;
	boolean isWorn;

	public void copyTime(int minutes, int hours)
	{
		hour = hours;
		minute = minutes;
	}

	public void addMinute()
	{
		boolean rightInput = true;
		int minuteToAdd = 0;

		//testing userInput
		do {
			rightInput = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("how many minutes do you want to add");
			try 
			{
				minuteToAdd = sc.nextInt();
			}
			catch (Exception wrongInput)
			{
				System.out.println("wrong input");
				rightInput = false;
			}
			sc.close();
		} while (!rightInput);

		minute = minute + minuteToAdd;
		//divide user input by 60 to know how many hours have to be added
		if (minute > 60)
		{
			int hoursToAdd = minute/60;
			BigDecimal resultatM = new BigDecimal (hoursToAdd).setScale(0,RoundingMode.HALF_DOWN);
			hoursToAdd = resultatM.intValueExact();

			hour = hour + hoursToAdd;
			while (hour > 24)
			{
				hour = hour - 24;
			}
			//set minute to modulo
			minute = minute%60;

		}
	}

	public void getOwner(String name)
	{
		ownerName = name;
	}
}


