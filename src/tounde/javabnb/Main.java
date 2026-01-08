package tounde.javabnb;

import tounde.javabnb.logements.Logement;
import tounde.javabnb.reservations.Sejour;
import tounde.javabnb.utilisateurs.Personne;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Personne personne1 = new Personne("Luke", "Keildo", 28);
        Logement logement1 = new Logement(personne1, 150, "24 rue des Halles, 37000 Tours", 105, 1);

        Personne personne2 = new Personne("Sitri", "Smart", 24);
        Logement logement2 = new Logement(personne2, 200, "16 rue Nationale, 37000 Tours", 50,1);

        Date maDate1 = new Date(126, Calendar.JANUARY, 10);

        Sejour monSejour1 = new Sejour(maDate1, 3, logement1, 2);

        //personne1.afficher();
        //personne2.afficher();

        //logement1.afficher();
        //logement2.afficher();

        monSejour1.afficher();
    }
}
