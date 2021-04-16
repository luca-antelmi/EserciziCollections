package org.corso.esercizio1;

public class MainEs1 {
    public static void main(String[] args) throws Exception {

        GestoreMacchine gestoreMacchine = new GestoreMacchine();
        gestoreMacchine.init();
        
        //stampo la lista completa
        System.out.println(gestoreMacchine.toString());

        //rimuovo le macchine del 2001
        gestoreMacchine.removeYear2001();

        //stampo la lista modificata
        System.out.println("");
        System.out.println("");
        System.out.println(gestoreMacchine.toString());


    }
}