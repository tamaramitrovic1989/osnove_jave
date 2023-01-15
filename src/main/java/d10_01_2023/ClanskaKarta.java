package d10_01_2023;

public class ClanskaKarta {


    private double popust;
    private String brojKartice;

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public ClanskaKarta(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
