package chat.mediator;

import java.util.ArrayList;
import java.util.List;

import chat.usuario.Usuario;


public class ChatMediator implements Mediator {

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {

        System.out.println(remetente.getNome() + " enviou: " + mensagem);

        for (Usuario usuario : usuarios) {
            if (usuario != remetente) {
                usuario.receberMensagem(mensagem);
            }
        }
    }
}
