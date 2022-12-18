package d14_12_2022;
//Napisati program koji ima informacije koje ucitava informacije sa tastature:
//Ime
//Prezime
//godinu rodjenja
//I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
//
//Primer izvrsenja:
//Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//Milan Jovanovic - 26 god

import java.util.Scanner;



public class zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ime: " );
        String ime = s.next();
        System.out.println("Prezime: " );
        String prezime = s.next();
        System.out.println("Godina rodjenja: " );
        int godinaRodjenja = s.nextInt();
        int godine = 2022 - godinaRodjenja;


        System.out.println(ime + " " + prezime + " - " + godine);

    }
}
















