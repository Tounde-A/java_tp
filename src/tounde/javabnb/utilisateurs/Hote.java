package tounde.javabnb.utilisateurs;

public class Hote extends Personne{

    private int delaiDeReponse;

    public Hote(String paramPrenom, String paramNom, int paramAge, int paramDelaiDeReponse) {
        super(paramPrenom, paramNom, paramAge);
        delaiDeReponse = paramDelaiDeReponse;
    }

    @Override
    public void afficher() {
        super.afficher();
        if (delaiDeReponse <= 1) {
            System.out.println("qui s'engage à répondre dans l'heure");
        } else {
            System.out.println("qui s'engage à répondre dans les " + delaiDeReponse + " heures");
        }
    }
}
