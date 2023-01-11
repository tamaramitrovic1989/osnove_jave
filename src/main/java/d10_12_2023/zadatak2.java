package d10_12_2023;
//Kreirati klasu Proizvod koja ima
//        Naziv proizvoda
//        kupca/musteriju
//        cenu izrade proizvoda
//        gettere i settere
//        konstruktore
//        Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//        Metodu za stampanje proizvoda u formatu:
//        naziv proizvoda - cena
//        ime i prezime - broj kartice
//
//        Kreirati klasu Kupac koja ima:
//        ime i prezime
//        clansku kartu
//        gettere i settere, clanska karta ne moze da se menja
//        konstruktore
//        metodu stampaj koja stampa u formatu
//        ime i prezime - broj kartice
//
//        Kreirati klasu ClanskaKarta koja ima:
//        popust (u rasponu od 5 do 10 %)
//        broj kartice (npr: 9329-0239)
//        gettere i setter
//        konstuktore


public class zadatak2 {


    public static void main(String[] args) {

        Proizvod proizvod1=new Proizvod("sat","Tamara", 10000);

        Proizvod proizvod2=new Proizvod("vrata","Jelena", 20000);

        ClanskaKarta clanskaKarta1= new ClanskaKarta(10,14145);

        ClanskaKarta clanskaKarta2= new ClanskaKarta(15,15737);

        Kupac kupac1=new Kupac("Tamara Mitrovic","14554");

        Kupac kupac2=new Kupac("Jovana Jovanovic","16356");

        kupac1.setBrojClanskeKartice(clanskaKarta1);
        kupac1.stampaj();





    }



}
