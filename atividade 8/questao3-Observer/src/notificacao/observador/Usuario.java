package notificacao.observador;

/*
 * Classe concreta de Observador.
 * Representa um usuário que recebe notificações do projeto.
 */
public class Usuario implements Observador {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProjeto, String mensagem) {
        System.out.println(
            nome + " recebeu notificação: O projeto '" 
            + nomeProjeto + "' foi atualizado: " + mensagem
        );
    }
}
