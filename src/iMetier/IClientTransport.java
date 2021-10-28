package iMetier;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import model.Cargaison;
import model.Marchandise;

public interface IClientTransport {
	
	public Cargaison consulterCargaison(String referenceCargaison);
	public HashMap<String, Cargaison> consulterToutCargaison();
	public Marchandise consulterMarchandise(String referenceCargaison, Integer numero);
	public Map<String, Cargaison> lireFichierCragaisons(String nomFichier);
	
}
