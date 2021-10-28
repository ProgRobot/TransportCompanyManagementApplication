package metier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import iMetier.IAdminTransport;
import iMetier.IClientTransport;
import model.Cargaison;
import model.Marchandise;

public class SocieteTransport implements IAdminTransport, IClientTransport, Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private HashMap<String, Cargaison> cargaisons = null;
	
	public SocieteTransport() {
		this.cargaisons = new HashMap<String, Cargaison>() ;
		System.out.println("SocieteTransport Creation:: SUCCESS :)");
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
	public Map<String, Cargaison> lireFichierCragaisons(String nomFichier) {
		/*
		File f = new File(nomFichier);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new FileInputStream(fis);
		Cargaison op  
		*/
		
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
	public void ajouterMarchandiseACargaison(String referenceCargaison, Marchandise marchandise) {
		this.cargaisons.get(referenceCargaison).addMarchandise(marchandise);
	}
	
	@Override
	public void supprimerCargaison(String referenceCargaison) {
		cargaisons.remove(cargaisons.get(referenceCargaison).getReferenceCargaison());
	}

	@Override
	public void enregistrerCargaisonFichier(String nomFichier) {
		File file = new File(nomFichier);
		System.out.println(nomFichier+" creation:: SUCCCESS");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for (Map.Entry<String, Cargaison> entry : this.cargaisons.entrySet()) {
				oos.writeObject(entry.getValue());
			}
			
			System.out.println("Cargaisons serialization & writing to "+nomFichier+" :: SUCCCESS");
			oos.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}
}