package gerenciamento.estado;

import gerenciamento.pedido.Pedido;

//Estado concreto: Pedido em Processamento
public class EstadoProcessando implements EstadoPedido {

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido está em processamento. Preparando para envio...");
        pedido.setEstado(new EstadoEnviado());
    }
}
