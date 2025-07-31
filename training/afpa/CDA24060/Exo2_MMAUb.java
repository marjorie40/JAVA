package training.afpa.CDA24060;

import java.util.Scanner;

// Factorielle d'un entier valeurSaisie avec tant que

public class Exo2_MMAU {

    public int factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int compteur = 0;

        Scanner in = new Scanner(System.in);  // scanner pour lire entrée
        System.out.println("Veuillez saisir votre valeur. ");  // affichage pour recueillir
        valeurSaisie = in.nextInt(); // affecte variable avec le in (indiquer le type attendu :Int; Float; Double)

        if (valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            while (compteur > 1) {
                resultat = resultat * compteur;
                compteur = compteur++;
            }
            System.out.println("La factorielle de " + valeurSaisie + " avec Tant que est : " + resultat);
        }
        return resultat;
    }
}


// Factorielle d'un entier valeurSaisie avec répéter

public class Exo2_MMAUb {

    public int factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int compteur = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre valeur.");
        valeurSaisie = in.nextInt();

        compteur = valeurSaisie;

        if (valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            do {
                resultat = resultat * compteur;
                compteur = compteur--;  // je ne comprends pas la méthode
            }
                while(compteur == 1);  // MEF il suggere un boolean quand seulement = 1 ou = 0 !!
            System.out.println ("La factorielle de " + valeurSaisie + " avec Répéter Jusqu'à est : " + resultat);  // placement du system out avant finSinon ou avant fin ?
        }
        return resultat;
    }
}



// Factorielle d'un entier valeurSaisie avec pour

public class Exo2_MMAUc {
    public int factorielle () {

        int valeurSaisie;
        int resultat = 1;
        int  compteur;

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir votre valeur.");
        valeurSaisie = in.nextInt();

        compteur = valeurSaisie;

        if (valeurSaisie == 0 || valeurSaisie == 1) {
            System.out.println("La factorielle de " + valeurSaisie + "est : " + resultat);
        } else {
            for (compteur > 1; compteur == valeurSaisie; compteur ++) {  // "not a statement ??" c'est a dire
                resultat = resultat * compteur;
                compteur = compteur - 1;
            }
            System.out.println ("La factorielle de " + valeurSaisie + " avec Pour est : " + resultat);
            }
        return resultat;
        }
    }