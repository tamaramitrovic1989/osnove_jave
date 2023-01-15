package d12_01_2023;

public class Transakcija {

    private  int idTransakcije;
    private  Racun posiljalac;
    private  Racun primalac;


    public Transakcija(int idTransakcije, Racun posiljalac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
////        ako je prenos sredstava manji od 4500, provizija je fiksna 45
////        ako je prenos sredstava veci od 4500, provizija je 1%
////        S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima
////        parametar koji predstavlja visinu transakcije

    public double racunajProviziju(double iznosTransakcije){
        double provizija=0;
        if (iznosTransakcije<4500){
           return   provizija=45;
        }
        if  (iznosTransakcije>4500){
         return     provizija=iznosTransakcije*0.01;
        }

        return 0;
    }
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao
////        parametar funkcije se unosi vrednost koja se prebacuje.
////        Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a
////        na drugi racun dodaje samo (trazena suma).

public void izvrsiTransakciju(double vrednostTrans ){

    double sumaSlanje = vrednostTrans + racunajProviziju(vrednostTrans);
    double sumaPrimanje = vrednostTrans;


    if(this.posiljalac.getStanjeNaRacunu() > sumaSlanje){

        this.posiljalac.menjajStanje(-sumaSlanje);
        this.primalac.menjajStanje(sumaPrimanje);

    } else{
        System.out.println("Greska! nemate dovoljno sredstava na racuna");

    }
}
//    metodu koja stampa podatke o transakciji u formatu:
////        id transkacije
////        Racun sa: Ime i prezime  -  broj racuna
////        Racun na: Ime i prezime  -  broj racuna


        public void stampaj(){
            System.out.println(this.idTransakcije);
            System.out.println("racun sa: "+posiljalac.getImeiPrezime()+"-"+ posiljalac.getBrojRacuna());
            System.out.println("racun na: "+primalac.getImeiPrezime()+"-"+ primalac.getBrojRacuna());
}

}
