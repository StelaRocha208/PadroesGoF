public class SistemaPagamento {

    public static void main(String[] args) {

        Pagamento pagamentoInterno = new PagamentoInterno();
        pagamentoInterno.processarPagamento(100.0);

        Pagamento paypal = new PayPalAdapter(new PayPalAPI());
        paypal.processarPagamento(250.0);

        Pagamento stripe = new StripeAdapter(new StripeAPI());
        stripe.processarPagamento(350.0);
    }
}

