package d13_01_2023;

import p13_01_2023.Sastojak;

import java.util.ArrayList;

public class Student {

    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;


    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public Student(int brojIndeksa, String imeIPrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

//    metodu dodaj ispit u niz ispita

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);

    }
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

    public double racunajProsek() {
        double suma = 0;
        double brojacPolozenih = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (ispiti.get(i).polozen()) {
                brojacPolozenih++;
                suma = suma + ispiti.get(i).getOcena();
            }
        }
        return suma / brojacPolozenih;

//    metodu stampaj koja stampa u formatu:
////        (broj indeksa) - (ime i prezime) - (tip studija)
////        Predmeti:
////        (naziv predmeta) - (profesor) - (ocena)
////        (naziv predmeta) - (profesor) - (ocena)
////        (naziv predmeta) - (profesor) - (ocena)
////        Prosecna ocena: (prosecna ocena)

    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            System.out.println(ispiti.get(i).getNazivIspita() + " - " + ispiti.get(i).getImeIPrezimeProfesora() + " - " + ispiti.get(i).getOcena());

        }
        System.out.println("Prosecna ocena: "+this.racunajProsek());

    }
}





