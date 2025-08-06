package training.afpa.CDA24060.POO;

import java.util.Scanner;

// 1. création class Compte avec attribut (propriete) solde
public class Compte {

    String transaction;
    double solde;
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
    }

    public String transaction() {

        System.out.println("Souhaitez-vous effectuer un versement ou un retrait ? "); // idealement interface graphique 2 boutons et échappe
        transaction = scanner.nextLine(); // s'attendre a une réponse de type String : est ce correct ?

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
    }
}


