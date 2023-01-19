package d16_01_2023;

public class Trener extends Osoba {

    private int godineIskustva;

    private String tipTrenera;



    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public void stampaj() {
       System.out.println("Ime i prezime: "+ imeIPrezime+", "+"JMBG"+jmbg+", "+ "Godina rodjenja :"+godinaRodjenja);
        System.out.println(tipTrenera + " trener" + ", " + "godine iskustva: " + godineIskustva);


    }
}