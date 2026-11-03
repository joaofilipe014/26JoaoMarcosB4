package Factory_Method;

public class FactorySMS extends Notificador {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
