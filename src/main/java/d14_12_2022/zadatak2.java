package d14_12_2022;

import java.util.Scanner;

//Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//b=1, vrednost promenljive a se uvecava za 10
//b=2, vrednost promenljive a se smanjuje za 20
//Na kraju zadatka odstampati novu vrednost promenljive a.
//	Primer izvrsenja:
//	Unesite a: 44
//	Unesite b: 2
//	Nova vrednost za a je 24
public class zadatak2 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: " );
        int a = s.nextInt();
        System.out.println("Unesite b: " );
        int b = s.nextInt();
 int b1 = a + 10;
 int b2 = a - 20;

        if ( b==1 ) {System.out.print("Nova vrednost za a je " +  b1
            );
        }
         else if  ( b==2 ) {System.out.print("Nova vrednost za a je " + b2 )
            ;
}
        }

}