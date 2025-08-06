package training.afpa.CDA24060.main;


import training.afpa.CDA24060.POO.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {

        double perimetre;

        Rectangle testrectangle = new Rectangle(11, 112);
        perimetre = testrectangle.perimetre();

        testrectangle.afficher();
    }
    public void perimetre (double longueur, double largeur) {

    }
}
