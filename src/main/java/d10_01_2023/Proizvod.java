package d10_01_2023;

public class Proizvod {

    private String nazivProizvoda;

    private int cenaIzradeProizvoda;


    private Kupac kupacInfo;




    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public Kupac getKupacInfo() {
        return kupacInfo;
    }

    public void setKupacInfo(Kupac kupacInfo) {
        this.kupacInfo = kupacInfo;
    }

    public int getCenaIzradeProizvoda() {
        return cenaIzradeProizvoda;
    }

    public void setCenaIzradeProizvoda(int cenaIzradeProizvoda) {
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public Proizvod(String nazivProizvoda, int cenaIzradeProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaIzradeProizvoda = cenaIzradeProizvoda;
    }

    public double racunanjeCeneProizvoda(){

        return this.cenaIzradeProizvoda*1.9*(100-(kupacInfo.getKarticaInfo().getPopust()))/100;

    }

    public void stampaj(){
        System.out.println(nazivProizvoda +" " + this.racunanjeCeneProizvoda());
        System.out.println(this.kupacInfo.getImeIPrezime() +"  "+ this.kupacInfo.getKarticaInfo()) ;


    }


}
