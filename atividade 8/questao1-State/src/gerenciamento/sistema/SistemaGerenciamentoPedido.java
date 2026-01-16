package gerenciamento.sistema;

import gerenciamento.pedido.Pedido;

//Classe de teste do sistema. Simula o processamento de um pedido.
public class SistemaGerenciamentoPedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.processar(); // Recebido -> Processando
        pedido.processar(); // Processando -> Enviado
        pedido.processar(); // Enviado -> Entregue
        pedido.processar(); // Entregue
    }
}

