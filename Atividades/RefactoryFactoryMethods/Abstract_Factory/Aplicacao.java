package Abstract_Factory;

public class Aplicacao {
    private final Fabrica fabrica;

    public Aplicacao(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar(){
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}