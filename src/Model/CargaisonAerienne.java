package model;

import java.util.HashMap;

public class CargaisonAerienne extends Cargaison {

	public CargaisonAerienne(String referenceCargaison, double distanceParcours) {
		super(referenceCargaison, distanceParcours);
		System.out.println("TYPE:: Aerienne");
	}

	@Override
	public double coutCargaison() {
		if (this.calculVolumeCargaison()<80000) return 10*this.distanceParcours*this.calculPoidsCargaison();
		else return 12*distanceParcours*this.calculPoidsCargaison();
	}

}
