package decorator;

public class Leite extends BebidaDecorator{
    // chamando objetos da classe pai
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override 
    public double getPreco() {
        return bebida.getPreco() + 1.00;
    }

    @Override
    public String getDescricao() {
        
        return bebida.getDescricao() + " Adicional de Leite";
    }

}
