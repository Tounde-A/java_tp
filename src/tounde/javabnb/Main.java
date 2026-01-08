package tounde.javabnb;

import tounde.javabnb.logements.Appartement;
import tounde.javabnb.logements.Logement;
import tounde.javabnb.logements.Maison;
import tounde.javabnb.reservations.Sejour;
import tounde.javabnb.utilisateurs.Hote;
import tounde.javabnb.utilisateurs.Personne;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Personne personne1 = new Personne("Luke", "Keildo", 28);
        //Logement logement1 = new Logement(hote1, 150, "24 rue des Halles, 37000 Tours", 105, 1);

        //Personne personne2 = new Personne("Sitri", "Smart", 24);
        //Logement logement2 = new Logement(hote2, 200, "16 rue Nationale, 37000 Tours", 50,1);

        //personne1.afficher();
        //personne2.afficher();

        //logement1.afficher();
        //logement2.afficher();

        Hote hote1 = new Hote("Luke", "Keildo", 28, 12);
        Maison maison1 = new Maison(hote1, 150, "24 rue des Halles, 37000 Tours", 105, 1, 10, false);
        Date maDate1 = new Date(126, Calendar.JANUARY, 10);

        Hote hote2 = new Hote("Sitri", "Smart", 24, 1);
        Appartement appartement1 = new Appartement(hote2, 200, "16 rue Nationale, 37000 Tours", 1,50, 2, 0);
        Date maDate2 = new Date(126, Calendar.FEBRUARY, 12);

        Sejour monSejour1 = new Sejour(maDate1, 3, maison1, 2);
        Sejour monSejour2 = new Sejour(maDate2, 7, appartement1, 3);

        System.out.println(" ");
        monSejour1.afficher();
        System.out.println(" ");
        monSejour2.afficher();


    }
}
