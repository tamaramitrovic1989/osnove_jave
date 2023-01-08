package projekat;

public class XOTabla {


    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeiPrezimeXIgraca;
    private String imeiPrezimeOIgraca;
    private String naPotezu;

    public String getImeiPrezimeXIgraca() {
        return this.imeiPrezimeXIgraca;
    }

    public String tImeiPrezimeOIgraca() {
        return this.imeiPrezimeOIgraca;
    }

    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeiPrezimeXIgraca(String imeiPrezimeXIgraca) {
        this.imeiPrezimeXIgraca = imeiPrezimeXIgraca;
    }

    public void setImeiPrezimeOIgraca(String imeiPrezimeOIgraca) {
        this.imeiPrezimeOIgraca = imeiPrezimeOIgraca;
    }

    public void pokreniIgru() {

        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";

        this.naPotezu = "X";

    }

    public void stampaj() {
        System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 );
        System.out.println(this.polje4 + " | " + this.polje5 + " | " + this.polje6 );
        System.out.println(this.polje7 + " | " + this.polje8 + " | " + this.polje9 );

        System.out.println();
        System.out.println("Igrac X: " + imeiPrezimeXIgraca);
        System.out.println("Igrac O: " + imeiPrezimeOIgraca);
    }

    public boolean poljePrazno(int indexPolja) {

        if (indexPolja == 1) {
            if (this.polje1.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indexPolja == 2) {
            if (this.polje2.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }

        if (indexPolja == 3) {
            if (this.polje3.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }

        if (indexPolja == 4) {
            if (this.polje4.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        if (indexPolja == 5) {
            if (this.polje5.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        if (indexPolja == 6) {
            if (this.polje6.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }

        if (indexPolja == 7) {
            if (this.polje7.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        if (indexPolja == 8) {
            if (this.polje8.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        if (indexPolja == 9) {
            if (this.polje9.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int indexPolja) {
        if (indexPolja == 1) {
            this.polje1 = naPotezu;
        }
        if (indexPolja == 2) {
            this.polje2 = naPotezu;
        }
        if (indexPolja == 3) {
            this.polje3 = naPotezu;
        }
        if (indexPolja == 4) {
            this.polje4 = naPotezu;
        }
        if (indexPolja == 5) {
            this.polje5 = naPotezu;
        }
        if (indexPolja == 6) {
            this.polje6 = naPotezu;

        }
        if (indexPolja == 7) {
            this.polje7 = naPotezu;
        }
        if (indexPolja == 8) {
            this.polje8 = naPotezu;
        }
        if (indexPolja == 9) {
            this.polje9 = naPotezu;
        }
    }
    public boolean popunjenaTabla() {
        if (!this.polje1.equals(" ")&& !this.polje2.equals(" ") && !this.polje3.equals(" ") && !this.polje4.equals(" ")
                && !this.polje5.equals(" ") && !this.polje6.equals(" ") && !this.polje7.equals(" ") && !this.polje8.equals(" ")
                && !this.polje9.equals(" ")) {
            return true;
        } else {
            return false;        }
    }
        public boolean pobednikX () {
            if (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) {
                return true;
            } else if (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) {
                return true;
            } else if (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X")) {
                return true;
            } else if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) {
                return true;
            } else if (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) {
                return true;
            } else if (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) {
                return true;
            } else if (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) {
                return true;
            } else if (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")) {
                return true;
            } else {
                return false;
            }

        }
    public boolean pobednik0 () {
        if (this.polje1.equals("O") && this.polje2.equals("0") && this.polje3.equals("O")) {
            return true;
        } else if (this.polje4.equals("O") && this.polje5.equals("0") && this.polje6.equals("O")) {
            return true;
        } else if (this.polje7.equals("O") && this.polje8.equals("0") && this.polje9.equals("0")) {
            return true;
        } else if (this.polje1.equals("0") && this.polje4.equals("0") && this.polje7.equals("0")) {
            return true;
        } else if (this.polje2.equals("0")&&polje5.equals("0") && this.polje8.equals("0")) {
            return true;
        } else if (this.polje3.equals("0") && this.polje6.equals("O") && this.polje9.equals("O")) {
            return true;
        } else if (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")) {
            return true;
        } else if (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")) {
            return true;
        } else {
            return false;
        }

    }








}



















