// Adiciona sabor extra 
public class SaborDecorator extends BebidaDecorator {

    private String sabor;

    public SaborDecorator(Bebida bebida, String sabor) {
        super(bebida);
        this.sabor = sabor;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Sabor " + sabor;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }
}
