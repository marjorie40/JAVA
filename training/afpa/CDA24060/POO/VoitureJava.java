package training.afpa.CDA24060.POO;

public class VoitureJava {
    String marque;
    Double prix;

    // creation GETTER et SETTER
    public String getMarque(){
        return marque;
    }
    public void setMarque () {
        this.marque = "";
    }

    public Double getPrix () {
        return prix;
    }
    public void setPrix (){
        this.prix = 0.0;
    }

    //constructeur par defaut

    public VoitureJava() {




        // afficher les resultats
        public void afficher() {

            System.out.println("La marque de la voiture Java est  : " + getMarque + ". Le prix de cette voiture Java est de : " + getPrix);
        }
    }
}
