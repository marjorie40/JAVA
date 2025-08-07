package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.Geometry.Cercle;
import training.afpa.CDA24060.POO.Geometry.Point;

public class TestCercle {
    public static void main(String[] args) {

        double abscisse;
        double ordonnee;
        double PI =3.14;
        double pointCentre ;
        double rayon;
        double calculSurface;
        double calculPerimetre;

        Point testpoint = new Point(0.2,0.6);
        Cercle testcercle = new Cercle(10,06);
        calculPerimetre = testcercle.perimetre();
        calculSurface = testcercle.surface();
        testcercle.afficher();
        testcercle.testAppartenance();

    }
}
