package training.afpa.CDA24060.POO;

public class Personne {
    private String nom;
    private String adresse;

    public Personne(String nom, String adresse) { // n'accepte pas setNom et setAdresse (already define in Personne)
        this.nom = setNom;
        this.adresse = setAdresse;

    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    private String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public Personne (String setNom,  String setAdresse) {
        this.nom = getNom();
        this.adresse = getAdresse();
    }
    public String getNom () {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }


        // constructeur
        Personne personne = new Personne("Jocelyne", "rue de la joie");


    }
}
