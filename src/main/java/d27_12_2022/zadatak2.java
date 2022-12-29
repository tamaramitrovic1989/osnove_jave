package d27_12_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//        za svaki od njih pozvati metode


public class zadatak2 {

    public static void main(String[] args) {


        SmartAirConditioning klima1= new SmartAirConditioning();

        klima1.markaKlime= "Gree";
        klima1.izabranaTemperatura=23;
        klima1.mode="hladi";


        SmartAirConditioning klima2= new SmartAirConditioning();

        klima2.markaKlime= "Samsung";
        klima2.izabranaTemperatura=21;
        klima2.mode="hladi";


        System.out.println(klima1.markaKlime+ (", " ) + klima1.izabranaTemperatura +(", " ) +  klima1.mode);



        System.out.println("Temperatura napolju je veca od temperature napolju: " + klima2.merenjeTemperature(26) );





    }
}
