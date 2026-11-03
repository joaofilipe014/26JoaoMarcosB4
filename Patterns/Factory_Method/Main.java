package Factory_Method;

public class Main {
    public static void main(String[] args) {
        executar(new FactoryEmail());
        executar(new FactorySMS());
    }

    private static void executar(Notificador notificador) {
        notificador.notificar();
    }
}
