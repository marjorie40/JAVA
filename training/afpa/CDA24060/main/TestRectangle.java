package training.afpa.CDA24060.main;


import training.afpa.CDA24060.POO.Rectangle;

public class TestRectangle {

    public static void main(String[] args) {

        double perimetre;
        double surface;

        Rectangle testrectangle = new Rectangle(11, 20);
        perimetre = testrectangle.perimetre();
        surface = testrectangle.surface();

        testrectangle.afficher();
    }
    public void perimetre (double longueur, double largeur) {

    }
}
