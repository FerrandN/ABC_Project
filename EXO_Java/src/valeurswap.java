import java.util.Scanner;
public class valeurswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value1;
		int value2;
		int swap;
		
		System.out.println("please enter 2 value seperated by a space");
		Scanner sc = new Scanner(System.in);
		
		value1 = sc.nextInt();
		value2 = sc.nextInt();
		
		System.out.println("valeur 1: "+value1+"\nvaleur 2: "+value2);
		
		swap = value1;
		value1 = value2;
		value2 = swap;
		
		System.out.println("valeur 1: "+value1+"\nvaleur 2: "+value2);
		
		sc.close();
	}

}
