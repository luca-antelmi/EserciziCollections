package org.corso.esercizio3;

public class Libro {

    private String titolo;
    private String genere;

    public Libro(String titolo, String genere) {
        this.titolo = titolo;
        this.genere = genere;
    }

    public int hashCode() {
        return this.titolo.hashCode() + this.genere.hashCode();
    }

    public boolean equals(Object o) {
        Libro libro = (Libro) o;
        return this.titolo.equals(libro.getTitolo()) && this.genere.equals(libro.getGenere());
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getGenere() {
        return this.genere;
    }

}