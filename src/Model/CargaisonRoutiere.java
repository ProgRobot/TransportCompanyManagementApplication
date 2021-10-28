package model;

import java.util.HashMap;

public class CargaisonRoutiere extends Cargaison {

	public CargaisonRoutiere(HashMap<String, Marchandise> marchandises) {
		super(marchandises);
	}

	@Override
	public double coutCargaison() {
		if (this.calculVolumeCargaison()<380000) return 4*this.distanceParcours*this.calculPoidsCargaison();
		else return 6*distanceParcours*this.calculPoidsCargaison();
	}
	
}
