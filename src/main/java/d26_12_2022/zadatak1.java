package d26_12_2022;
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class zadatak1 {

    public static void main(String[] args) {
        stampajVrednostZa10Vecu(34);
        stampajVrednostZa10Vecu(4);
        stampajVrednostZa10Vecu(8);
    }




    public static void stampajVrednostZa10Vecu(int x) {
    x=x+10;
        System.out.println("Uvecana vrednost je " +x);

    }
}