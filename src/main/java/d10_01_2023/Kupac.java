package d10_01_2023;

public class Kupac {


    private String imeIPrezime;
    private  ClanskaKarta karticaInfo;


    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getKarticaInfo() {
        return karticaInfo;
    }

    public void setKarticaInfo(ClanskaKarta karticaInfo) {
        this.karticaInfo = karticaInfo;
    }

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void stampaj(){
        System.out.println("Ime i prezime "+imeIPrezime +"broj kartice"+ this.karticaInfo.getBrojKartice() );
    }


    }

