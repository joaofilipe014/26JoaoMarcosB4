package observer;

import java.util.*;

public class Canal implements Observaveis{
    private String nome;
    private List<Observadores> observador = new ArrayList<>();

    public Canal(String nome){
        this.nome = nome;
    }

    @Override
    public void adicionarObservadores(Observadores obs) {

    }

    @Override
    public void removerObservadores(Observadores obs) {
                
    }

    @Override
    public void notificarObservadores(String msg) {
            for(Observadores obs : observador){
                obs.enviarEmail(msg);
            }

    }

    public void publicarVideo(String titulo){
        String msg = "O Canal" + nome + " publicou o video: " + titulo;
    }
}
