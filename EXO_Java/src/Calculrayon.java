import java.util.Scanner;

public class Calculrayon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rayon;
		double result;
		
		System.out.println("Veuillez entr�e la valeur du rayon.");
		Scanner sc = new Scanner(System.in);
		
		rayon = sc.nextInt();
		
		result = 4*Math.PI*Math.pow(rayon, 2);
		System.out.println("l'air du cercle est de:"+result);
		
		
		result = 4/3*Math.PI*Math.pow(rayon, 3);
		System.out.println("l'air du cercle est de:"+result);
		
		sc.close();
		
	}

}
