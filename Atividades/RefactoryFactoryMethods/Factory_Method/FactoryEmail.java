package Factory_Method;

public class FactoryEmail extends Notificador {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
