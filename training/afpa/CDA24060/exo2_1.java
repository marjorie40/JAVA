package training.afpa.CDA24060;
// compute  : an object's price with taxes (*1.196)

import java.util.Scanner;

public class calculPrixTTC {


    // declaration de variable

    public void calculPrixTTC () {

        float prixHT;
        float prixTTC;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix de l'objet");
        prixHT = in.nextFloat();

        prixTTC = (prixHT * 1.196);
        System.out.println("Voici le prix HT : " + prixHT);
        System.out.println("Voici le prix TTC : " + prixTTC);
    }
}
