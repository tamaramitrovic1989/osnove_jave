package d12_01_2023;

public class Racun {

    private String brojRacuna;
    private String imeiPrezime;

    private double stanjeNaRacunu;


    public Racun(String brojRacuna, String imeiPrezime, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeiPrezime = imeiPrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeiPrezime() {
        return imeiPrezime;
    }

    public void setImeiPrezime(String imeiPrezime) {
        this.imeiPrezime = imeiPrezime;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }


        public void menjajStanje(double promena){

                this.stanjeNaRacunu=this.stanjeNaRacunu+promena;


        }

       public void stampaj(){
           System.out.println(
                   this.imeiPrezime + this.brojRacuna);
           System.out.println("stanje na racunu je: "+ this.stanjeNaRacunu);
}

}
