package training.afpa.CDA24060.algo;
// compute  : an object's price with taxes (*1.196)

import java.util.Scanner;

import static java.lang.System.in;

public class CalculPrixTTC {

    // declaration de variable
    public double calculPrixTTC() {

        double prixHT; // quel type pour 2 chiffres après la virgule  ?
        double prixTTC;

        Scanner sc = new Scanner(in);
        System.out.println("Veuillez saisir le prix de l'objet hors taxe. ");
        prixHT = sc.nextDouble();  // IDE propose --sc.nextDouble ();-- pourquoi ?

        prixTTC = (prixHT * 1.196);
        System.out.println("Voici le prix HT : " + prixHT);
        System.out.println("Voici le prix TTC : " + prixTTC);
        return prixTTC;
    }
}
