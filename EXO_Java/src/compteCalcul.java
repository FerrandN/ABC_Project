import java.util.Scanner;

public class compteCalcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bankAccountValue;
		double interest;
		int yearsOfPlacement;
		
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the bank account value");
		bankAccountValue = sc.nextInt();
		
		System.out.println("Please enter the interest");
		interest = sc.nextInt();
		
		interest = interest/100;
		//divide interest by 100 to get the percentage multiplicator.
		
		
		System.out.println("Please enter the years of placement");
		yearsOfPlacement = sc.nextInt();
		
		System.out.println("simple interest");
		result = bankAccountValue*(1+interest*yearsOfPlacement);
		System.out.println("Here is your simple interest:"+result);
		//add 1 to interest to get percentage then multiply by years and bank value.
		
		
		System.out.println("Composed interest");
		result = bankAccountValue*(Math.pow(1+interest, yearsOfPlacement));
		System.out.println("Here is your composed interest:"+result);
		//add 1 to interest to get percentage then change years by a pow to add every interest by years.
		
		
		sc.close();
	}

}
