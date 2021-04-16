package org.corso.esercizio1;

import java.util.*;

public class GestoreMacchine {

    private List<Macchina> lista;

    public GestoreMacchine() {
        this.lista = new ArrayList<>();
    }

    public void init() {
        // creo le macchine
        Macchina macchina1 = new Macchina("Panda", 2005);
        Macchina macchina2 = new Macchina("Punto", 2001);
        Macchina macchina3 = new Macchina("Corsa", 2005);
        Macchina macchina4 = new Macchina("Passat", 2001);
        Macchina macchina5 = new Macchina("Tigra", 2005);

        // popolo l'array
        lista.add(macchina1);
        lista.add(macchina2);
        lista.add(macchina3);
        lista.add(macchina4);
        lista.add(macchina5);
    }

    // metodo che rimuove le macchine dell' annata 2001
    public void removeYear2001() {
        Iterator<Macchina> iteratore = lista.iterator();
        while (iteratore.hasNext()) {
            Macchina item = iteratore.next();
            if (item.getAnno() == 2001)
                iteratore.remove();
        }

    }

    public String toString() {
        String stringa = new String();
        for (Macchina item : lista)
            stringa += ("Modello: " + item.getModello() + "  Anno: " + item.getAnno() + "\n");
        return stringa;
    }

}