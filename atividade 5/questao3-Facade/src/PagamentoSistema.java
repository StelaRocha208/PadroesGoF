public class PagamentoSistema {

    public boolean processarPagamento(String usuario, double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " para " + usuario + "...");

        // Simulação de pagamento aprovado
        System.out.println("Pagamento aprovado.");
        return true;
    }
}

