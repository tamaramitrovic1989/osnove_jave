package d_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {

    private int kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija, boolean
            placaSeKaucija, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(int kaucija, boolean placaSeKaucija, double osnovnaCena) {
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //        ako se ne placa, (osnovna cena) * 1.2
    @Override
    public double cenaArtikla() {
        if (placaSeKaucija) {
            return this.osnovnaCena * 1.2 + kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Bar kod: " +getBarKod()+", " +
                ""+"naziv artikla: " + this.nazivArtikla);
        if (placaSeKaucija) {
            System.out.println("placa se kaucija: " + this.kaucija);
            System.out.println("Cena je: " + this.cenaArtikla() + "dinara");
            System.out.println();

        }
    }
    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
