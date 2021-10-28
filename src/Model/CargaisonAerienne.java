package model;

import java.util.HashMap;

public class CargaisonAerienne extends Cargaison {

	public CargaisonAerienne(HashMap<String, Marchandise> marchandises) {
		super(marchandises);
	}

	@Override
	public double coutCargaison() {
		if (this.calculVolumeCargaison()<80000) return 10*this.distanceParcours*this.calculPoidsCargaison();
		else return 12*distanceParcours*this.calculPoidsCargaison();
	}

}
