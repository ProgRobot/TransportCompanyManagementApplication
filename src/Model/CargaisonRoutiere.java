package model;

import java.util.HashMap;

public class CargaisonRoutiere extends Cargaison {

	public CargaisonRoutiere(String referenceCargaison, double distanceParcours) {
		super(referenceCargaison, distanceParcours);
		System.out.println("TYPE:: Routiere");
	}
	
	@Override
	public double coutCargaison() {
		if (this.calculVolumeCargaison()<380000) return 4*this.distanceParcours*this.calculPoidsCargaison();
		else return 6*distanceParcours*this.calculPoidsCargaison();
	}
	
}
