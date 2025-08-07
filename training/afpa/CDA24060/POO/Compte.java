package training.afpa.CDA24060.POO;

import java.util.Scanner;

// 1. création class Compte avec attribut (propriete) solde
public class Compte {

    String transaction;
    double solde = 1000;
    double montantVerse;
    double montantRetrait;

    //2. Création constructeur avec parametre solde (pSolde)
    public Compte (double pSolde){

        this.solde = pSolde;
    }

    // 3. Création méthode (=action) deposer()

    Scanner scanner = new Scanner(System.in);
    public void deposer() {
        System.out.println("Quel est le montant versé ? ");
        montantVerse = scanner.nextDouble();

        solde += montantVerse;
        System.out.println("Votre nouveau solde est de : " +solde);
    }

    // 4. Creation méthode retrait ()

    public void retirer () {
        System.out.println("Quel est le montant retiré ? ");
        montantRetrait = scanner.nextDouble();
        if (montantRetrait>=solde){
            System.out.println("Votre solde est insuffisant, veuillez contacter votre conseiller pour effectuer un retrait.");
        } else {
            solde -= montantRetrait;
        }
        System.out.println("Votre solde = " + solde);
    }

    public String choixTransaction() {

        //System.out.println("Souhaitez-vous effectuer un versement ou un retrait ? ");
        transaction = scanner.nextLine();
        System.out.println ("Vous avez décider de faire un " + transaction);

        if (transaction == "versement") {
            deposer();
        } else {
            if (transaction == "retrait") {
                retirer();
            }
        }
    return transaction;
    }


    public void afficher() {

        System.out.println("Le nouveau solde est de  : " + solde);
        System.out.println("Merci et à bientôt !");
    }
}


