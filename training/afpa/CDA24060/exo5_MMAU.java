package training.afpa.CDA24060;

//recherche dichotomique : vérifier la présence ou l'absence d'un entier dans un tableau trié

import java.util.Arrays;

public class exo5_MMAU {

    public class rechercheDicho () {

        int indiceBas;
        int indiceHaut;
        int indiceMilieu;
        int resultat;
        boolean trouve;

        /**
         * faire la fonction recherche
         * /initialiser les valeurs des variables
         * /
         */
        int[] tableauEntier = [int x];  // comment creer un tableau de x entiers et comment le déclarer ?
        int indiceBas = 0;
        int indiceHaut = tableauEntier.length - 1;
        int indiceMilieu = (indiceBas + indiceHaut) / 2;
        boolean trouve = false;

        while (trouve = false & indiceBas <  indiceHaut)  {

            if (y < tableauEntier[indiceMilieu]) {
                indiceHaut = indiceMilieu - 1;
            } else {
                if (y > tableauEntier[indiceMilieu]) {
                    indiceBas = indiceMilieu + 1;
                } else {
                    trouve = true;
                }
                indiceMilieu = (indiceBas + indiceHaut) / 2;
            }
            if (trouve = true) {
                return resultat = indiceMilieu;
            } else {
                return resultat = -1;
            }
        }
    }
    int[] index = { 2, 5, 5, 8, 9, 10, 11, 11, 15, 16 };
    int x;
    int resultat;


    System.out.println(Arrays.toString(index));

    System.out.println("");





}
