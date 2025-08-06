package training.afpa.CDA24060.algo;

import java.util.Scanner;

public class Exo11_MMAU {
    /* public double calculatrice() {

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
    /*  System.out.println ("Saisissez un nombre X");
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
*/
    public void calculatrice() {
        char operation;
        float valeurX;
        float valeurY;
        double resultat;

        // choix de l'operation


        // ici c'est la création du scanner : toujours sur le même principe quelque soit l'objet
        // => Nom_de_la_classe nom = new Nom_de_la_classe(System.ini)
        // donc on veux un Scanner donc Scanner nom = new Scanner(System.ini)

        //Scanner operation = new char(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez choisir une opération a effectuer. Tapez + pour une addition. Tapez - pour une soustraction." +
                " Tapez * pour une multiplication. Tapez / pour une division. ");

        // je prends mon scanner créé et je lis la saisie que je met dans operation

        // operation= operation;
        // -> cela nous renvoit une chaine de caractere et on veux un char donc il faut penser à recuperer le 1er caractere de la chainbe
        // -> pour cela on a une méthode fournit avec les string charAt(indice)
        operation = scanner.nextLine().charAt(0);


    /* JOptionPane.showMessageDialog(null, "Veuillez choisir une opération a effectuer. Tapez \+ pour une addition. Tapez \- pour une soustraction." +
    " Tapez \* pour unemultiplication. Tapez \/ pour une division.");
     */

        System.out.println("Saisissez un nombre X");
        //valeurX = operation.nextFloat();
        // -> ici meme erreur tu prends le scanner et tu lis la saisie
        valeurX = scanner.nextFloat();
        System.out.println("Saisissez un nombre Y");
        //valeurY = operation.nextFloat();
        // -> ici meme erreur tu prends le scanner et tu lis la saisie
        valeurY = scanner.nextFloat();

        // -> ici dans ton switch, tu n'as pas besoin de mettre en place le test de comparaison
        // -> cela est fait par le switch lui même
        // -> tu indique la valeur à tester dans switch(valeur_a_tester) et dans le case la valeur à comparer case : valeur_a_comparer
        // -> tu dois tester l'operation et selon effectuer l'operation associé
        // -> toi tu test le resultat ce qui n'est pas correct

        switch (operation) {
            case '+':
                resultat = valeurX + valeurY;
                System.out.println(resultat);
                break;
            case '-':
                resultat = valeurX - valeurY;
                System.out.println(resultat);
                break;
            case '*':
                resultat = valeurX * valeurY;
                System.out.println(resultat);
                break;
            case '/':
                resultat = valeurX / valeurY;
                System.out.println(resultat);
                break;
            default:
                System.out.println("Une erreur est survenue, merci de saisir des données valides. ");
                break;

        }
        // -> ton retrun n'est pas nécessaire sauf si tu souhaite renvoyer le résultat
    }
}