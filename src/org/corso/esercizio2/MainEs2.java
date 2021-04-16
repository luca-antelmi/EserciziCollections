package org.corso.esercizio2;

public class MainEs2 {
    public static void main(String[] args) throws Exception {

        GestoreMacchine gestoreMacchine = new GestoreMacchine();
        gestoreMacchine.init();
        
        //stampo la lista completa
        System.out.println(gestoreMacchine.toString());

        //rimuovo le macchine con cilindrata 500
        gestoreMacchine.remove500CC();;

        //stampo la lista modificata
        System.out.println("");
        System.out.println("");
        System.out.println(gestoreMacchine.toString());


    }
}