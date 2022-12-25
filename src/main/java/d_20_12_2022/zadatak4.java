package d_20_12_2022;

import java.util.Scanner;

//Napisati program koji proverava uparenost zagrada.
// Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine
// posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//	Primer izvrsenja:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: )
//	Unos: =
//	Zagrade su uparene
//	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//s
//	Primer izvrsenja 2:
//	Unos: (
//	Unos: 2
//	Unos: *
//	Unos: (
//	Unos: 1
//	Unos: +
//	Unos: 3
//	Unos: )
//	Unos: =
//	Zagrade nisu uparene
//	(Objasnjenje: fali poslednja zagrada iz formule)
public class zadatak4 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String z =s.next();


  while (!(z.equals("="))) {System.out.println("Unos: ");
       z =s.next();
   int counter1 =0;
   int counter2 =0;
    if(z.equals("("))
        counter1= counter1 + 1;

    else if (z.equals(")"))
      counter2= counter2 + 1;

    if (counter1==counter2)
        System.out.println("Zagrade su uparene");
    else System.out.println("Zagrade nisu uparene");
    }
    }

}
