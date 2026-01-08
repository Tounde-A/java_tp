package tounde.javatp1;

import java.util.Scanner;

public class CountingSort {

    private static Scanner scanner;

    public static void main(String[] args) {

        int[] tab = {4, 6, 4, 2, 10, 2, 4, 8, 10, 1, 4, 9, 8, 9, 4, 1, 8, 2, 9};
        int[] tab1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] tab2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] tab3 = {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        int[] tab4 = {2023, 2016, 2014, 2032, 2011, 2022, 2014, 1992, 2014, 1998, 2020, 2028, 2011, 2009, 2017, 2001,
                2028, 2014, 2025};

        scanner = new Scanner(System.in);

        triComptage(tab);

        scanner.close();

    }

    private static void triComptage(int[] tab) {

        printTab(tab);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }

            if (tab[i] > max) {
                max = tab[i];
            }
        }

        int[] tabComptage = new int[max - min + 1];

        for (int i = 0; i < tab.length; i++) {
            tabComptage[tab[i] - min]++;
        }

        printTab(tabComptage);

        int[] tabTrie = new int[tab.length];

        int indice = 0;

        for (int valeur = 0; valeur < tabComptage.length; valeur++) {
            int nombreOccurence = tabComptage[valeur];

            for (int i = 0; i < nombreOccurence; i++) {
                tabTrie[indice] = valeur + min;
                indice++;
            }
        }

        printTab(tabTrie);

    }

    private static void triComptage2(int[] tab) {

        printTab(tab);

        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                tab[index] = i;
                index++;
                count[i]--;
            }
        }

        printTab(tab);

    }

    private static void printTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
