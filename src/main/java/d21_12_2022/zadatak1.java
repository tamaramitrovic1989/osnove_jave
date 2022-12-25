package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

//Zadatak
//Napisati program koji u sebi ima definisan niz od 10 brojeva (brojevi su proizvoljni)
// i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
public class zadatak1 {

 public static void main(String[] args) {

      ArrayList<Integer>niz= new ArrayList<Integer>();

       niz.add(5);
       niz.add(3);
       niz.add(7);
       niz.add(15);
       niz.add(20);
       niz.add(8);
       niz.add(34);
       niz.add(27);
       niz.add(9);
       niz.add(4);

       Scanner s=new Scanner(System.in);
  System.out.println("Unesite poziciju od 0 do 9: ");
  int k= s.nextInt();
  System.out.println("Unesite novu vrednost: ");
  int v = s.nextInt();
  niz.set(k,v);

 }
}
