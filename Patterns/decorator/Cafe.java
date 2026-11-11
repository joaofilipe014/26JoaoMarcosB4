package decorator;

public class Cafe implements Bebida {
    
    @Override 
    public double getPreco(){
        return 2.5;
    }

    @Override 
    public String getDescricao(){
        return "Café";
    }
}
