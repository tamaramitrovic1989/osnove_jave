package d12_01_2023;

public class ZeleniKarton {

    private String imeIPrezimeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String getImeIPrezimeProfesora;
    private int ocena;


    public ZeleniKarton(String imeIPrezimeStudenta, int brojIndeksa, String nazivPredmeta, String getImeIPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.getImeIPrezimeProfesora = getImeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getGetImeIPrezimeProfesora() {
        return getImeIPrezimeProfesora;
    }

    public void setGetImeIPrezimeProfesora(String getImeIPrezimeProfesora) {
        this.getImeIPrezimeProfesora = getImeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean jePolozio(int ocena) {
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }

    }

            public void stampaj () {
                System.out.print( this.nazivPredmeta  );
                if (this.jePolozio(this.ocena)) {
                    System.out.println( this.ocena );
                    System.out.println("Student: " + this.imeIPrezimeStudenta + " "+this.brojIndeksa);
                    System.out.println("Profesor: " + this.getImeIPrezimeProfesora );
                    System.out.println();

                } else {

                    System.out.println("Nije polozio ispit.");
                }





        }


    }



