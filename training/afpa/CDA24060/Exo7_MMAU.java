package training.afpa.CDA24060;

import java.util.Scanner;

import static java.lang.Math.random;

public class Exo7_MMAU {

    public class tab_top() {  // static, void , 0 , ...?? quel mot clé pour quelle signification ?
        int top;
        int TAILLE = 10;
        int tab[];
        int i; // indice tableau

        /*fonction lire la valeur top du tableau*/

        public class (){
            top = tab[0];

            for (i = 0; i < TAILLE; i++) {
                if (tab[i] > top) {
                    top = tab[i];
                    System.out.println("La valeur maximale est : " + top);  //  est ce que ça vaut un return ??
                }
                return top;
            }

        }

        // signaler l'entrée "début, y a t il un process particulier?

        tab = new int[TAILLE];
        for (i = 0; i < TAILLE - 1; i++;){
            tab[i] = random (0 , 100); // quelle nomenclature pour choix aléatoires d'entiers (de 0 a 100) dans le tableau
        }
        }


        // affichage du tableau
        Scanner sc = new Scanner(System.in); // adapté ?
        System.out.println("Voici les 10 valeurs sur tableau." + tab[i++]);


        // executer la fonction pour trouver le maximum du tableau

    int top = tab_top; // comment appeler la fonction ?

    System.out.println("La valeur maximum du tableau est : " + top);

}