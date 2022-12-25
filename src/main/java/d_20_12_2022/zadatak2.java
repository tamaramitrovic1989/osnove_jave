package d_20_12_2022;

import java.util.Scanner;

//Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
// sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.
public class zadatak2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String broj = "rimski broj";
        while(!broj.equals ("kraj")) {
            System.out.println("Unesite rimski broj" );
            broj = s.next();
            switch (broj) {
                case "I" -> System.out.println("Arapski: "+ "1");
                case "V" -> System.out.println("Arapski: "+ "5");
                case "X" -> System.out.println("Arapski: "+ "10");
                case "L" -> System.out.println("Arapski: "+ "50");
                case "C" -> System.out.println("Arapski: "+ "100");
                case "D" -> System.out.println("Arapski: "+ "500");
                case "M" -> System.out.println("Arapski: "+ "1000");
                
            }

        }


    }


}
