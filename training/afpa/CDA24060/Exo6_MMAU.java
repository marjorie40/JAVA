package training.afpa.CDA24060;

public class Exo6_MMAU {

    /* Créer une matrice tableau 2 lignes (indice, factorielle) */

    int tabEnt[] = new int[10];  // est ce OK de combiner déclaration, et activation du tableau + déclaration de la taille

    public int tab_factorielle () {

        /* Fonction calcul de la factorielle*/
        int resultat = 1;

        for (i=1 ;i< tabEnt.length-1 ;i++) {
            resultat = resultat * i;
        }
        return resultat;
    }

    /* créer tableau matrice et déclaration des variables*/
    int tabEnt2 [];

    int tabEnt [] = new int[10];
    int tabEnt2 [] = new int [2];
    int i ;// indice tableau;
    int TabRempli[];

    int x; // valeur dans tableau

    for (i =0 ; i < tabEnt.length-1 ; i++) {
        int TabRempli [0][i] = i+1;
    }

}
