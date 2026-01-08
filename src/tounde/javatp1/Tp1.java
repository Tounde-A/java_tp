package tounde.javatp1;

import java.util.Scanner;

public class Tp1 {

    // Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
    private static Scanner scanner;

    // Méthode principale
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        // Appel de la méthode de l'exercice 1.1
        exercice4_2();

        scanner.close();
    }

    // Méthode de l'exercice n°1.1
    public static void exercice1_1() {

        // 1° - Déclaration
        String prenom;
        String nom;
        String age;

        // 2° - Initialisation
        System.out.print("Prénom : ");
        prenom = scanner.next();

        System.out.print("nom : ");
        nom = scanner.next();

        System.out.print("âge : ");
        age = scanner.next();

        // 3° - Utilisation
        System.out.println("Bonjour " + prenom + " " + nom + " (" + age + " ans).");
    }

    // Méthode de l'exercice n°1.2
    public static void exercice1_2() {
        // ...
        int valeurX;
        int valeurY;
        int swap;

        System.out.print("Valeur X : ");
        valeurX = scanner.nextInt();

        System.out.print("Valeur Y : ");
        valeurY = scanner.nextInt();

        swap = valeurX;
        valeurX = valeurY;
        valeurY = swap;

        System.out.println("Les valeurs sont permutées, x vaut " + valeurX + " et y vaut " + valeurY);
    }

    public static void exercice2_1() {

        //...
        String premierMot;
        String secondMot;

        System.out.print("Écrivez un premier mot : ");
        premierMot = scanner.next();

        System.out.print("Écrivez un second mot : ");
        secondMot = scanner.next();

        if (premierMot.length() > secondMot.length()) {
            System.out.println(premierMot + " est le mot avec le plus de caractères.");
        } else if (premierMot.length() == secondMot.length()) {
            System.out.println("Les deux mots ont le même nombre de caractères.");
        } else {
            System.out.println(secondMot + " est le mot avec le plus de caractères.");
        }
    }

    public static void exercice2_2() {

        //...
        int year;

        System.out.print("Veuillez entrer une année : ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("L’année " + year + " est bissextile");
        } else if (year % 100 == 0) {
            System.out.println("L’année " + year + " n'est pas bissextile");
        } else if (year % 4 == 0) {
            System.out.println("L’année " + year + " est bissextile");
        } else {
            System.out.println("L’année " + year + " n’est pas bissextile");
        }
    }

    public static void exercice3_1() {

        //...
        int max = 0;
        int min = 100;

        for (int i = 1; i < 11; i++) {
            double valueDecimal = Math.random();
            valueDecimal = valueDecimal * 101;
            int rand = (int) valueDecimal;

            System.out.println("le nombre " + i + " vaut " + rand);

            if (rand > max) {
                max = rand;
            }

            if (rand < min) {
                min = rand;
            }
        }

        System.out.println("le maximum vaut : " + max);
        System.out.println("le minimum vaut : " + min);
    }

    public static void exercice4_1() {

        //...
        int random = (int) (Math.random() * 101);
        int userNumber;
        int difference = -1;

        while (difference != 0) {
            System.out.print("Devine un nombre entre 0 et 100 : ");
            userNumber = scanner.nextInt();

            difference = Math.abs(userNumber - random);

            if (difference > 20) {
                System.out.println("Froid");
            } else if (difference >= 6) {
                System.out.println("Tiede");
            } else if (difference >= 1) {
                System.out.println("Chaud");
            } else {
                System.out.println("Gagné");
            }
        }
    }

    public static void exercice4_2() {

        //...
        int random = (int) (Math.random() * 101);
        int userNumber;
        int difference;

        do {
            System.out.print("Devine un nombre entre 0 et 100 : ");
            userNumber = scanner.nextInt();

            difference = Math.abs(userNumber - random);

            if (difference > 20) {
                System.out.println("Froid");
            } else if (difference >= 6) {
                System.out.println("Tiede");
            } else if (difference >= 1) {
                System.out.println("Chaud");
            } else {
                System.out.println("Gagné");
            }
        }
        while (difference != 0);
    }
}