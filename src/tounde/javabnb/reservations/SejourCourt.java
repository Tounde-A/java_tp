package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class SejourCourt extends Sejour{

    private Logement logement;

    public SejourCourt(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        logement = paramLogement;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le prix de ce séjour est de " + getNbNuits() * logement.getTarifParNuit() + "€");
    }
}
