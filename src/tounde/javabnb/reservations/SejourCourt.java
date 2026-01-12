package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class SejourCourt extends Sejour{

    private Logement logement;
    private int prix;

    public SejourCourt(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        logement = paramLogement;
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return getNbNuits() >= 1 && getNbNuits() <= 31;
    }

    @Override
    public void miseAJourDuPrixDuSejour() {

    }

    @Override
    public void afficher() {
        logement.afficher();
        System.out.println("Nombre de nuits : " + getNbNuits());
        System.out.println("La date d'arrivée est le " + formaterDate(getDateArrivee()) + " pour " + getNbNuits() + " nuits.");
        System.out.println("Le prix de ce séjour est de " + prix + "€");
    }
}
