package d21_12_2022;
//Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak2 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        ArrayList<Integer>niz = new ArrayList<Integer>();

        System.out.println("Unesite N:");
        int n =s.nextInt();
        int counter = 0;
        for(int i = 0; i<n; i++) {
            System.out.println("Unesite broj:" );
            int broj = s.nextInt();
            niz.add(broj);

            if (broj % 2 == 0) counter = counter + 1;
        }

                System.out.println("U nizu ima " + counter +" parna broja" );
            }
     }




