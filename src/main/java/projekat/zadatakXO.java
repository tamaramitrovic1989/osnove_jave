package projekat;

import java.util.Scanner;

public class zadatakXO {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        XOTabla igra1 = new XOTabla();
        System.out.print("Unesite ime igraca X: ");
        String x = s.next();
        igra1.setImeiPrezimeXIgraca(x);
        System.out.print("Unesite ime igraca O: ");
        String o = s.next();
        igra1.setImeiPrezimeOIgraca(o);

        igra1.pokreniIgru();


        while (!(igra1.pobednikX() && igra1.pobednik0() && igra1.popunjenaTabla())) {

            igra1.stampaj();
            System.out.println("Na potezu je igrac: " + igra1.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int potez = s.nextInt();

            if ((igra1.poljePrazno(potez))) {
                igra1.odigrajPotez(potez);
                igra1.zameniIgraca();
            } else {
                System.out.println("Potez nije validan");
            }

            if (igra1.pobednikX()) {
                System.out.println("Cestitamo! Pobedio je igrac X");
            } else if (igra1.pobednik0()) {
                System.out.println("Cestitamo! Pobedio je igrac O");

            }

            System.out.println("Igra je neresena.");
        }

    }


}
