package training.afpa.CDA24060.algo;


import java.util.Scanner;


// remplir un tableau et calculer la moyenne

public class Exo8_MMAU {

    public void calculMoyenne () {
        int somme;
        double moyenne;
        int lenght;
        int tab[] = new int[10];
        int i; // déclaration de l'indice
        int valeurSaisie; // entrée par l'utilisateur
        int x; // entiers du tableau implémentés par l'utilisateur

        // méthode calcul de moyenne
        Scanner in = new Scanner(System.in);


        somme = 0;
        i = 0;
        moyenne = 0;

        do {
            System.out.println("Veuillez saisir le nombre d'entier que vous souhaitez insérer dans ce tableau. ");
            valeurSaisie = in.nextInt();
            // remplissage du tableau
            tab[i] = valeurSaisie;
            moyenne = moyenne + valeurSaisie;
            i = i + 1;
            System.out.println("Saisissez les " + valeurSaisie + "notes pour calculer la moyenne.");
        } while (i <= tab.length - 1); // saisir et afficher les valeurs du tab[], correct ?

        moyenne = moyenne/tab.length;

        nom:
        for(i = 0; i <= tab.length-1; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("moyenne du tableau : " + moyenne );
    }
}
