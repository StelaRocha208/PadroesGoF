package pagamento.pagamento;


public class PagamentoPaypal extends Pagamento {

    @Override
    protected void validar() {
        System.out.println("Validando informações do PayPal.");
    }

    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento via PayPal.");
    }
}
