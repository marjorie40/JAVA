package training.afpa.CDA24060.algo;

import java.util.Scanner;

public class Exo6_MMAU {

    /* Créer une matrice tableau 2 lignes (indice, factorielle) */

    int tabEnt[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // est-ce OK de combiner : déclaration, activation du tableau + déclaration de la taille
    int tabEnt2[] = new int[2];
    int valeurSaisie;
    int resultat;
    int i ; // indice des tableaux

    public void tab_factorielle() {

        if (i == 0) {

            tabEnt[i] = 1;
            tabEnt2[i] = 1;
        } else {
            for(int i=0; i < tabEnt.length - 1; i++) { // pourquoi IDE demande , ou ; ? Quelle est la règle  ?

                resultat = tabEnt[i] * tabEnt2[i - 1];
            }
        }
        /* Fonction calcul de la factorielle
        resultat = 1;

        for (i = 1 ;i< tabEnt.length-1 ;i++) {
            resultat = resultat * i;
        }
        return resultat;
    } */
            // Saisie du nombre par l'utilisateur

            Scanner in = new Scanner(System.in);
            System.out.println("Veuillez saisir une nombre, entre 1 et 10, pour calculer sa factorielle. ");
            valeurSaisie = in.nextInt();

            if (valeurSaisie <= 1 || valeurSaisie >= 10) {
                System.out.println("ERREUR de saisie !!! Veuillez, s'il vous plait, saisir une valeur entre 1 et 10 pour calculer sa factorielle. ");
                valeurSaisie = in.nextInt();
            }
            i = (valeurSaisie - 1);

            tab_factorielle();  // comment indiquer faire tab_factoriel de i ? N'accepte pas de valeur dans les ().
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);

    }
}
    /*for (i =1 ; i < tabEnt.length ; i++) {
        int tabEnt [1][i] = calculFactoriel (i+1) ;
    }
    System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
*/
