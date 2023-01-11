package d10_12_2023;
//Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

public class zadatak1 {

    public static void main(String[] args) {

        Knjiga knjiga1= new Knjiga(1211313,"Deca zla", 2014,"Miodrag Majic");
        Knjiga knjiga2= new Knjiga(1847476,"uznemireni ljudi", 2018,"Fredrik Bakman");
        Knjiga knjiga3= new Knjiga(3363763,"covek po po imenu Uve", 2017,"Fredrik Bakman");
        Knjiga knjiga4= new Knjiga(3982726,"moja genijalna prijateljica", 2020,"Elena Ferante");
        Knjiga knjiga5= new Knjiga(1478319,"ostrvo", 1989,"Mesa Selimovic");

        Autor autor1=new Autor("Jovan","Ducic");
        Autor autor2=new Autor("Miodrag" , "Majic" );

        knjiga1.setPodaciAutora(autor2);
        knjiga1.print();
    }


}

