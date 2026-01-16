package gerenciamento.estado;

import gerenciamento.pedido.Pedido;

//Estado concreto: Pedido Enviado
public class EstadoEnviado implements EstadoPedido {

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido enviado. Aguardando entrega...");
        pedido.setEstado(new EstadoEntregue());
    }
}
