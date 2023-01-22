package d_19_01_2023;

public abstract class Ambalaza {

    protected String barKod;
    protected String nazivArtikla;
    protected double netoTezina;
    protected double brutoTezina;

    public Ambalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barKod = barKod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }


    public Ambalaza() {

    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.



    public double tezinaPakovanja(){
        double tezina=0;
         tezina=this.brutoTezina-this.netoTezina;
        return  tezina;
        //        abstraktnu metodu koja vraca cenu artikla
    }
        public abstract double cenaArtikla();

    //        abstraktnu metodu stampaj

    public abstract void stampaj();
}
