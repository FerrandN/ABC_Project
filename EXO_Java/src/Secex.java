import java.util.Scanner;

public class Secex {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean doAgain = true;
do 
	{
		int firstFactor = 0;
		int secondFactor = 0;
		int average = 0;
		
		String answer = "y";
		
		System.out.println("Please enter 2 numbers separated by a space");
		
		firstFactor = sc.nextInt();
		secondFactor = sc.nextInt();
		
		average = (firstFactor+secondFactor)/2;
		
		System.out.println("Your average number:"+average);
		
		System.out.println("Do you want to calculate the average again? (please enter y/n)");
		
		answer = sc.next();
		
		if  (answer.equals ("n"))
		{
			
			doAgain=false;
			
		}
		
	} while(doAgain==true);

	sc.close();
	
	System.out.println("please comme again !");

	}

}
