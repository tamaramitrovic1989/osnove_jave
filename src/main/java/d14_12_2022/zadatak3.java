package d14_12_2022;


import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x za T1" );
        int xT1 = s.nextInt();
        System.out.println("Unesite y za T1 " );
        int yT1 = s.nextInt();
        System.out.println("Unesite x za T2" );
        int xT2 = s.nextInt();
        System.out.println("Unesite y za T2" );
        int yT2 = s.nextInt();
        System.out.println("Unesite x za M" );
        int xM = s.nextInt();
        System.out.println("Unesite y za M" );
        int yM = s.nextInt();

        if ( xT1 < xM && xM < xT2 ) {

            System.out.print("Kliknuto je unutar forme"
            );
        }
        else { System.out.print("Nije kliknuto unutar forme"
        );

}




    }





}

