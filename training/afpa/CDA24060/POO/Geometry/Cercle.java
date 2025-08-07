package training.afpa.CDA24060.POO.Geometry;

public class Cercle {
    double PI =3.14;
    double pointCentre ;
    double rayon ;
    double calculSurface;
    double calculPerimetre;
    double abscisse;
    double ordonnee;

    public Cercle(double rayon, double pointCentre) {  // peut-on désigner pointCentre = objet Point ??
        this.rayon = rayon;
        this.pointCentre = pointCentre;
    }

    public double perimetre() {
        calculPerimetre = 2 * PI * rayon;
        return calculPerimetre;
    }
    public double surface(){
        calculSurface = PI * rayon * rayon;
        return calculSurface;
    }
    public void testAppartenance (){
        do {
            abscisse = 2.0 * Math.random() -1.0;
            ordonnee = 2.0 * Math.random() - 1.0;
        } while (Math.sqrt(abscisse * abscisse + ordonnee * ordonnee) > 1.0);

    }
    public void afficher() {
        System.out.println("La surface du cercle est de : " +calculSurface);
        System.out.println("Le périmètre du cercle est de : " +calculPerimetre);
        // Quoi afficher pour testAppartenance ?

    }

}