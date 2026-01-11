package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class Sejour implements Reservable {

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

    @Override
    public boolean aUneDateArriveeCorrecte() {
        return dateArrivee.after(new Date());
    }

    @Override
    public boolean aUnNombreDeNuitsCorrect() {
        return nbNuits >= 1 && nbNuits <= 31;
    }

    @Override
    public boolean aUnNombreDeVoyageursCorrect() {
        return nbVoyageurs <= logement.getNbVoyageursMax();
    }

    public void afficher() {
        logement.afficher();
        System.out.println("Nombre de nuits : " + nbNuits);
        System.out.println("La date d'arrivée est le " + formaterDate(dateArrivee) + " pour " + nbNuits + " nuits.");
        System.out.println("Le prix de ce séjour est de " + getNbNuits() * logement.getTarifParNuit() + " €");
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public Logement getLogement() {
        return logement;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }
}
