package training.afpa.CDA24060.POO;

public class Livre {
    private String titre, auteur ;
    private int nbPages;
    int modifPages;
    String ouvrage;

    public Livre() {
        this.auteur = getAuteur();
        this.titre = getTitre();
        this.nbPages = getNbPages();
    }

    public Livre(String setAuteur, String setTitre, int setNbPages) {
    }

    public String getAuteur() {
        return auteur;
    }
    // ajout accessors pour titre et nbPages
    public String getTitre() {
        return titre;
    }
    public int getNbPages() {
        return nbPages;
    }
    public void setNbPages (int nbPages) {
        this.nbPages = nbPages;
    }

    //ajout modificators pour auteur et titre
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void modificateurPages (int modifPages) {
        if (modifPages > 0) {
        this.modifPages = nbPages;  // pas possible setNbPages ici ou faire if setNbPages>0 ??
            System.out.println("Ce livre a " + modifPages + " pages.");
    }else {
            if (modifPages <= 0) {
                System.out.println("ERREUR ! Veuillez réinsérer un nombre de page cohérent.");
            }
        }
    }
    public void afficheToi (){
        //System.out.println("Voici le descriptif du livre : " + new Livre(this.auteur,this.titre,this.nbPages);
    }
}



