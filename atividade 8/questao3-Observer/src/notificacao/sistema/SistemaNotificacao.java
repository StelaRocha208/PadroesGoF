package notificacao.sistema;

import notificacao.observador.Usuario;
import notificacao.sujeito.Projeto;

/*
 * Classe de teste do sistema de notificações.
 * Simula a atualização de um projeto e o envio de notificações.
 */
public class SistemaNotificacao {

    public static void main(String[] args) {

        Projeto projeto = new Projeto("Desenvolvimento de Software");

        Usuario alice = new Usuario("Ana");
        Usuario bob = new Usuario("Marcos");

        projeto.adicionarObservador(ana);
        projeto.adicionarObservador(marcos);

        projeto.atualizarProjeto("Adicionadas novas funcionalidades ao sistema.");

        projeto.removerObservador(ana);

        projeto.atualizarProjeto("Correção de bugs realizados.");
    }
}
