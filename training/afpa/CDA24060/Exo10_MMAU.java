package training.afpa.CDA24060;

import java.util.Scanner;

public class Exo10_MMAU {
// TabMultiplication

    public int tabMultiplication() {


        int resultat = 0; // initialisation du résultat
        int X; // premiere valeur saisie
        int Y; // seconde valeur saisie
        int[][] tabMultiplication;
        int i; // indice des abscisses
        int j; // indice des ordonnées
        int lenght = 10;

        // Creation de tableau 10*10
        tabMultiplication = new int[10][10];

        // Saisir 2 valeurs pour le calcul

        Scanner saisieValeurX = new Scanner (System.in);
        System.out.print("Veuillez saisir une première valeur entre 0 et 9");
        X = saisieValeurX.nextInt();
        Scanner saisieValeurY = new Scanner (System.in);
        System.out.println ("Veuillez saisir une seconde valeur entre 0 et 9");
        Y = saisieValeurY.nextInt();


        // Boucle calcul
        if X=0 || Y=0 {
                resultat = 0;
            }
        
        for (i > 0 ; i < lenght; i++) {
            for (j > 0 ; j < lenght; j++) {
                resultat = tabMultiplication[i][j] = i * j;
            }
        }
        return resultat;

    }
}
        /* calculProduit; appel d'indice dans tableau (ou calcul ?)
        * Affichage résultat;
        * Proposition "souhaitez vous encore un calcul ?"
         */







    }



}
