package d19_12_2022;

import java.util.Scanner;

//Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265
public class zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;
        for (int i = 0; i <n; i++) {
            System.out.println("Unesite broj: " );
            int broj = s.nextInt();
            if( 99< broj  && 999> broj) {
                suma = suma + broj;
            }
        }
        System.out.println("Suma je: " + suma );
    }

}