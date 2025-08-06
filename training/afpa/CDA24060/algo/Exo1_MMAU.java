package training.afpa.CDA24060.algo;

import java.util.Scanner;

// Somme d'entiers version Tant que
public class Exo1_MMAU {

    public int sommeWhile () {

        int valeurSaisie;
        int compteur = 0;
        int resultat = 0;


        Scanner in = new Scanner (System.in);
        System.out.println("Merci de saisir votre valeur.");
        valeurSaisie = in.nextInt();

        while (compteur < valeurSaisie){
            resultat = resultat + valeurSaisie; // suis je obligée de faire un -system out println- ou je peux laisser computer en OFF ?
            compteur = (compteur++);
            System.out.println("La somme avec tant que est égale à :" + resultat);
        }
        return resultat;
    }

    public int sommeFor () {

        int valeurSaisie;
        int compteur;
        int resultat = 0;


        Scanner in = new Scanner (System.in);
        System.out.println("Merci de saisir votre valeur.");
        valeurSaisie = in.nextInt();

        for (compteur =0; compteur<valeurSaisie; compteur++) {
            resultat = resultat + compteur;
            System.out.println("La somme avec pour est égale à :" + resultat);
        }
        return resultat;
    }
    public int sommeDo () {

        int valeurSaisie;
        int compteur = 1;
        int resultat = 0;


        Scanner in = new Scanner (System.in);
        System.out.println("Merci de saisir votre valeur.");
        valeurSaisie = in.nextInt();

        do {
            System.out.println(resultat = resultat + compteur);
            compteur = compteur++;
        } while (compteur==valeurSaisie);

        System.out.println("La somme avec répéter jusqu'à est égale à :" + resultat);
        return resultat;
    }
}