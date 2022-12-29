package d27_12_2022;

public class Proizvod {

    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvodaUGramima;
    public void stampaj() {
        System.out.print(this.nazivProizvoda + " , "+this.cenaProizvoda + " , " + this.tezinaProizvodaUGramima);

    }

    public double  konvertuj(String jedinicaZaKonverziju) {

        if (jedinicaZaKonverziju.equals("kg" )) {
          return (this.tezinaProizvodaUGramima / 1000);
        }
        else if(jedinicaZaKonverziju.equals("t")){
return (this.tezinaProizvodaUGramima/10000);}
return 0;
    }
}