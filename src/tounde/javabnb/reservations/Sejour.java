package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

public class Sejour {

    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        dateArrivee = paramDateArrivee;
        nbNuits = paramNbNuits;
        logement = paramLogement;
        nbVoyageurs = paramNbVoyageurs;
    }

    public void afficher() {
        logement.afficher();
        System.out.println("Nombre de nuits : " + nbNuits);
        System.out.println("Date d'arrivée : " + dateArrivee.getDate() + "/" + (dateArrivee.getMonth() + 1) + "/" + (dateArrivee.getYear() + 1900));
        System.out.println("Prix du séjour : " + nbNuits * logement.getTarifParNuit() + "€");
    }
}
