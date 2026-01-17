package pagamento.pagamento;


public class PagamentoCartaoCredito extends Pagamento {

    @Override
    protected void validar() {
        System.out.println("Validando informações do cartão de crédito.");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito.");
    }
}

