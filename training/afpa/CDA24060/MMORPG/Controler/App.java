package training.afpa.CDA24060.MMORPG.Controler;

import training.afpa.CDA24060.MMORPG.Model.Personnages;
import training.afpa.CDA24060.MMORPG.Model.Voleurs;

public class App {
    public static void main(String[] args) {
        System.out.println(" Hello World ! ");



        Personnages personnages = new Personnages ("Java", "HUMAIN", "leger", "1", 100);
        System.out.println(personnages.toString());
    }
}
