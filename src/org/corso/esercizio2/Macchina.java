package org.corso.esercizio2;

public class Macchina {

    private String modello;
    private int anno;
    private Motore motore;

    public Macchina(String modello, int anno, Motore motore) {
        this.modello = modello;
        this.anno = anno;
        this.motore = motore;
    }

    public int getAnno() {
        return this.anno;
    }

    public String getModello() {
        return this.modello;
    }

    public Motore getMotore() {
        return this.motore;
    }
}