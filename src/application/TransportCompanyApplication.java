package application;

import iMetier.IAdminTransport;
import metier.SocieteTransport;
import model.Cargaison;
import model.CargaisonAerienne;
import model.CargaisonRoutiere;
import model.Marchandise;

public class TransportCompanyApplication {

	public static void main(String[] args) {
	
		//Creation of SocieteTransport for an admin
		IAdminTransport roleAdmin = new SocieteTransport();
		
		//Adding 3 cargaisons 2 CR and 1 CA:
		roleAdmin.ajouterNouvelleCargaison(new CargaisonRoutiere("CR1",20));
		roleAdmin.ajouterNouvelleCargaison(new CargaisonRoutiere("CR2",30));
		roleAdmin.ajouterNouvelleCargaison(new CargaisonAerienne("CA1",15));
		
		
		
		//Ajouter 3 Marchandises à la cargaison CR1
		System.out.println(roleAdmin.consulterCargaison("CA1").toString());
		
		roleAdmin.ajouterMarchandiseACargaison("CR1", new Marchandise(1, 3, 30));
		roleAdmin.ajouterMarchandiseACargaison("CR1", new Marchandise(2, 5, 10));
		roleAdmin.ajouterMarchandiseACargaison("CR1", new Marchandise(3, 2, 20));
		
		System.out.println(roleAdmin.consulterCargaison("CR1").toString());
		
		/* Maniere alternative
		 *  
		roleAdmin.consulterCargaison("CA1").addMarchandise(new Marchandise(1, 56, 21));
		roleAdmin.consulterCargaison("CA1").addMarchandise(new Marchandise(2, 53, 21));
		*/
		
		
		//AJouter 2 marchandises à la cargaison CA1 ( numéro 4,5)
		
		roleAdmin.ajouterMarchandiseACargaison("CA1", new Marchandise(4, 40, 25));
		roleAdmin.ajouterMarchandiseACargaison("CA1", new Marchandise(5, 20, 30));
		
		//Affichage d'information à propos de CR1
		System.out.println(roleAdmin.consulterCargaison("CR1").toString());
		
		//Affichage des informations concernant la marchandise 3:
		System.out.println(roleAdmin.consulterCargaison("CR1").getMarchandise(3).toString());
		
		roleAdmin.enregistrerCargaisonFichier("transport1.data");
	
	}
}
