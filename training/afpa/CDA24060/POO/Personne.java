package training.afpa.CDA24060.POO;

public class Personne {
    protected String nom;  //protected est ce OK : pour que Etudiant et Equipe accès a ces attributs communs
    protected String adresse;


    public Personne () { // n'accepte pas setNom et setAdresse (already define in Personne)
        this.setNom (nom);
        this.setAdresse (adresse);
    }
    public Personne (String setNom,  String setAdresse) {
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String afficherNom() {
        return this.getNom();
    }
    public String afficherAdresse() {
        return this.getAdresse();
    }
}
