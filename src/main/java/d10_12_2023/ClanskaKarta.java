package d10_12_2023;

public class ClanskaKarta {


    private double popust;
    private int brojKartice;

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public ClanskaKarta(double popust, int brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
