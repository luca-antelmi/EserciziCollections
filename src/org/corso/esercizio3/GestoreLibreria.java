package org.corso.esercizio3;

import java.util.*;

import java.util.HashSet;

public class GestoreLibreria {

    private Libreria libreria;

    public GestoreLibreria() {
        this.libreria = new Libreria();

    }

    public void init() {

        // creo 5 libri
        Libro libro1 = new Libro("Titolo a", "avventura");
        Libro libro2 = new Libro("Titolo b", "avventura");
        Libro libro3 = new Libro("Titolo c", "romantico");
        Libro libro4 = new Libro("Titolo d", "storico");
        Libro libro5 = new Libro("Titolo e", "storico");

        // popolo la mappa

        libreria.getArchivio().put("avventura", new HashSet<Libro>());
        libreria.getArchivio().put("romantico", new HashSet<Libro>());
        libreria.getArchivio().put("storico", new HashSet<Libro>());

        libreria.getArchivio().get("avventura").add(libro1);
        libreria.getArchivio().get("avventura").add(libro2);
        libreria.getArchivio().get("romantico").add(libro3);
        libreria.getArchivio().get("storico").add(libro4);
        libreria.getArchivio().get("storico").add(libro5);

    }

    public void print() {
        Set<Libro> temp = libreria.getArchivio().get("avventura");
        for (Libro item : temp)
            System.out.println(item.getGenere() + " " + item.getTitolo() + "\n");
        temp = libreria.getArchivio().get("romantico");
        for (Libro item : temp)
            System.out.println(item.getGenere() + " " + item.getTitolo() + "\n");
        temp = libreria.getArchivio().get("storico");
        for (Libro item : temp)
            System.out.println(item.getGenere() + " " + item.getTitolo() + "\n");

    }

}
