package d29_12_2022;
//Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost
//        je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//        Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

public class zadatak1 {


    public static void main(String[] args) {

        Proizvod proizvod1=new Proizvod();
        proizvod1.setnaziv("cokolada");
        proizvod1.setCena(100);
        proizvod1.setTezinaUGramima(80);
        Proizvod proizvod2=new Proizvod();
        proizvod2.setnaziv("smoki");
        proizvod2.setCena(65);
        proizvod2.setTezinaUGramima(100);

        proizvod1.stampaj();

        proizvod1.povecajCenu(10);
        System.out.println("uvecana cena je: " + proizvod1.getCena());

        double cenaSaPopustom= proizvod1.vratiCenuSapopustom(20);
        System.out.println("Cena sa popustom je : "+ cenaSaPopustom);

        double postarina1= proizvod1.racunajPostarinu();
        System.out.println("Postarina iznosi : " + postarina1);

        proizvod2.stampaj();
        proizvod2.povecajCenu(20);
        System.out.println("uvecana cena je: " + proizvod2.getCena());

        double cenaSaPopustom2= proizvod2.vratiCenuSapopustom(10);

        double postarina2 = proizvod2.racunajPostarinu();
        System.out.println("Postarina iznosi : " + postarina2);




    }










}
