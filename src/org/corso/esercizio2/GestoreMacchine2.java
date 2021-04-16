package org.corso.esercizio2;

import java.util.*;

public class GestoreMacchine2 {

    private List<Macchina> lista;

    public GestoreMacchine2() {
        this.lista = new ArrayList<>();
    }

    public void init() {
        // creo le macchine
        Macchina macchina1 = new Macchina("Panda", 2005, new Motore(500));
        Macchina macchina2 = new Macchina("Punto", 2001, new Motore(1400));
        Macchina macchina3 = new Macchina("Corsa", 2005, new Motore(500));
        Macchina macchina4 = new Macchina("Passat", 2001, new Motore(1400));
        Macchina macchina5 = new Macchina("Tigra", 2005, new Motore(500));

        // popolo la lista
        lista.add(macchina1);
        lista.add(macchina2);
        lista.add(macchina3);
        lista.add(macchina4);
        lista.add(macchina5);
    }

    // metodo che rimuove le macchine con cilindrata 500
    public void remove500CC() {
        Iterator<Macchina> iteratore = lista.iterator();
        while (iteratore.hasNext()) {
            Macchina item = iteratore.next();
            if (item.getMotore().getCilindrata() == 500)
                iteratore.remove();
        }

    }

    public String toString() {
        String stringa = new String();
        for (Macchina item : lista)
            stringa += ("Modello: " + item.getModello() + "  Anno: " + item.getAnno() + "  Cilindrata: "
                    + item.getMotore().getCilindrata() + "\n");
        return stringa;
    }

}