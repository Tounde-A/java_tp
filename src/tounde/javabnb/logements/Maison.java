package tounde.javabnb.logements;

import tounde.javabnb.utilisateurs.Hote;

public class Maison extends Logement {

    private int superficieJardin;
    private boolean possedePiscine;

    public Maison(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax, int paramSuperficieJardin, boolean paramPossedePiscine) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        superficieJardin = paramSuperficieJardin;
        possedePiscine = paramPossedePiscine;
    }

    @Override
    public void afficher() {
        super.afficher();

        System.out.println("Le logement est une maison située " + getAdresse() + ".");
        System.out.println("Superficie : " + getSuperficie() + "m2");

        if (superficieJardin <= 0) {
            System.out.println("Jardin : Non");
        } else {
            System.out.println("Jardin : Oui (" + superficieJardin + "m2)");
        }

        if (!possedePiscine) {
            System.out.println("Piscine : Non");
        } else {
            System.out.println("Piscine : Oui");
        }
    }
}
