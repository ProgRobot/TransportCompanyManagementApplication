package iMetier;

import java.util.HashMap;

import model.Cargaison;
import model.Marchandise;

public interface IAdminTransport extends IClientTransport{
	
	public void ajouterNouvelleCargaison(Cargaison cargaison);
	public void ajouterMarchandiseACargaison(String referenceCargaison,Marchandise marchandise);
	public HashMap<String, Cargaison> consulterToutCargaison();
	public void supprimerCargaison(String referenceCargaison);
	public void enregistrerCargaisonFichier(String nomFichier);
	
}
