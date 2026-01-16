package gerenciamento.pedido;

import gerenciamento.estado.EstadoPedido;
import gerenciamento.estado.EstadoRecebido;

//Classe Contexto do padrão State
public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new EstadoRecebido(); // Estado inicial
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void processar() {
        estado.processar(this);
    }
}
