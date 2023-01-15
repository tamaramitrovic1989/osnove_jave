package d10_01_2023;
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

        Knjiga knjiga1= new Knjiga(1211313,"Deca zla", 2014);
        Knjiga knjiga2= new Knjiga(1847476,"uznemireni ljudi", 2018);
        Knjiga knjiga3= new Knjiga(3363763,"blago cara Radovana", 2017);
        Knjiga knjiga4= new Knjiga(1478319,"ostrvo", 1989);

        Autor autor1=new Autor("Jovan","Ducic");
        Autor autor2=new Autor("Miodrag" , "Majic" );
        Autor autor3=new Autor("Mesa" , "Selimovic" );
        Autor autor4=new Autor("Fredrik" , "Bakman" );

        knjiga1.setPodaciAutora(autor2);
        knjiga2.setPodaciAutora(autor4);
        knjiga3.setPodaciAutora(autor1);
        knjiga4.setPodaciAutora(autor3);

        knjiga1.print();
        knjiga2.print();
        knjiga3.print();
        knjiga4.print();


    }


}

