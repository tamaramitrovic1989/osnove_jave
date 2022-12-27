package d26_12_2022;
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
// vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62
public class zadatak3 {

    public static void main(String[] args) {
        int a= noviBroj(6,8);

        System.out.println(a);
    }


    public static int noviBroj(int x,int y) {
    int z= x*10+y;
    return z;
    }
}