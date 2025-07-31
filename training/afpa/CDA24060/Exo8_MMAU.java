package training.afpa.CDA24060;


import java.util.Scanner;

/* !!!! NON TERMINE !!!! */

// remplir un tableau et calculer la moyenne

public class Exo8_MMAU {

    public double calculMoyenne () {
        int somme;
        double moyenne;
        int TAILLE;
        int tab[];
        int i; // déclaration de l'indice
        int valeurSaisie; // entrée par l'utilisateur
        int x; // entiers du tableau implémentés par l'utilisateur

        // méthode calcul de moyenne
        {
            somme = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Veuillez saisir le nombre d'entier que vous souhaitez insérer dans ce tableau. ");
            valeurSaisie = in.nextInt();

            TAILLE = valeurSaisie;

            tab = new int[valeurSaisie];

            for (i = 0; i < TAILLE - 1; i++) {

                somme = somme + tab[i];
            }
            moyenne = (double) somme / TAILLE;

            return moyenne;
        }

        // Début
        TAILLE = valeurSaisie;
        for (i = 0; i < TAILLE - 1; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Saisissez les " + valeurSaisie + "notes pour calculer la moyenne.");
            tab[i++] = in.nextInt();

            calculMoyenne();  // comment appeler une methode. quel nom correct ?
            System.out.println("La moyenne de ces " + valeurSaisie + " valeurs dans le tableau est de : " + moyenne);
        }
    }
}
