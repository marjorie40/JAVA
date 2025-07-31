import training.afpa.CDA24060.Exo3_MMAU;
import training.afpa.CDA24060.Exo4_MMAU;

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

        Exo3_MMAU exo3_MMAU = new Exo3_MMAU();
        exo3_MMAU.equation();

        Exo4_MMAU exo4_MMAU = new Exo4_MMAU();
        resultat= exo4_MMAU.calculPuissance(2,3);
        System.out.println("le résultat est :" + resultat);

        System.out.println ("Démarrage du programme");
    }


}