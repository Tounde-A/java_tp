package tounde.javabnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utile {

    private Utile() {

    }

    public static Date construireDate(int jour, int mois, int annee) {
        return new Date((annee - 1900), (mois + 1), jour);
    }

    public static String formaterDate(Date date) {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        return formater.format(date);
    }
}
