package training.afpa.CDA24060;

import static javax.swing.JOptionPane.YES_NO_OPTION;
import java.util.Scanner;

public class Exo11_MMAU {
    public double calculatrice() {

        char operation;
        float valeurX;
        float valeurY;
        double resultat;

        // choix de l'operation

        Scanner operation = new char(System.in);
        System.out.println("Veuillez choisir une opération a effectuer. Tapez \+ pour une addition. Tapez \- pour une soustraction." +
                " Tapez \* pour une multiplication. Tapez \/ pour une division. ");
        operation= operation;
        /* JOptionPane.showMessageDialog(null, "Veuillez choisir une opération a effectuer. Tapez \+ pour une addition. Tapez \- pour une soustraction." +
        " Tapez \* pour unemultiplication. Tapez \/ pour une division.");
         */
        System.out.println ("Saisissez un nombre X");
        valeurX = operation.nextFloat();
        System.out.println ("Saisissez un nombre Y");
        valeurY = operation.nextFloat();

        switch (resultat){
            case 1 :
                operation == (+);
                resultat = valeurX + valeurY;
                System.out.println(resultat);
                break;
            case 2 :
                operation == (-);
                resultat = valeurX - valeurY;
                System.out.println(resultat);
                break;

            case 3 :
                operation == (*);
                resultat = valeurX * valeurY;
                System.out.println(resultat);
                break;
            case 4 :
                operation == (/);
                resultat = valeurX / valeurY;
                System.out.println(resultat);
                break;
            default :
                System.out.println ("Une erreur est survenue, merci de saisir des données valides. ");

        }
        return resultat;
    }
}
