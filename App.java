import training.afpa.CDA24060.algo.Exo10_MMAU;

public class App {

    public static void main (String[] args) {
        //TODO Auto-genrated method stub

        System.out.println(" Hello World ! ");

        App app = new App ();
        app.start ();
    }

    public void start ()
    {
        double resultat;

        /* Exo8_MMAU Exo8_MMAU = new Exo8_MMAU();
        Exo8_MMAU.calculMoyenne();

        Exo3_MMAU exo3_MMAU = new Exo3_MMAU();
        exo3_MMAU.equation();*/

        Exo10_MMAU exo10_MMAU = new Exo10_MMAU();
        exo10_MMAU.tabMultiplication();

        /*Exo4_MMAU exo4_MMAU = new Exo4_MMAU();
        resultat= exo4_MMAU.calculPuissance(2,3);
        System.out.println("le résultat est :" + resultat);

        System.out.println ("Démarrage du programme");*/
    }


}