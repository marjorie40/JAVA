package training.afpa.CDA24060;

import java.util.Arrays;
import java.util.Scanner;

public class Exo9_MMAU {

    // Saisir la taille maxi du tableau de valeurs entières positives, negatives et nulles

    public double calculAnalyseTableau() {

        int saisieTaille = 0;
        int TAILLE_MAX = saisieTaille;
        int tabEntier[];
        int i; // indice

        // veuillez insérer le nombre de valeur souhaité

        Scanner in = new Scanner(System.in);
        System.out.print("Veuillez entrer la taille du tableau souhaité: ");
        saisieTaille = Scanner.nextInt();  // pourquoi pas valide ? Retour de la saisie taille de tableau par le User


        // générer un tableau

        for (i = 0;  i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Veuillez entrer une valeur (positive, négative ou nulle : ");
            tabEntier [i] = Scanner.nextInt();

        } while (i = TAILLE_MAX );

        System.out.print("Voici les valeurs saisies. "); // affichage en ligne, correct ?

            /* tabEntier[TAILLE_MAX] = Math.random(-5000, 5000);*/


        // trier tableau

        Arrays.sort(tabEntier,  0, TAILLE_MAX);
        System.out.println(Arrays.toString(tabEntier));

        // boite de message (methode? / ajax ? ) ???


        // methode analyser Tableau qui calcul et affiche les 3 catégories de nombres

        int nbNul; // nombre d'entiers == 0
        int nbEntierP; // nombre d'entiers positifs
        int nbEntierN; // nombre d'entiers négatifs


        // PAS BESOIN - int compteur; // compteur incremente à chaque analyse de valeur


        // compter le nombre de zero

        nbNul = 0;

        for (i = 0; i < TAILLE_MAX - 1; i++) {
            if (tabEntier[i] == 0) {
                nbNul = nbNul + 1;
            }
            System.out.println("Le nombre de 0 dans ce tableau est de : " + nbNul);
        }

        // compter le nombre de valeurs positives

        nbEntierP = 0;
        for (i = 0; i < TAILLE_MAX - 1; i++) {
            if (tabEntier[i] > 0) ;
            {
                nbEntierP = nbEntierP + 1;
            }
            System.out.println("Le nombre de valeur(s) positive(s) dans ce tableau est de : " + nbEntierP);
        }

        // compter le nombre de valeurs negatives

        nbEntierN = 0;
        for (i = 0; i < TAILLE_MAX - 1; i++) {
            if (tabEntier[i] < 0) ; {
                nbEntierN = nbEntierN + 1;
            }
            System.out.println("Le nombre de valeur(s) négative(s) dans ce tableau est de : " + nbEntierN);
        }

        // Faire la moyenne des valeurs positives
        double calculMoyenneP;
        calculMoyenneP = 0;
        double resultatP = 0; // somme des valeurs positives

        for (i = 0; i < TAILLE_MAX - 1; i++) {
            if (tabEntier[i] > 0) ;{
                resultatP = resultatP + i ;
            }
            calculMoyenneP = resultatP / nbEntierP ;

            System.out.println("Voici la moyenne des valeurs positives dans ce tableau : " + calculMoyenneP);
        }
        return calculMoyenneP;

        // Faire la moyenne des valeurs negatives

        double calculMoyenneN;
        calculMoyenneN = 0;
        double resultatN = 0; // somme des valeurs negatives

        for (i = 0; i < TAILLE_MAX - 1; i++) {
            if (tabEntier[i] > 0) ;{
                resultatN = resultatN + i ;
            }
            calculMoyenneP = resultatN / nbEntierN ;

            System.out.println("Voici la moyenne des valeurs positives dans ce tableau : " + calculMoyenneN);
        }
        return calculMoyenneN;
    }

}





        /*Scanner in = new Scanner (System.in); // lit les valeurs tableau ?
        System.out.println("Veuillez saisir la valeur de a : " + tabEntier[i++] );
        tabEntier[i++]= in.nextInt();

        System.out.println("Tableau avec un foreach:"); // qu'est ce que ça execute ?
        for (int i : tabEntier) {
            System.out.println("Element : " + i);
        */
/*


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
