package training.afpa.CDA24060;


import java.util.Scanner;

// remplir un tableau et calculer la moyenne

public class exo8_MMAU {

    public static void calculMoyenne (int tab) {  // pas de retour possible avec void : quoi choisir comme clé ?

        int somme;
        int moyenne;
        int TAILLE;
        int tab [];
        int i; // déclaration de l'indice
        int valeurSaisie; // entrée par l'utilisateur
        int x; // entiers du tableau implémentés par l'utilisateur

        // fonction calcul de moyenne
        {
            somme = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Veuillez saisir le nombre d'entier que vous souhaitez insérer dans ce tableau. ");
            valeurSaisie = in.nextInt();

            TAILLE = valeurSaisie;
            tab = new int[valeurSaisie];
            for (i = 0; i < TAILLE; i++) {
                somme = somme + tab[i];
            }
            moyenne = somme / TAILLE;
            return moyenne;
        }

        // Début
        TAILLE = valeurSaisie;
        for (i=0 ; i<TAILLE; i++) {
            tab[i] = x;
        }
        int moyenne = calculMoyenne(int tab);  // comment appeler methode. quel nom correct ?
        System.out.println("La moyenne de ces " + valeurSaisie + " valeurs dans le tableau est de : " + moyenne);
    }
}
