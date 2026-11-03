package Factory_Method;

public abstract class Notificador {
    protected abstract IntNotificacoes criarNotificacao();

    public void notificar() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
