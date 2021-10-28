package model;

public class Marchandise {
	
	int numeroMarchandise;
	double poidsMarchandise;
	double volumeMarchandise;
	
	public Marchandise(int numeroMarchandise, double poidsMarchandise, double volumeMarchandise) {	
		this.numeroMarchandise = numeroMarchandise;
		this.poidsMarchandise = poidsMarchandise;
		this.volumeMarchandise = volumeMarchandise;
		System.out.println("Marchandise creation:: SUCCESS");
	}

	public double getVolumeMarchandise() {
		return this.volumeMarchandise;
	}
	
	public int getNumerMarchandise() {
		return this.numeroMarchandise;
	}

	@Override
	public String toString() {
		return "Marchandise [numeroMarchandise=" + numeroMarchandise + ", poidsMarchandise=" + poidsMarchandise
				+ ", volumeMarchandise=" + volumeMarchandise + "]";
	}
	
}
