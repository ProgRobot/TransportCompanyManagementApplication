package metier;

import java.io.File;
import java.util.HashMap;

import iMetier.IAdminTransport;
import iMetier.IClientTransport;
import model.Cargaison;
import model.Marchandise;

class SocieteTransport implements IAdminTransport, IClientTransport {

	private HashMap<String, Cargaison> cargaisons;
	
	public SocieteTransport() {
		this.cargaisons = new HashMap<String, Cargaison>() ;
	}

	@Override
	public Cargaison consulterCargaison(String referenceCargaison) {
		return this.cargaisons.get(referenceCargaison);
	}

	@Override
	public Marchandise consulterMarchandise(String referenceCargaison, Integer numeroMarchandise) {
		return this.cargaisons.get(referenceCargaison).getMarchandise(numeroMarchandise);
	}

	@Override
	public File lireFichierCragaisons(File fichierCargaison) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Cargaison> consulterToutCargaison() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterNouvelleCargaison(Cargaison cargaison) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterMarchandiseACargaison(Cargaison cargaison, Marchandise marchandise) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCargaison() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enregistrerCargaisonFichier() {
		// TODO Auto-generated method stub
		
	}
	
	

}
