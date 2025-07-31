package training.afpa.CDA24060;

//recherche dichotomique : vérifier la présence ou l'absence d'un entier dans un tableau trié

/* !!!! NON TERMINE !!!! */

import java.util.Scanner;

public class Exo5_MMAU {


    int[] tabEntier =  ;
    int indiceBas ;
    int indiceHaut;
    int indiceMilieu;
    int resultat;
    boolean trouve;  // à quel endroit declaration de valeur x a rechercher ?


    /* Création de la fonction recherche dichotomique*/
    public boolean rechercheDicho () {

        int tabEntier = new int [];  // redondance, doit on affecter forcément des la déclaration ?
        int indiceBas = 1;
        int indiceHaut = tabEntier.lenght - 1;
        int indiceMilieu = (indiceBas + indiceHaut) / 2;
        int y;
        boolean trouve = false;


            while (trouve = false & indiceBas <  indiceHaut)  {

                if (y < tabEntier[indiceMilieu]) {
                indiceHaut = indiceMilieu - 1;
                } else {
                    if (y > tabEntier[indiceMilieu]) {
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
        int[] index = { -2,-1,0,13,24,37,44,56,99,117 };

        Scanner in = new Scanner (System.in);
        System.out.println("Veuillez saisir la valeur de x : ");
        int x = nextInt();









}
