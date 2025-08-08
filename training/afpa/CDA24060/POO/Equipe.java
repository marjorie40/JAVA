package training.afpa.CDA24060.POO;

public class Equipe extends Personne {

    private String ecole;
    private double paye;

    public Equipe(String nom, String adresse, String ecole, double paye) {
        super(nom, adresse);
        this.ecole = ecole;
        this.paye = paye;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
    public void setPaye(double paye) {
        this.paye = paye;
    }
    public String getEcole() {
        return ecole;
    }
    public double getPaye() {
        return paye;
    }
    @Override
    public String toString() {
        getNom();
        getAdresse();
        getEcole();
        getPaye();
        return super.toString();
    }

}
