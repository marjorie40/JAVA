package training.afpa.CDA24060.main;

import training.afpa.CDA24060.POO.VoitureJava;
import training.afpa.CDA24060.algo.Exo8_MMAU;

import java.util.Scanner;

public class Execution {  // comment pointer sur l'objet VoitureJava sans que ca recupere des methodes de classes comme Rectangle ?
    static void VoitureJava() {
        System.out.println();
    }

    public static void main(String[] args) {
        String marque;
        Double prix;
        String test;

        //TODO Auto-genrated method stub

        // interaction avec l'utilisateur
        Scanner scanner = new Scanner(System.in);
        marque = scanner.nextLine();
        prix = scanner.nextDouble();

        // création de l'instance voiture
        VoitureJava voiture = new VoitureJava(marque, prix);

        System.out.println(voiture.getMarque());
        // appel d'une fonction avec resultat
        test = voiture.getMarque();
        // appel d'une procédure sans résultat
        voiture.setMarque("test");

        // rendu à l'utilisateur
        voiture.afficher();
    }
}

//Execution voitureJava = new Execution();
//execution.voitureJava (getMarque,getPrix);
// private void start ();