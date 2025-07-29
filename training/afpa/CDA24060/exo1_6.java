package training.afpa.CDA24060;
// switch values a and b
public class exo1_6 {

    // declaration des variables
    int a = 5;
    int b = 9;
    int temp = 0;

    public void code() {
        temp = a;
        a = b;
        b = temp;

        System.out.println ("la valeur de a est :" + a + "La valeur de b est : " + b );
    }

}