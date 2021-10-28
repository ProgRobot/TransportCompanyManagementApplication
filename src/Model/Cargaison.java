package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Cargaison {
	
	protected String referenceCargaison;
	protected double distanceParcours;
	protected HashMap<Integer, Marchandise> marchandises;

	public Cargaison(String referenceCargaison, double distanceParcours) {
		this.referenceCargaison = referenceCargaison;
		this.distanceParcours = distanceParcours;
		this.marchandises = new HashMap<Integer, Marchandise>();
		System.out.println("Cargaison creation:: SUCCESS :)");
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
		double volumeTotal = 0;
		
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
	
	//On tente directement avec ca !!
	public void addMarchandise(Marchandise marchandise) {
		this.marchandises.put(marchandise.getNumerMarchandise(), marchandise);
		System.out.println("Marchandise adding to cargaison:: SUCCESS");
	}

	@Override
	public String toString() { 
		return "Cargaison [referenceCargaison=" + referenceCargaison + ", distanceParcours=" + distanceParcours
				+ ", marchandises=" + this.marchandises + "]";
	}
}
