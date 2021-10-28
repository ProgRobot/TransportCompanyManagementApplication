package metier;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import iMetier.IAdminTransport;
import iMetier.IClientTransport;
import model.Cargaison;
import model.Marchandise;

class SocieteTransport implements IAdminTransport, IClientTransport, Serializable {

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
		
		return null;
	}

	@Override
	public HashMap<String, Cargaison> consulterToutCargaison() {
		return this.cargaisons;
	}

	@Override
	public void ajouterNouvelleCargaison(Cargaison cargaison) {
		this.cargaisons.put(cargaison.getReferenceCargaison(), cargaison);
	}

	@Override
	public void ajouterMarchandiseACargaison(Cargaison cargaison, Marchandise marchandise) {
		this.cargaisons.get(cargaison.getReferenceCargaison()).addMarchandise(marchandise);		
	}

	@Override
	public void supprimerCargaison(String referenceCargaison) {
		cargaisons.remove(cargaisons.get(referenceCargaison).getReferenceCargaison());
	}

	@Override
	public void enregistrerCargaisonFichier(String nomFichier) {
		File file = new File(nomFichier);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.cargaisons);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	

}
