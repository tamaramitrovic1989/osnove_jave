package d26_12_2022;
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
public class zadatak5 {

    public static void main(String[] args) {

        karakterZaStampu(4);

    }


    public static void karakterZaStampu(int n) {
        for(int i=0; i<n; i++){

        System.out.print("/  ");}

    }


}