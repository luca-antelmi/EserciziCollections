package org.corso.esercizio3;

import java.util.*;

public class Libreria {

    private Map<String, Set<Libro>> archivio;
    

    public Libreria() {
        this.archivio = new HashMap<>();
    }

    public Map<String, Set<Libro>> getArchivio(){
        return this.archivio;
    }
}
