package d10_01_2023;
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


        Kupac prviKupac = new Kupac("Tamara Mitrovic");
        Kupac drugiKupac = new Kupac("Jovana Jovanovic");

        Proizvod prviProizvod = new Proizvod("televizor", 100000);
        Proizvod drugiProizvod = new Proizvod("sto", 15000);
        Proizvod treciProizvod = new Proizvod("stolica", 3000);
        Proizvod cetvrtiProizvod = new Proizvod("sat", 3500);

        ClanskaKarta jednaKartica = new ClanskaKarta(10, "4325-845");
        ClanskaKarta drugaKartica = new ClanskaKarta(5, "59228-083");

        prviProizvod.setKupacInfo(prviKupac);
        prviKupac.setKarticaInfo(jednaKartica);
        drugiKupac.setKarticaInfo(drugaKartica);
        double izracunataCena = prviProizvod.racunanjeCeneProizvoda();
        System.out.println("Cena za ovaj proizvod sa vasom karticom je: " + izracunataCena + "Dinara");
        prviProizvod.stampaj();

        prviProizvod.setKupacInfo(drugiKupac);
        prviProizvod.stampaj();

        drugiProizvod.setKupacInfo(drugiKupac);
        double cenaSaPopustom = drugiProizvod.racunanjeCeneProizvoda();
        System.out.println("Cena za ovaj proizvod sa vasom karticom je: " + cenaSaPopustom);
        drugiProizvod.stampaj();

    }
}