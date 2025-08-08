package training.afpa.CDA24060.main;

public class Ville {
    private String nom;
    protected int nbHab;

    public Ville() {
        this.nom = "";
        this.nbHab = 0;
    }
    public Ville(String nom, int nbHab) {
        this.nom = (nom);  // = ici parce que pas de setNom dispo donc on prend la valeur nom directement, correct ?
        this.setNbHab(nbHab);
    }
    public String getNom() {
        return nom;
    }
    public int getNbHab() {
        return nbHab;
    }
    public int setNbHab (int nbHab) {
        this.nbHab = nbHab;
    }

    if (nbHab < 0 ) {

        System.out.println("Le nombre d'habitant doit être positif, la modification n'a pas été prise en compte. ");
    }
}
