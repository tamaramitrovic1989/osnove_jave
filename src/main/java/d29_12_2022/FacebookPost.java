package d29_12_2022;

import org.w3c.dom.ls.LSOutput;

public class FacebookPost {

    private String imeIPrezimeKorisnikaKojiJeObjavioPost;
    private String ImeIPrezimeKorisnikaNaCijemProfiluJePost;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezimeKorisnikaKojiJeObjavioPost() {
        return this.imeIPrezimeKorisnikaKojiJeObjavioPost;
    }

    public String getImeIPrezimeKorisnikaNaCijemProfiluJePost() {
        return this.ImeIPrezimeKorisnikaNaCijemProfiluJePost;
    }

    public String getTekstObjave() {

        return this.tekstObjave;
    }

    public int getBrojLajkova() {

        return this.brojLajkova;
    }

    public int getBrojDeljenja() {

        return this.brojDeljenja;
    }

    public void setImeIPrezimeKorisnikaKojiJeObjavioPost(String imeIPrezimeKorisnikaKojiJeObjavioPost) {
        this.imeIPrezimeKorisnikaKojiJeObjavioPost = imeIPrezimeKorisnikaKojiJeObjavioPost;
    }

    public void setImeIPrezimeKorisnikaNaCijemProfiluJePost(String imeIPrezimeKorisnikaNaCijemProfiluJePost) {
        this.ImeIPrezimeKorisnikaNaCijemProfiluJePost = imeIPrezimeKorisnikaNaCijemProfiluJePost;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public void like() {
        this.brojLajkova = this.brojLajkova + 1;

    }

    public void dislike() {
        this.brojLajkova = this.brojLajkova - 1;
        if (this.brojLajkova < 1) {
            this.brojLajkova = 0;
        }
    }

    public void share() {
        this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println( this.imeIPrezimeKorisnikaKojiJeObjavioPost
                + ">>>>" +  this.ImeIPrezimeKorisnikaNaCijemProfiluJePost);
        System.out.print("Likes " + this.brojLajkova + "  |  " + "Shares " + brojDeljenja);


    }


}