package factory;

import botao.Botao;
import botao.BotaoWindows;

public class DialogoWindows extends Dialogo {

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}