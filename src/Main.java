import org.corso.esercizio1.*;
import org.corso.esercizio2.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("ESERCIZIO 1 \n");
        GestoreMacchine1 gestoreMacchine1 = new GestoreMacchine1();
        gestoreMacchine1.init();

        // stampo la lista completa
        System.out.println(gestoreMacchine1.toString());

        // rimuovo le macchine del 2001
        gestoreMacchine1.removeYear2001();

        // stampo la lista modificata
        System.out.println("");
        System.out.println("");
        System.out.println(gestoreMacchine1.toString());


        
        System.out.println("ESERCIZIO 2 \n");
        GestoreMacchine2 gestoreMacchine2 = new GestoreMacchine2();
        gestoreMacchine2.init();
        
        //stampo la lista completa
        System.out.println(gestoreMacchine2.toString());

        //rimuovo le macchine con cilindrata 500
        gestoreMacchine2.remove500CC();;

        //stampo la lista modificata
        System.out.println("");
        System.out.println("");
        System.out.println(gestoreMacchine2.toString());

    }
}
