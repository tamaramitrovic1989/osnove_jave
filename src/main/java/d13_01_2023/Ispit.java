package d13_01_2023;

public class Ispit {

    private String nazivIspita;

    private int ocena;
    private String imeIPrezimeProfesora;

    public Ispit(String nazivIspita, int ocena, String imeIPrezimeProfesora) {
        this.nazivIspita = nazivIspita;
        this.ocena = ocena;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public String getNazivIspita() {
        return nazivIspita;
    }

    public void setNazivIspita(String nazivIspita) {
        this.nazivIspita = nazivIspita;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public boolean polozen() {

        if (this.ocena >= 6 && this.ocena <= 10) {
            return true;
        } else {
            return false;
        }
    }
public void stampaj(){
    System.out.println(this.nazivIspita +" "+ this.imeIPrezimeProfesora+ " "+ ocena);

    }




}


