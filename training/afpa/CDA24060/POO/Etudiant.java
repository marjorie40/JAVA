package training.afpa.CDA24060.POO;

public class Etudiant extends Personne {
    String programme;
    int annee;
    double frais;


    public Etudiant (String nom, String adresse, String programme, int annee, double frais) {
        super(nom,adresse);
        this.programme = programme;
        this.annee = annee;
        this.frais = frais;
    }
    public Etudiant() {
        this.setProgramme (programme);
        this.setAnnee (annee);
        this.setFrais(frais);
    }
    public String getProgramme() {
        return programme;
    }
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public double getFrais() {
        return frais;
    }
    public void setFrais(double frais) {
        this.frais = frais;
    }
}
