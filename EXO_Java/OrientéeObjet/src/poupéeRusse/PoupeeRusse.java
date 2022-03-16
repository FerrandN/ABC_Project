package poupéeRusse;

public class PoupeeRusse 
{
	private boolean estOuverte;
	private PoupeeRusse estDans;
	private PoupeeRusse contient;
	private String nom;
	
	public PoupeeRusse(String _nom)
	{
		estOuverte = false;
		estDans = null;
		contient = null;
		nom = _nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ouvrir()
	{
		if ( !estOuverte  && estDans == null)
		{
			estOuverte = true;
		}
	}
	
	public void fermer()
	{
		if ( estOuverte && estDans == null)
		{
			estOuverte = false;
		}
	}
	
	public void placerDans(PoupeeRusse p)
	{
		if (estDans == null && estOuverte == false && p.contient == null && p.estOuverte == true) {
			estDans = p;
			p.contient = this;
		}
	}
	
	public void sortirDe(PoupeeRusse p)
	{
		if (p.estOuverte && p.contient == this) {
			p.contient = null;
			estDans = null;
		}
	}
	
	public final PoupeeRusse getContient() {
		return contient;
	}
	
	public final PoupeeRusse getDans() {
		return estDans;
	}
	
}
