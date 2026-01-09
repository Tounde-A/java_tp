package tounde.javabnb.logements;

import tounde.javabnb.utilisateurs.Hote;
import tounde.javabnb.utilisateurs.Personne;

public class Logement {

    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement (Hote paramHote, int paramTarifParNuit, String paramAdresse, int paramSuperficie, int paramNbVoyageursMax) {
        hote = paramHote;
        tarifParNuit = paramTarifParNuit;
        adresse = paramAdresse;
        superficie = paramSuperficie;
        nbVoyageursMax = paramNbVoyageursMax;
    }

    public Hote getHote() {
        return hote;
    }

    public int getTarifParNuit() {
        if (tarifParNuit < 0) {
            return 0;
        } else {
        return tarifParNuit;
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getNbVoyageursMax() {
        return nbVoyageursMax;
    }

    public void afficher() {
        System.out.print("L'hôte est : ");
        hote.afficher();
    }
}
