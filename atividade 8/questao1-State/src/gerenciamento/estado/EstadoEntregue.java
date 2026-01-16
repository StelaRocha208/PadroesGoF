package gerenciamento.estado;

import gerenciamento.pedido.Pedido;

//Estado concreto: Pedido Entregue; Estado final do pedido
public class EstadoEntregue implements EstadoPedido {

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido entregue. Obrigado pela sua compra!");
    }
}

