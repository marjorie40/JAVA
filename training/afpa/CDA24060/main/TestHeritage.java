package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.Equipe;
import training.afpa.CDA24060.POO.Etudiant;
import training.afpa.CDA24060.POO.Personne;



import java.util.Scanner;

/* REVOIR LE .toString*/

public class TestHeritage {

    public static void main(String[] args) {

        String nom;
        String adresse;
        String setNom = "";
        String setAdresse = "";
        String getNom = "";
        String getAdresse = "";
        String getEcole = "";
        double getPaye = 0.0;
        // String varPersonne = setNom + setAdresse ; contournement pour toString - inefficace


                    //Vue
        Scanner sc = new Scanner(System.in);

        Personne personne = new Personne(setNom,setAdresse);
        System.out.println("Veuillez entrer votre nom" + setNom );
        setNom = sc.nextLine();
        System.out.println("Veuillez entrer votre adresss " + setAdresse);
        setAdresse = sc.nextLine();

        Etudiant etudiant = new Etudiant();
        System.out.println(etudiant.toString()); // retourne l'adresse emplacement etudiant

        Equipe equipe = new Equipe(getNom,getAdresse,getEcole,getPaye);
        System.out.println(equipe.toString()); // retourne l'adresse emplacement Equipe

        //affichage

        System.out.println(personne.toString()); // retourne l'adresse emplacement personne

    }

}
