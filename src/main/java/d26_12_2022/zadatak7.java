package d26_12_2022;
//Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
public class zadatak7 {

    public static void main(String[] args) {


int brojevi=celiBrojevi(-5,1);
        System.out.println(brojevi);

}
    public static int celiBrojevi(int m, int n) {

        if(m>0 && n>0){return n-m-1;}
        else if (m<0 && n>0){return((m*-1)+n)-1;}

        return 0;

    }

}