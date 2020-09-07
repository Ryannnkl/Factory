package factory;

import botao.Botao;
import botao.BotaoHTML;

public class DialogoHTML extends Dialogo {

    @Override
    public Botao criarBotao() {
        return new BotaoHTML();
    }
}
