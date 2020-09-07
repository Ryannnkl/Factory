package botao;

/**
 * Botao em HTML
 */

public class BotaoHTML implements Botao {

    public void criar() {
        System.out.println("<button>Teste</button>");
        aoClicar();
    }

    public void aoClicar() {
        System.out.println("Click! Botao diz - 'Ola Mundo!'");
    }
    
}