package d21_12_2022;
//Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
// stampa sve elemente niza koji su veci od nule.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: -4
//Unesite broj: 3
//Unesite broj: -7
//Unesite broj: 9
//Brojevi veci od nule u nizu A su: 1, 3, 9,

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizA = new ArrayList<Integer>();
        ArrayList<Integer> nizB = new ArrayList<Integer>();
        int broj =0;
        System.out.println("Unesite N:" );
        int n = s.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Unesite broj: " );
            broj = s.nextInt();
            nizA.add(broj);
            if (broj >0) nizB.add(broj);
            System.out.print("Brojevi veci od nule u nizu A su:");
        }
        for (i = 0; i < nizB.size() ; i++){

                System.out.print( nizB.get(i) + "," );
        }
    }
}
