public class StripeAdapter implements Pagamento {

    private StripeAPI stripe;

    public StripeAdapter(StripeAPI stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processarPagamento(double valor) {
        stripe.fazerPagamentoStripe(valor);
    }
}
