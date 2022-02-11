import java.util.Scanner;
public class Calculerangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rayon;
		int angle;
		double result;
		
		System.out.println("Veuillez rentrer le rayon du cercle puis l'air séparer par un éspace");
		Scanner sc = new Scanner(System.in);
		
		rayon = sc.nextInt();
		angle = sc.nextInt();
		
		result = (Math.PI*Math.pow(rayon, 2)*angle)/360;
		
		System.out.println("le secteur circulaire est de: "+result);
		
		sc.close();
		
	}

}
