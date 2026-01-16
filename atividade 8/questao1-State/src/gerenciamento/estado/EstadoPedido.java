package gerenciamento.estado;

import gerenciamento.pedido.Pedido;

/*
 * Interface do padrão State
 * Define o comportamento comum que todos os estados do pedido devem ter
 */
public interface EstadoPedido {
    void processar(Pedido pedido);
}

