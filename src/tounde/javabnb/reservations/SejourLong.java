package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class SejourLong extends Sejour {

    private Logement logement;
    private int promotion;
    private final int PROMOTION_EN_POURCENTAGE;


    public SejourLong(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs, int paramPromotionEnPourcentage) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        PROMOTION_EN_POURCENTAGE = paramPromotionEnPourcentage;
        logement = paramLogement;

        int prixInitial = getNbNuits() * paramLogement.getTarifParNuit();
        promotion = prixInitial * PROMOTION_EN_POURCENTAGE / 100;
        prix = prixInitial - promotion;
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return getNbNuits() >= 1 && getNbNuits() <= 31;
    }

    @Override
    public String toString() {
        return getLogement().toString();
    }

    @Override
    public void miseAJourDuPrixDuSejour() {

    }

    @Override
    public void afficher() {
        logement.afficher();
        System.out.println("Nombre de nuits : " + getNbNuits());
        System.out.println("La date d'arrivée est le " + formaterDate(getDateArrivee()) + " pour " + getNbNuits() + " nuits.");
        System.out.println("Le prix de ce séjour est de " + prix + "€ (" + promotion + "€ de promotion).");
    }
}
