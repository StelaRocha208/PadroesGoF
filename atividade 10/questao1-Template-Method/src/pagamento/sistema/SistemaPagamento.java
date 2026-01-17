package pagamento.sistema;

import pagamento.pagamento.Pagamento;
import pagamento.pagamento.PagamentoCartaoCredito;
import pagamento.pagamento.PagamentoPaypal;


//Classe de teste 
public class SistemaPagamento {

    public static void main(String[] args) {

        System.out.println("Processando pagamento com cartão de crédito:");
        Pagamento pagamentoCartao = new PagamentoCartaoCredito();
        pagamentoCartao.realizarPagamento();

        System.out.println();

        System.out.println("Processando pagamento via PayPal:");
        Pagamento pagamentoPaypal = new PagamentoPaypal();
        pagamentoPaypal.realizarPagamento();
    }
}
