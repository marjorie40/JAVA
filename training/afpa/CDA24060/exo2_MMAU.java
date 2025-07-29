package training.afpa.CDA24060;

import java.util.Scanner;

// Factorielle d'un entier valeurSaisie avec tant que

public class exo2_MMAU {
    public void factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int compteur = 0; // demande d'initialisation de compteur de l'IDE

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre valeur. ");
        valeurSaisie = in.nextInt(); // ça signifie quoi ??

        if (valeurSaisie = 0 || valeurSaisie = 1) {  // quel code, terminologie pour -OU-
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            while (compteur > 1) {
                resultat = resultat * compteur;
                compteur = compteur++;
            }
        }
        System.out.println("La factorielle de " +valeurSaisie + " avec Tant que est : " + resultat);
    }
}


// Factorielle d'un entier valeurSaisie avec répéter

public class exo2_MMAUb {
    public void factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int compteur = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre valeur.");
        valeurSaisie = in.nextInt();

        compteur = valeurSaisie;

        if (valeurSaisie = 0 || valeurSaisie = 1) {
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            do {
                resultat = resultat * compteur;
                compteur = compteur--;  // je ne comprends pas la méthode
            }
                while(compteur == 1);  // MEF il suggere un boolean quand seulement = 1 ou = 0 !!
            System.out.println ("La factorielle de " + valeurSaisie + " avec Répéter Jusqu'à est : " + resultat);  // placement du system out avant finSinon ou avant fin ?
        }
    }
}



// Factorielle d'un entier valeurSaisie avec pour

public class exo2_MMAUc {
    public void factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int compteur;

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre valeur.");
        valeurSaisie = in.nextInt();

        compteur = valeurSaisie;

        if (valeurSaisie = 0 || valeurSaisie = 1) {
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            for (compteur > 1, compteur = valeurSaisie, compteur++)  {
                resultat = resultat * compteur;
                compteur = compteur - 1;
            }
            System.out.println ("La factorielle de " + valeurSaisie + " avec Pour est : " + resultat);
            }
        }
    }