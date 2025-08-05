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
    Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    //Scanner scanner = new Scanner(in);
    //System.out.println("Saisissez la longueur du rectangle. ");
    //longueur = scanner.nextDouble();
    //System.out.println("Saisissez la largeur du rectangle. ");
    //largeur=scanner.nextDouble();

    // methode surface
    double surface() {
        return surface = longueur * largeur;
    }

    // methode perimetre

    double perimetre() {
        return perimetre = (longueur + largeur) * 2;
    }

    // methode affichage des resultats
    System.out.println("La surface du rectangle est de :"+surface);
    System.out.println("Le perimetre du resctange est de : "+perimetre);
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

