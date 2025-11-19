public class PayPalAdapter implements Pagamento {

    private PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processarPagamento(double valor) {
        paypal.pagarComPayPal(valor);
    }
}

