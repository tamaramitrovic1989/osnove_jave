package d10_12_2023;

public class Proizvod {

    private String nazivProizvoda;
    private String kupac;
    private int cenaIzradeProizvoda;
    private ClanskaKarta popustClanskaKarta;

    private Kupac imeIPrezimeKupca;
    private ClanskaKarta brojClanskeKartice;


    public ClanskaKarta getPopustClanskaKarta() {
        return popustClanskaKarta;
    }

    public void setPopustClanskaKarta(ClanskaKarta popustClanskaKarta) {
        this.popustClanskaKarta = popustClanskaKarta;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzradeProizvoda() {
        return cenaIzradeProizvoda;
    }

    public void setCenaIzradeProizvoda(int cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public Proizvod(String nazivProizvoda,String kupac, int cenaIzradeProizvoda){
        this.nazivProizvoda=nazivProizvoda;this.kupac=kupac;this.cenaIzradeProizvoda=cenaIzradeProizvoda;
    }

    public double racunanjeCeneProizvoda(){

        return this.cenaIzradeProizvoda*1.9*(100-popustClanskaKarta.getPopust())/100;

    }

    public void stampaj(){
        System.out.println(nazivProizvoda +" " + this.racunanjeCeneProizvoda());
        System.out.println(this.imeIPrezimeKupca.getImeIPrezime() +"  "+ this.brojClanskeKartice.getBrojKartice()) ;


    }


}
