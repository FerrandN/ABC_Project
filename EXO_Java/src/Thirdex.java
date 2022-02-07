import java.util.Scanner;

public class Thirdex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float results = 0;
		String[] valeurs;
		int[] myTab;
		String saisie;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number to average separated by a space for each.");
		saisie = sc.nextLine();
		saisie.trim();
		
		
		valeurs = saisie.split(" ");
		
		myTab = new int[valeurs.length];
		
		for (int i = 0; i < valeurs.length ; i++)
		{
			myTab[i] = Integer.valueOf(valeurs[i]);
			
		}
		
		for (int i = 0 ; i < myTab.length ; i++)
		{
			results = results+myTab[i];
		}
	
		results = results/valeurs.length;
		
		System.out.println("The average is: "+results);
		
		sc.close();
		
	}

}
