package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.Compte;

public class TestCompte {

        public static void main (String[] args) {
            //TODO Auto-genrated method stub
            TestCompte main = new TestCompte();
            main.start ();

            System.out.println("Solde du compte ");


        }

        public void start ()
        { Compte compte;

            double solde = 100.20;
            compte = new Compte(solde);


        }
}
