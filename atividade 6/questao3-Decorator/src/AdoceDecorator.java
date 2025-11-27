// Adiciona açúcar à bebida
public class AdoceDecorator extends BebidaDecorator {

    public AdoceDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Açúcar";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.50;
    }
}
