package gerenciamento.estado;

import gerenciamento.pedido.Pedido;

//Representa o estado inicial do pedido
public class EstadoRecebido implements EstadoPedido {

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido recebido. Iniciando processamento...");
        pedido.setEstado(new EstadoProcessando());
    }
}

