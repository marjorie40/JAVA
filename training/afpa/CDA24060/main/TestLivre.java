package training.afpa.CDA24060.main;


import training.afpa.CDA24060.POO.Livre;

import java.util.Scanner;

public class TestLivre {

    public static void main(String[] args) {
        String titre ="";
        String auteur = "";  //  ? pas de private, public ou protected ?
        int nbPages;
        int modifPages;
        int sommePages;

        Scanner sc=new Scanner(System.in);  // ? place de la commande scanner est-elle adequate ?

        Livre testLivre1 = new Livre();
        Livre testLivre3 = new Livre(null,null,300);
        Livre testLivre2 = new Livre(null,null,0);

        testLivre1.setTitre("1 jour mon prince viendra");
        testLivre2.setTitre("2mander");
        testLivre1.setAuteur("Blanche Neige");
        testLivre2.setAuteur("Ask Ing");
        testLivre1.setNbPages(200);
        testLivre2.setNbPages(10);

        //affichage des titres, auteurs, nombre de pages avec getter-setter

        System.out.println(testLivre1.getTitre());
        System.out.println(testLivre2.getTitre());
        System.out.println(testLivre1.getAuteur());
        //System.out.println(testLivre1);  ? commande pour recuperer l'adresse emplacement dans la memoire
        System.out.println(testLivre1.getNbPages());
        System.out.println(testLivre2.getNbPages());
        /*System.out.println("La somme des nombres de pages des 2 livres est de : "
                + testLivre1.getNbPages() + testLivre2.getNbPages()); // concatenation
         */
        sommePages=testLivre1.getNbPages() +testLivre2.getNbPages();
        System.out.println(sommePages);


        System.out.println("Veuillez entrer le nombre de page de votre livre.");
        modifPages= sc.nextInt();
        testLivre1.modificateurPages(modifPages);

        //exo3
        //System.out.println(testLivre3.getNbPages());
    }
}
