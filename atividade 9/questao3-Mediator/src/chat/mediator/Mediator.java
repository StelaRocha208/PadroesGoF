package chat.mediator;

import chat.usuario.Usuario;


//Interface Mediator
public interface Mediator {

    void enviarMensagem(String mensagem, Usuario remetente);

    void adicionarUsuario(Usuario usuario);
}
