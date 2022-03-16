import poupéeRusse.PoupeeRusse;

public class MainClass {
	public static void main(String[] args) {
		PoupeeRusse[] poupeesRusse = new PoupeeRusse[3];
		poupeesRusse[0] = new PoupeeRusse("Rebecca Chamber");
		poupeesRusse[1] = new PoupeeRusse("Jill Valentine");
		poupeesRusse[2] = new PoupeeRusse("Claire Redfield");
		poupeesRusse[1].ouvrir();
		poupeesRusse[0].placerDans(poupeesRusse[1]);
		poupeesRusse[1].fermer();
		poupeesRusse[2].ouvrir();
		poupeesRusse[1].placerDans(poupeesRusse[2]);
		poupeesRusse[2].fermer();
		listerContenu(poupeesRusse[2]);
	}
	
	public static void listerContenu(PoupeeRusse p) {
		if (p != null) {
			System.out.println(p.getNom());
			while (p.getContient() != null) {
				p = p.getContient();
				System.out.println(p.getNom());
			}
		}
	}
}
