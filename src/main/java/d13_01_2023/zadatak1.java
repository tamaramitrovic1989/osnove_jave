package d13_01_2023;
//Napisati klasu Student koja ima
// broj indeksa
//        ime i prezime
//        tip studija (osnovne, master, doktorske)
//        niz ispita
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za indeks, ime i prezime, tip studija
//        getter za niz predmeta
//        metodu dodaj ispit u niz ispita
//        metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//        metodu stampaj koja stampa u formatu:
//        (broj indeksa) - (ime i prezime) - (tip studija)
//        Predmeti:
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        (naziv predmeta) - (profesor) - (ocena)
//        Prosecna ocena: (prosecna ocena)
//
//
//        Napisati klasu Ispit koja ima
//        naziv predmeta
//        ocenu (u rasponu od 5 do 10)
//        Ime i prezime profesora koji predaje predmet
//        konstuktore koje mislite da ce vam trebati
//        gettere i settere za sve atribute
//        metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//        metodu koja stampa ispit u formatu:
//        (naziv predmeta) - (profesor) - (ocena)


public class zadatak1 {

    public static void main(String[] args) {



    Student student1=new Student(27727272,"Jovan Jovanovic","master");

    Ispit ispit1=new Ispit("Racunovodstvo", 8,"Svetislav Peric");
    Ispit ispit2=new Ispit("Sociologija", 9,"Zorica Jovanovic");
    Ispit ispit3=new Ispit("Marketing", 6,"Zika Jovic");
    Ispit ispit4=new Ispit("Privredno pravo", 10,"Petar Mikic");
    Ispit ispit5=new Ispit("Ponasanje potrosaca", 5,"Slavica Mikic");

    student1.dodajIspit(ispit2);
    student1.dodajIspit(ispit3);
    student1.dodajIspit(ispit4);
    student1.dodajIspit(ispit5);
    student1.stampaj();
    ispit1.stampaj();
}
}