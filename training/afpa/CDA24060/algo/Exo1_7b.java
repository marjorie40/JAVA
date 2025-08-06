package training.afpa.CDA24060.algo;

public class Exo1_7b {

    // Declaration de variables
    int a = 5;
    int b = 3;
    int c = 7;
    int temp = 0;
    int valeur;

    public void valeur() {
        temp =  c;
         c =  b;
         b =  a;
         a = temp;

        System.out.println("La valeur de a est :" + a + "LA valeur de b est : " + b + "La valeur de c est :" + c);
    }
}
