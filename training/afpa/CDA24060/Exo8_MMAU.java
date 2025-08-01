package training.afpa.CDA24060;


import java.util.Scanner;


// remplir un tableau et calculer la moyenne

public class Exo8_MMAU {

    public double calculMoyenne () {
        int somme;
        double moyenne;
        int lenght;
        int tab[];
        int i ; // déclaration de l'indice
        int valeurSaisie; // entrée par l'utilisateur
        int x; // entiers du tableau implémentés par l'utilisateur

        // méthode calcul de moyenne
        {
            somme = 0;

            Scanner in = new Scanner(System.in);
            System.out.println("Veuillez saisir le nombre d'entier que vous souhaitez insérer dans ce tableau. ");
            valeurSaisie = in.nextInt();

            lenght = valeurSaisie;

            tab = new int[valeurSaisie];

            for (i = 0; i < lenght - 1; i++) {

                somme = somme + tab[i];
            }
            moyenne = (double) somme / lenght;

            return moyenne;
        }

        // Début

        for  (valeurSaisie = lenght){  // n'accepte pas de déclaration de variable .... est déjà présent Ligne 29

            do {
                Scanner in = new Scanner(System.in);
                System.out.println("Saisissez les " + valeurSaisie + "notes pour calculer la moyenne.");
                tab[i++] = in.nextInt();
            } while (i < lenght - 1); // saisir et afficher les valeurs du tab[], correct ?

            calculMoyenne();  // comment appeler une methode. quel nom correct ?
            System.out.println("La moyenne de ces " + valeurSaisie + " valeurs dans le tableau est de : " + moyenne); // appeler la fonction et afficher la moyenne, correct ?

        }
    }
}
