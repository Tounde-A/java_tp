package tounde.javabnb;

import tounde.javabnb.logements.Logement;
import tounde.javabnb.reservations.Sejour;
import tounde.javabnb.utilisateurs.Hote;
import tounde.javabnb.utilisateurs.Personne;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Personne personne1 = new Personne("Luke", "Keildo", 28);
        Hote hote1 = new Hote("Luke", "Keildo", 28, 12);
        Logement logement1 = new Logement(hote1, 150, "24 rue des Halles, 37000 Tours", 105, 1);

        //Personne personne2 = new Personne("Sitri", "Smart", 24);
        Hote hote2 = new Hote("Sitri", "Smart", 24, 1);
        Logement logement2 = new Logement(hote2, 200, "16 rue Nationale, 37000 Tours", 50,1);

        Date maDate1 = new Date(126, Calendar.JANUARY, 10);

        Sejour monSejour1 = new Sejour(maDate1, 3, logement1, 2);

        //personne1.afficher();
        //personne2.afficher();

        //logement1.afficher();
        //logement2.afficher();

        monSejour1.afficher();
    }
}
