package training.afpa.CDA24060;

// resolution de l'equation du second degre ax² + bx + c = 0

import java.util.Scanner;

public class Exo3_MMAU {

     public void equation () {

        int a , b, c ;
        float delta ;
        float resultat ;
        double x1;
        double x2;

        Scanner in = new Scanner (System.in);
        System.out.println("Veuillez saisir la valeur de a : ");
        a = in.nextInt();
        System.out.println("Veuillez saisir la valeur de b : ");
        b = in.nextInt();
        System.out.println("Veuillez saisir la valeur de c : ");
        c = in.nextInt();

        delta = (b*b) - (4*a*c);

        if (delta == 0)  {
            System.out.println("Il n'y a pas de solution pour cette équation") ;
        } else {
            if (delta==0) {
                resultat = (float) -b /(2*a); // forcer float
                System.out.println("Il y a une solution à la double équation : " + resultat);
            } else {
                System.out.println("Il y a 2 solutions à cette équation : ");
                System.out.println("x1 = -b + (racine delta / 2*a)");  // doit on créer une fonction racine ou est ce que -math.sqrt (delta)- est un terme adéquat ?
                System.out.println("x2 = -b - (racine delta / 2*a)");
                x1 = - b + (Math.sqrt (delta)/2*a);
                x2 = -b - (Math.sqrt (delta)/2*a);
                System.out.println("x1 = " + x1 + "et  x2 = " + x2);
            }

        }
    }
}
