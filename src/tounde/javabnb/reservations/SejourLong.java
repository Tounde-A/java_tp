package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class SejourLong extends Sejour{

    private Logement logement;
    private double promotion;
    private double promotionEnPourcentage;


    public SejourLong(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs, double paramPromotionEnPourcentage) {
        super(paramDateArrivee, paramNbNuits, paramLogement, paramNbVoyageurs);
        logement = paramLogement;
        promotionEnPourcentage = paramPromotionEnPourcentage;
    }

    @Override
    public String toString() {
        return getLogement().toString();
    }

    @Override
    public void afficher() {
        int prixTotal = getNbNuits() * logement.getTarifParNuit();

        promotion = prixTotal * promotionEnPourcentage;
        int promotionFormatee = (int) promotion;

        double reduction = prixTotal - promotionFormatee;
        int reductionFormatee = (int) reduction;


        logement.afficher();
        System.out.println("Nombre de nuits : " + getNbNuits());
        System.out.println("La date d'arrivée est le " + formaterDate(getDateArrivee()) + " pour " + getNbNuits() + " nuits.");
        System.out.println("Le prix de ce séjour est de " + reductionFormatee + "€ (" + promotionFormatee + "€ de promotion).");
    }
}
