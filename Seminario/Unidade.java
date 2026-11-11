package Seminario;

public class Unidade extends Thread {
    private final Espaco espaco;

    public Unidade(String nome, Espaco espaco) {
        super(nome);
        this.espaco = espaco;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int pedido = espaco.fila.take();

                if (pedido == -1) break;

                System.out.println(getName()
                        + " processando pedido " + pedido);

                espaco.status.put(pedido, "PROCESSANDO");

                Thread.sleep(1000);

                espaco.status.put(pedido, "FINALIZADO");

                System.out.println(getName()
                        + " finalizou pedido " + pedido);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}