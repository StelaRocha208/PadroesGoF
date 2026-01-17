package pagamento.pagamento;


//Classe abstrata que define o Template Method.

public abstract class Pagamento {

   
    public final void realizarPagamento() {
        validar();
        processarPagamento();
        enviarConfirmacao();
    }

    protected abstract void validar();

    protected abstract void processarPagamento();

    protected void enviarConfirmacao() {
        System.out.println("Confirmação de pagamento enviada.");
    }
}
