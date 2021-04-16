package org.corso.esercizio1;

public class Macchina {

    private String modello;
    private int anno;

    public Macchina(String modello, int anno) {
        this.modello = modello;
        this.anno = anno;
    }

    public int getAnno() {
        return this.anno;
    }

    public String getModello() {
        return this.modello;
    }
}