package tounde.javabnb.utilisateurs;

public class Personne {

    private String prenom;
    private String nom;
    private int age;

    public Personne(String paramPrenom, String paramNom, int paramAge) {
        prenom = paramPrenom;
        nom = paramNom;
        age = paramAge;
    }

    public void afficher() {
        System.out.print(prenom + " " + nom + " (" + age + " ans)");
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (" + age + " ans)";
    }
}
