package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.Compte;

import java.util.Scanner;

public class TestCompte {

    static void Compte() {
        System.out.println("Solde du compte ");
    }
        public static void main (String[] args) {
            String transaction;
            double solde = 1000.31;
            double montantVerse;
            double montantRetrait;



            //TODO Auto-genrated method stub
            TestCompte compte = new TestCompte();
            compte.start ();


        }

        public void start ()
        { Compte compte;
            String transaction;
            double solde = 1000.31;
            double montantVerse;
            double montantRetrait;

            Scanner scanner = new Scanner(System.in);

            compte = new Compte(solde);
            System.out.println("Solde du compte est " +solde);
            System.out.println("Souhaitez-vous effectuer un versement ou un retrait ? ");
            //transaction = scanner.nextLine();
            compte.choixTransaction(); //probleme, ne bascule pas sur deposer ou retirer ... pas a pas : NE match PAS - retrait ou versement-
            compte.deposer();  // deposer fonctionne
            compte.retirer(); // retirer fonctionne

            //montantVerse = scanner.nextDouble();

            //compte.choixTransaction();
            //solde = scanner.nextDouble();
            //montantVerse = scanner.nextDouble();
            //montantRetrait = scanner.nextDouble();

            // resultat pour le client

            compte.afficher(); // afficher fonctionne

            //System.out.println("Solde du compte est " +solde);
        }
}
