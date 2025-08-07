package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.Personne;

import java.util.Scanner;

public class TestHeritage {

    public static void main(String[] args) {

        String nom;
        String adresse;
        String setNom = "";
        String setAdresse = "";
        // String varPersonne = setNom + setAdresse ; contournement pour toString - inefficace


                    //Vue
        Scanner sc = new Scanner(System.in);

        Personne personne = new Personne();
        System.out.println("Veuillez entrer votre nom" + setNom );
        setNom = sc.nextLine();
        System.out.println("Veuillez entrer votre adresss " + setAdresse);
        setAdresse = sc.nextLine();

        //affichage

        System.out.println(personne.toString());  //inefficace





    }

}
