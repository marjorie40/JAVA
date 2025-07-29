package training.afpa.CDA24060;
// switch value b in a; c in b; a in c ;
public class exo1_7 {

    int a;
    int b;
    int c;
    int temp;

    public void code() {
        temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.println("La valeur de a est :" + a + "LA valeur de b est : " + b + "La valeur de c est :" + c);

    }
}