package training.afpa.CDA24060;

import java.util.Scanner;

import static java.lang.Math.random;

/* !!!! A REVOIR !!!! */

public class Exo7_MMAU {


    int TAILLE = 10;
    int tab[];
    int i; // indice tableau

    public int tab_top() {  // static, void , 0 , ...?? quel mot clé pour quelle signification ?

        int top; // le maximum
        int tab[];

        /*fonction lire la valeur top du tableau*/

        top = tab[0];

        for (i = 0; i < TAILLE-1; i++) {
            if (tab[i] > top) {
                top = tab[i];
                System.out.println("La valeur maximale est : " + top);
            }
        }
        return top;
    }

    // Début

    tab [] = new int [TAILLE+1] ;

    for (i = 0; i < TAILLE-1 ; i++) {

        tab[i] = (double) Math.random (0,100);
    }
}


        // affichage du tableau
        Scanner sc = new Scanner(System.in); // adapté ?
        System.out.println("Voici les 10 valeurs sur tableau." + tab[i++]);
        tab [i] = nextInt ();


        // executer la fonction pour trouver le maximum du tableau

    int top = tab_top; // comment appeler la fonction ?

    System.out.println("La valeur maximum du tableau est : " + top);

}