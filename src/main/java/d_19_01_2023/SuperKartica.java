package d_19_01_2023;

public class SuperKartica {

    private String brojKartice;
    private String ImeIprezimeVlasnika;
    private int popust;

    public SuperKartica(String brojKartice, String imeIprezimeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.ImeIprezimeVlasnika = imeIprezimeVlasnika;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezimeVlasnika() {
        return ImeIprezimeVlasnika;
    }

    public void setImeIprezimeVlasnika(String imeIprezimeVlasnika) {
        ImeIprezimeVlasnika = imeIprezimeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampajKarticu(){
        System.out.println("Broj kartice: "+this.brojKartice+", "+"Ime i prezime vlasnika: "+this.ImeIprezimeVlasnika );

    }
}
