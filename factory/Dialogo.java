package factory;

import botao.Botao;

/**
 * Classe base do Factory, Observe que "Factory" é apenas uma função para a classe
 * Deve ter uma regra de negocio central para criação de produtos diferentes
 */

public abstract class Dialogo {

    public void renderizarJanela() {

        Botao okBotao = criarBotao();
        okBotao.criar();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Botao criarBotao();
}