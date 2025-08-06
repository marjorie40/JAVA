package training.afpa.CDA24060.POO;

import java.util.Scanner;

public class VoitureJava {
    private String marque;
    private Double prix;

    // creation GETTER et SETTER
    public String getMarque(){
        return marque;
    }
    public void setMarque(String marque) {  //set en public ou private ?
        this.marque = marque ;
    }

    public Double getPrix () {
        return prix;
    }
    public void setPrix (double prix) {
        this.prix = prix;
    }

    //constructeur par defaut
    public VoitureJava(String marque, Double prix) {
        this.setMarque(marque); // s'integre directement dans le setMarque ???? ou besoin d'une formule magique?
        this.prix=prix; // idem setPrix ??
    }

    // afficher les resultats
    public void afficher() {
        //VoitureJava voiture = new VoitureJava(getMarque(this.marque),getPrix(this.prix));

        System.out.println("La marque de la voiture Java est  : " + this.getMarque() + "." +
                " Le prix de cette voiture Java est de : " + this.getPrix() );
    }
}
