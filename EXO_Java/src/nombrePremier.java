import java.util.Scanner;
public class nombrePremier 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int askedNumber = 0;
		double squareRoot = 0;
		boolean isValidNumber = true;
		boolean isPrimeNumber = false;
		boolean retry = true;
		boolean doesWork = false;
		double toCompare;
		boolean tryAgain;
		String want = "y";
		
		while (retry == true)
		{
			tryAgain = true;
			doesWork = false;
			Scanner sc = new Scanner(System.in);
			

			while (!doesWork)
			{
				System.out.println("Please enter a number strictly superior to 2");
				try 
				{
					askedNumber = sc.nextInt();
					squareRoot = java.lang.Math.sqrt(askedNumber);
					doesWork = true;
				} 
				
				catch (Exception e) 
				{
					doesWork= false;
				}
				sc.nextLine();
			}
			
			
			System.out.println("SquareRoot of asked number is:"+squareRoot);
		
				while (isValidNumber == true)
				{
						if (askedNumber <= 1) 
						{
						System.out.println("your number isn't valid, please enter a number superior to 1");
						isValidNumber = false;
						}
						//check if askedNumber is divisible
						
						else if (askedNumber % 2 == 0) 
						
						{
							if (askedNumber != 2) 
							{
								isValidNumber = false;
								System.out.println("your number isn't valid, please enter a number STRICTLY superior to 2");
								// check if askednumber is egal to 2
							}
								// if not > verify if askedNumber is prime number 
						}
						
						else 
						{
								int i = 3;
								while (i< squareRoot && !isPrimeNumber) 
								{
									toCompare = squareRoot%i;
									
									if (toCompare == 0);
									{
										System.out.println(askedNumber+"isn't prime number.");
										isPrimeNumber = false;
										isValidNumber = false;
									}
									
									i++;
									
								}
								System.out.println("Well done ! "+askedNumber+" is a prime Number");
								isValidNumber = false;
						}
									
					}
	
				
				while (tryAgain == true)
				{
					System.out.println("Do you want to try with another number, answer with y/n?");
					want = sc.nextLine();
					
						if (!want.equals("y") && !want.equals("n"))
						{
							System.out.println("please enter letter 'y' or letter 'n' ");
						}
						
						else if (want.equals("y"))
						{
							tryAgain = false;
							isValidNumber = true;
							isPrimeNumber = false;
							retry = true;
						}
						
						else
						{
							System.out.println("have a nice day");
							tryAgain = false;
							retry = false;
							sc.close();
						}
				}
				
			}
		}
}
