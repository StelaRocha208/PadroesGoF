package notificacao.observador;

/*
 * Interface Observer do padrão Observer.
 * Define o método que os observadores devem implementar
 * para receber notificações.
 */
public interface Observador {

    void atualizar(String nomeProjeto, String mensagem);
}
