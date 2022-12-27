package d26_12_2022;
//Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
// Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string
// tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”
public class zadatak2 {

    public static void main(String[] args) {

        String punoime=imeIPrezime("Tamara", "Mitrovic");

        System.out.println(punoime);

    }

    public static String imeIPrezime(String ime, String prezime) {
        String PunoIme = ime + " " + prezime;
        return PunoIme;

    }
}