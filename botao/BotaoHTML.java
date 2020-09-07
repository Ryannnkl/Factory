/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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