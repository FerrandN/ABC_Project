import java.util.Scanner;

public class Firstex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number of the operation");
		
		int firstFactor = scanner.nextInt();
		
		System.out.println("Enter the second number of the operation");
		
		int secondFactor = scanner.nextInt();
		//declare both number required to operate
		
		int average = 0;

		average = (firstFactor+secondFactor)/2;

		System.out.println("Your average number:"+average);
		
		if (average<10)
		{
			System.out.println("Average is under 10 and has been added 1");
			average++;
		}
		
		System.out.println("Your average number:"+average);
		
		scanner.close();*/
		
		

		int firstFactor = 0;
		int secondFactor = 0;
		int average = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number of the operation");
		
		firstFactor = sc.nextInt();
		
		System.out.println("Enter the second number of the operation");
		
		secondFactor = sc.nextInt();
		
		//declare both number required to operate
		
		

		average = (firstFactor+secondFactor)/2;
		
		System.out.println("Your average number:"+average);
		
		if (average<10)
		{
			System.out.println("Average is under 10 and has been added 1");
			average++;
		}
		
		sc.close();
		
	
		
	}


	
}