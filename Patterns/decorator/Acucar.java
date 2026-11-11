package decorator;

public class Acucar extends BebidaDecorator{
    
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override 
    public double getPreco() {
        return bebida.getPreco() + 0.50;
    }

    @Override
    public String getDescricao() {
        
        return bebida.getDescricao() + " Adicional de açucar";
    }
}