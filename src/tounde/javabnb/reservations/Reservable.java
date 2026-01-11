package tounde.javabnb.reservations;

public interface Reservable {

    boolean aUneDateArriveeCorrecte();
    boolean aUnNombreDeNuitsCorrect();
    boolean aUnNombreDeVoyageursCorrect();
    void afficher();
}
