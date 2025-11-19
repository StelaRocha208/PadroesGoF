public class PagamentoInterno implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento interno processado: R$ " + valor);
    }
}
