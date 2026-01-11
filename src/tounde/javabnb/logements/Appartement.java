package tounde.javabnb.logements;

import tounde.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {

    private int numeroEtage;
    private int superficieBalccon;

    public Appartement(Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramNumeroEtage, int paramSuperficie, int paramNbVoyageursMax, int paramSuperficieBalccon) {
        super(paramHote, paramTarifParNuit, paramAdresse, paramSuperficie, paramNbVoyageursMax);
        numeroEtage = paramNumeroEtage;
        superficieBalccon = paramSuperficieBalccon;
    }

    @Override
    public void afficher() {
        System.out.println(getHote());
        System.out.print("Le logement est situé " + getAdresse() + ",");

        String suffix = (numeroEtage == 1) ? "er" : "eme";
        if (numeroEtage <= 0) {
            System.out.print(" au rez-de-chaussé.");
        } else {
            System.out.println(" au " + numeroEtage + suffix + " étage.");
        }

        System.out.println("Superficie : " + getSuperficie() + "m2");

        if (superficieBalccon <= 0) {
            System.out.println("Balcon : Non");
        } else {
            System.out.println("Balcon : Oui (" + superficieBalccon + "m2)");
        }
    }
}
