package observer;

public interface Observaveis {

    void adicionarObservadores(Observadores obs);
    void removerObservadores(Observadores obs);
    void notificarObservadores(String msg);
    

}
