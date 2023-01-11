package d10_12_2023;

public class Kupac {


    private String imeIPrezime;
    private String clanskaKarta;
    private ClanskaKarta brojClanskeKartice;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getClanskaKarta() {
        return clanskaKarta;
    }

    public void setClanskaKarta(String clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }

    public void setBrojClanskeKartice(ClanskaKarta brojClanskeKartice) {
        this.brojClanskeKartice = brojClanskeKartice;
    }

    public Kupac(String imeIPrezime, String clanskaKarta){
        this.imeIPrezime=imeIPrezime;this.clanskaKarta=clanskaKarta;

    }

    public void stampaj(){
        System.out.println("Ime i prezime "+imeIPrezime +"broj kartice"+ brojClanskeKartice.getBrojKartice() );
    }

    public ClanskaKarta getBrojClanskeKartice() {
        return brojClanskeKartice;
    }
}
