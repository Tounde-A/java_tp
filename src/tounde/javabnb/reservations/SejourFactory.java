package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;

import java.util.Date;

public class SejourFactory {

    public static final Sejour createSejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {

        if (nbNuits <= 6) {
            return new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
        } else {
            return new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
        }
    }

    private void createSejour() {

    }
}
