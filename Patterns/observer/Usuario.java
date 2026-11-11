package observer;

public class Usuario implements Observadores {
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }
    
    @Override
    public void enviarEmail(String msg) {
        System.out.println(nome + " Você recebeu notificação: " + msg);
    }
}
