package training.afpa.CDA24060.POO;
import java.util.Scanner;

import static java.lang.System.in;

public class Rectangle {

    //attributs
    double longueur;
    double largeur;
    double surface;
    double perimetre;



    //constructeur avec parametre
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    // methode surface
    public double surface() {
        return surface = longueur * largeur;
    }

    // methode perimetre

    public double perimetre() {
        return perimetre = (longueur + largeur) * 2;
    }

    // methode affichage des resultats
    public void afficher() {
        System.out.println("La surface du rectangle est de :" + surface);
        System.out.println("Le perimetre du resctange est de : " + perimetre);
    }


    /*public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLargeur() {
        return largeur;

    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
*/

}