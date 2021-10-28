package iMetier;

import model.Cargaison;
import model.Marchandise;

public interface IAdminTransport extends IClientTransport{
	
	public void ajouterNouvelleCargaison(Cargaison cargaison);
	public void ajouterMarchandiseACargaison(Cargaison cargaison,Marchandise marchandise);
	public void supprimerCargaison();
	public void enregistrerCargaisonFichier();
	
}
