import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String saisieUtilisateur;
		int[] nbItterationsAlphabet= new int[26];
		saisieUtilisateur = sc.nextLine();
		for (int i = 0 ; i < saisieUtilisateur.length(); i++) {
			for (int j = ((int)'a'); j <= ((int)'z'); j++) {
				if ((int)(saisieUtilisateur.charAt(i))==j) {
					nbItterationsAlphabet[j-97]++;
				}
			}
		}
		for (int i = 0; i < nbItterationsAlphabet.length; i++) {
			System.out.println("Il y'a "+ nbItterationsAlphabet[i] + "\'" + ((char)(97+i)) + "\'");
		}
		sc.close();
	}
}
