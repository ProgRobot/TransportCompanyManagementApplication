package model;

public class Marchandise {
	
	int numeroMarchandise;
	double poidsMarchandise;
	double volumeMarchandise;
	
	public Marchandise(int numeroMarchandise, double poidsMarchandise, double volumeMarchandise) {	
		this.numeroMarchandise = numeroMarchandise;
		this.poidsMarchandise = poidsMarchandise;
		this.volumeMarchandise = volumeMarchandise;
	}

	public double getVolumeMarchandise() {
		return this.volumeMarchandise;
	}
	
	
}
