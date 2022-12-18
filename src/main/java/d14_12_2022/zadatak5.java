package d14_12_2022;

import java.util.Scanner;

public class zadatak5 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: " );
        int a = s.nextInt();
        System.out.println("Unesite b: " );
        int b = s.nextInt();

        System.out.println("Unesite operator: " );
        String operator = s.next();

        if (operator.equals("+" ))
        {System.out.println("rezultat: " + (a + b));}
        else if (operator .equals("-")) {System.out.println("rezultat : " + (a-b));}
        else if   (operator .equals("*")) {System.out.println("rezultat : " + (a*b));}
        else if   (operator .equals("/")) {System.out.println("rezultat : " + a/b);}

    }

}

