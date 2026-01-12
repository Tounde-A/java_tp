package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class SejourLong extends Sejour {

    private int prix;
    private int promotion;
    private final int PROMOTION_EN_POURCENTAGE;


    public SejourLong(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs, int paramPromotionEnPourcentage) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        PROMOTION_EN_POURCENTAGE = paramPromotionEnPourcentage;

        int prixInitial = getNbNuits() * getLogement().getTarifParNuit();
        promotion = prixInitial * PROMOTION_EN_POURCENTAGE / 100;
        prix = prixInitial - promotion;
    }

    @Override
    public String toString() {
        return getLogement().toString();
    }

    @Override
    public void afficher() {

        super.afficher();
        System.out.println("Le prix de ce séjour est de " + prix + "€ (" + promotion + "€ de promotion).");
    }
}
