package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public abstract class Sejour implements Reservable {

    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;
    protected int prix;

    public Sejour(Date paramDateArrivee, int paramNbNuits, Logement paramLogement, int paramNbVoyageurs) {
        dateArrivee = paramDateArrivee;
        nbNuits = paramNbNuits;
        logement = paramLogement;
        nbVoyageurs = paramNbVoyageurs;
    }

    public abstract void miseAJourDuPrixDuSejour();

    @Override
    public boolean aUneDateArriveeCorrecte() {
        return dateArrivee.after(new Date());
    }

    @Override
    public boolean aUnNombreDeVoyageursCorrect() {
        return nbVoyageurs <= logement.getNbVoyageursMax();
    }

    public abstract void afficher();

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
