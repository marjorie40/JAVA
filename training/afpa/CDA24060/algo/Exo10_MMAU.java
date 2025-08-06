package training.afpa.CDA24060.algo;

import java.util.Scanner;

public class Exo10_MMAU {
// TabMultiplication

    public void tabMultiplication() {


        int resultat = 0; // initialisation du résultat
        int X; // premiere valeur saisie
        int Y; // seconde valeur saisie
        int[][] tabMultiplication;  // matrice
        int i; // indice des abscisses
        int j; // indice des ordonnées
        int lenght = 10;
        char responseUser ;

        // Creation de tableau 10*10
        tabMultiplication = new int[10][10];
        //tabMultiplication[i][j] = {{0,1,2,3,4,5,6,7,8,9} ; {0,1,2,3,4,5,6,7,8,9}}

        // Saisir 2 valeurs pour le calcul
        Scanner saisieValeurX = new Scanner (System.in);
        System.out.print("Veuillez saisir une première valeur entre 0 et 9. ");
        X = saisieValeurX.nextInt();
        Scanner saisieValeurY = new Scanner (System.in);
        System.out.println ("Veuillez saisir une seconde valeur entre 0 et 9. ");
        Y = saisieValeurY.nextInt();


        // Boucle calcul
        if (X==0 || Y==0) { //comment ecrire OU avec des int ?
            resultat = 0;
        }

        for (i = 1 ; i < lenght; i++) { // n'accepte pas i > 0;
            for (j = 1 ; j < lenght; j++) { // ne va pas prendre la longueur en ordonnée ?
                resultat = tabMultiplication[i][j] = i * j;
            }
            System.out.println("Le résultat est : " + resultat);
        }

        System.out.println("Souhaitez-vous effectuer un nouveau calcul ? Tapez o pour Oui ou n pour Non.");
        Scanner sc = new Scanner (System.in);
        responseUser = sc.nextLine().toLowerCase().charAt(0);  // IDE propose nextLine

        if (Character.isLetter('n')) {
            System.out.println("Merci et à bientôt ! ");
            System.exit (0);  // sortie propre ?
        } else {
            if (Character.isLetter('o'));
            System.out.println("Let's Go ! ");
            tabMultiplication();
        }
    }
}