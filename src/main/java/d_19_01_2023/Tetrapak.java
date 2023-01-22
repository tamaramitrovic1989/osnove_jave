package d_19_01_2023;

public class Tetrapak extends Ambalaza {

    private boolean recikliraSe;
    private double osnovnaCena;

    public Tetrapak(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, boolean recikliraSe, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean recikliraSe, double osnovnaCena) {
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }



    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }


    @Override
    public void stampaj() {
        System.out.println("Bar kod: " + getBarKod() + ", "+"naziv artikla: "
                + getNazivArtikla());
        System.out.println("osnovna cena: " + osnovnaCena);
        if (recikliraSe) {
            System.out.println("ova ambalaza se reciklira");
            System.out.println();

        }
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
    }
    public  double cenaArtikla() {
        double cenaArtikla = 0;
        if (recikliraSe) {
           return cenaArtikla = tezinaPakovanja() * 1.5 + osnovnaCena;

        } else{
                return osnovnaCena;

            }
        }


}


