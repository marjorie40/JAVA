package training.afpa.CDA24060;

import java.util.Scanner;


// calculer avec une fonction la puissance d'un nombre saisi X à la puissance saisie Y

public class exo4_MMAU {
    public class puissance {   // suggere -static- pourquoi ?

        public static int calculPuissance (int x, int y) { // bonne syntaxe pour créer une fonction ?
            int resultat = 1 ;
            int reiteration = 1;

            while (reiteration <= y) {
                resultat = resultat * x;
                reiteration ++;
                return resultat;
            }

            Scanner in = new Scanner (System.in);   // ou placer ces instruction (avant ou apres la fonction ?
            System.out.println("Veuillez saisir un nombre x. ");
            x=in.nextInt();
            System.out.println("Veuillez saisir la puissance y. ");
            y=in.nextInt();

            if (y == 0) {
                System.out.println("Le résultat est 1.");
            } else {
                if (x == 0) {;
                System.out.println("Le résultat est 0");
            } else {
                    calculPuissance(x, y); // retourne le resultat dans la fonction donc a ce stade resultat = return de calculPuissance, correct ?
                    System.out.println("Le résultat est : " + resultat);
                }
            }
            return resultat;  // IDE suggere un return ici
        }
    }
}
