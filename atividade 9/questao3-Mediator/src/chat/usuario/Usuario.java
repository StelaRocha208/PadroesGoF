package chat.usuario;

import chat.mediator.Mediator;


public class Usuario {

    private String nome;
    private Mediator mediator;

    public Usuario(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public String getNome() {
        return nome;
    }

    public void enviarMensagem(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
