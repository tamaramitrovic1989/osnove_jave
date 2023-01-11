package d10_12_2023;

public class Knjiga {

    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private String autor;
    private Autor podaciAutora;


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Autor getPodaciAutora() {
        return podaciAutora;
    }

    public void setPodaciAutora(Autor podaciAutora) {
        this.podaciAutora = podaciAutora;
    }

    public Knjiga(int isbn, String naziv, int godinaIzdanja, String autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public void print (){
        System.out.println( isbn);
        System.out.println(naziv+godinaIzdanja);
        System.out.println("Autor: " + this.podaciAutora.getIme()+this.podaciAutora.getPrezime());

    }

}
