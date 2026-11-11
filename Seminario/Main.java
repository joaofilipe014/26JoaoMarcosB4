package Seminario;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Espaco espaco = new Espaco();
        Unidade unidadeA = new Unidade("Unidade A", espaco);
        Unidade unidadeB = new Unidade("Unidade B", espaco);
        unidadeA.start();
        unidadeB.start();
        // Adiciona 6 pedidos
        for (int i = 1; i <= 6; i++) {
            espaco.status.put(i, "PENDENTE");
            espaco.fila.put(i);
        }
        // Sinais para encerrar as unidades
        espaco.fila.put(-1);
        espaco.fila.put(-1);
        unidadeA.join();
        unidadeB.join();
        System.out.println("\n--- RESULTADO FINAL ---");
        espaco.status.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(p -> System.out.println(
                        "Pedido " + p.getKey() + ": " + p.getValue()
                ));
    }
}