package d26_12_2022;
////Napisati metodu koja stampa podatke o korisniku u formatu:
////JMBG: [jmbg]
////Ime: [ime]
////Prezime: [prezime]
////God. rodjenja: [god]
////Aktivan: [true/false]
////Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//// Metoda nista ne vraca.
public class zadatak4 {

    public static void main(String[] args) {

        stampaPodataka("1710989735110", "Tamara","Mitrovic",1989,true);

            }
    public static void stampaPodataka(String jmbg, String ime,String prezime, int godinaRodjenja, boolean aktivanIliNe) {

        System.out.println("JMBG: "+ jmbg);
        System.out.println("Ime: "+ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("aktivan: " + aktivanIliNe);


    }



}
