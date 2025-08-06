package training.afpa.CDA24060.POO;

public class Livre {
    private String titre, auteur ;
    private int nbPages;

    public Livre(String unAuteur,String unTitre,int nbPages) {
        this.auteur = unAuteur;
        this.titre = unTitre;
        this.nbPages = nbPages;
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
    public void setNbPages () {
        this.nbPages = nbPages;
    }

    //ajout modificators pour auteur et titre
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setNbPages (int nbPages) {
        if (nbPages > 0) {
        this.nbPages = nbPages;
    }else {

        }
    }
}
