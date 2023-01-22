package d_19_01_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa() {
        ambalaze = new ArrayList<>();
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    public void dodajAmbalazu(Ambalaza ambalaza1) {
        this.ambalaze.add(ambalaza1);
    }
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

    public void izbaciAmbalazu(String barKod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarKod().equals(barKod)) ;
            {
            }
            this.ambalaze.remove(i);
        }
    }

    //    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
    private double ukupnaCenaSPopustom(double popust) {
        double suma = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma = +this.ambalaze.get(i).cenaArtikla();

        }
        return suma * popust;

    }
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije
////        se prima Super karticu iz koje se cita popust.

    public double ukupnaCenaKorpe(SuperKartica kartica) {
        double suma = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma +=this.ambalaze.get(i).cenaArtikla();

        }
        return suma - kartica.getPopust();
    }
}