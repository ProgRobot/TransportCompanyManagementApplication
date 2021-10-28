package model;

import java.util.HashMap;
import java.util.Map;

public abstract class Cargaison {
	
	protected String referenceCargaison;
	protected double distanceParcours;
	protected HashMap<Integer, Marchandise> marchandises = null ;

	public Cargaison(HashMap<String, Marchandise> marchandises) {
		this.referenceCargaison = "";
		this.distanceParcours = 0;
		this.marchandises = new HashMap<Integer, Marchandise>();
	}
	
	public abstract double coutCargaison();

	public double getDistanceParcours() {
		return this.distanceParcours;
	}
	
	protected double calculPoidsCargaison() {
		double poidsTotal = 0;   //The sum of all merchandise
		
		for (Map.Entry<Integer, Marchandise> entry : this.marchandises.entrySet()) {
			poidsTotal += entry.getValue().getVolumeMarchandise();
		}
		
		return poidsTotal;
	}
	
	protected double calculVolumeCargaison() {
		double volumeTotal = 0;   //The sum of all merchandise
		
		for (Map.Entry<Integer, Marchandise> entry : this.marchandises.entrySet()) {
			volumeTotal += entry.getValue().getVolumeMarchandise();
		}
		
		return volumeTotal;
	}
	
	public Marchandise getMarchandise(Integer numeroMarchandise) {
		return this.marchandises.get(numeroMarchandise);
	}

	public String getReferenceCargaison() {
		return this.referenceCargaison;
	}
	
	public void addMarchandise(Marchandise marchandise) {
		this.marchandises.put(marchandise.numeroMarchandise, marchandise);
	}
	

}
