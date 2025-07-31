package training.afpa.CDA24060;

import java.util.Arrays;
import java.util.Scanner;

public class Exo9_MMAU {

    // Saisir la taille maxi du tableau de valeurs entières positives, negatives et nulles

    public double calculAnalyseTableau() {

        int saisieTaille = 0 ;
        int TAILLE_MAX = saisieTaille;
        int tabEntier [] ;




        // veuillez insérer le nombre de valeur souhaité
        System.out.print("Veuillez entrer la taille du tableau souhaité: ");
        Scanner scanner;
        saisieTaille = scanner.nextInt();

        // générer un tableau
        tabEntier [TAILLE_MAX];


        // trier tableau
        tabEntier
        Arrays.sort(index);
        System.out.println(Arrays.toString(index));

        // boite de message (methode? / ajax ? )


        // fonction analyser Tableau qui calcul et affiche les 3 catégories de nombres

        int nbNul; // nombre d'entiers == 0
        int nbEntierP; // nombre d'entiers positifs
        int nbEntierN; // nombre d'entiers négatifs
        // PAS BESOIN - int compteur; // compteur incremente à chaque analyse de valeur
        int i; //indice

        // compter le nombre de zero
        nbNul = 0;

        for (i=0 ; i< TAILLE_MAX-1 ; i++ ) {
            if (tabEntier[i] == 0) {
                nbNul = nbNul + 1;
            }
            System.out.println("Le nombre de 0 dans ce tableau est de : " + nbNul);
        }
        nbEntierP =0;
        for (i=0 ; i< TAILLE_MAX-1 ; i++ ) {
            if (tabEntier[i] > 0); {
                nbEntierP = nbEntierP +1;
            }





        /*Scanner in = new Scanner (System.in); // lit les valeurs tableau ?
        System.out.println("Veuillez saisir la valeur de a : " + tabEntier[i++] );
        tabEntier[i++]= in.nextInt();

        System.out.println("Tableau avec un foreach:"); // qu'est ce que ça execute ?
        for (int i : tabEntier) {
            System.out.println("Element : " + i);
        */



        }


        calcul nbNul;
        afficher nbNul;

        calcul  nbEntierP;
        calcul moyenneP;
        afficher nbEntierP;
        afficher moyenneP;


        calcul  nbEntierN;
        calcul moyenneN;
        afficher nbEntierN;
        afficher moyenneN;


    }
}
