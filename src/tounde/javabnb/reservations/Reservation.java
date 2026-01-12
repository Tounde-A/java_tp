package tounde.javabnb.reservations;

import tounde.javabnb.logements.Logement;
import tounde.javabnb.utilisateurs.Voyageur;

import java.util.Date;

import static tounde.javabnb.outils.Utile.formaterDate;

public class Reservation {

    private Reservable objetReservable;
    private Voyageur voyageur;
    private Date dateDeReservation;

    public Reservation(Reservable paramObjetReservable, Voyageur paramVoyageur) {
        objetReservable = paramObjetReservable;
        voyageur = paramVoyageur;
        dateDeReservation = new Date();
    }

    public void afficher() {
        System.out.println("Date de la réservation : " + formaterDate(dateDeReservation));
        System.out.print("Voyageur : ");
        voyageur.afficher();
        System.out.print("A réservé chez ");
        objetReservable.afficher();
    }
}
