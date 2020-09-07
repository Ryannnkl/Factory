package princpal;

import factory.Dialogo;
import factory.DialogoHTML;
import factory.DialogoWindows;


public class Principal {
    private static Dialogo dialogo;

    public static void main(String[] args) {
        configurar();
        rodarLogicaFinal();
    }
    
    static void configurar() {
       
        if (System.getProperty("os.name").contains("Windows")) {
            dialogo = new DialogoWindows();
        } else {
            dialogo = new DialogoHTML();
        }
    }
    
    static void rodarLogicaFinal() {
        dialogo.renderizarJanela();
    }
}