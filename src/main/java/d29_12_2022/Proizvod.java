package d29_12_2022;
//Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je
//        cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je
//        parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih
//        funkcija.

public class Proizvod {

    private String naziv;
    private double cena;
    private double tezinaUGramima;


    public void stampaj() {
        System.out.println("Naziv proizvoda je: " + this.naziv + "," + " cena prozvoda je : " + this.cena + "," +
                " tezina proizvoda je: " + this.tezinaUGramima);

    }

    public void setnaziv(String nazivP) {
        this.naziv = nazivP;
    }

    public void setCena(double cenaP) {
        this.cena = cenaP;
    }
    public double getCena(){
      return this.cena;
    }

    public void setTezinaUGramima(double tezinaP) {
        this.tezinaUGramima = tezinaP;
    }

    public void povecajCenu(double x) {
        this.cena = this.cena + x;
    }

    public double vratiCenuSapopustom(double popust) {
        double cenaSPopustom = cena - (cena * popust / 100);
        return cenaSPopustom;
    }
    public double racunajPostarinu() {
        double postarina;
        if (this.tezinaUGramima < 100) {
            postarina = 200;
        } else if (this.tezinaUGramima >= 101 && this.tezinaUGramima < 500) {
            postarina = 400;
        } else {
            postarina = 1000;
        }

    return postarina;


    }





}
