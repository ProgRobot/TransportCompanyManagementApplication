package iMetier;

import java.util.HashMap;

import model.Cargaison;
import model.Marchandise;

public interface IAdminTransport extends IClientTransport{
	
	public void ajouterNouvelleCargaison(Cargaison cargaison);
	public void ajouterMarchandiseACargaison(Cargaison cargaison,Marchandise marchandise);
	public HashMap<String, Cargaison> consulterToutCargaison();
	void supprimerCargaison(String referenceCargaison);
	void enregistrerCargaisonFichier(String nomFichier);
	
	
}
