package training.afpa.CDA24060;
// compute  : an object's price with taxes (*1.196)

import java.util.Scanner;

import static java.lang.System.in;

public class calculPrixTTC {


    // declaration de variable

    public void calculPrixTTC () {

        double prixHT;
        double prixTTC;

        Scanner sc = new Scanner(in);
        System.out.println("Veuillez saisir le prix de l'objet hors taxe. ");
        prixHT = in.nextDouble();

        prixTTC = (prixHT * 1.196);
        System.out.println("Voici le prix HT : " + prixHT);
        System.out.println("Voici le prix TTC : " + prixTTC);
    }
}
