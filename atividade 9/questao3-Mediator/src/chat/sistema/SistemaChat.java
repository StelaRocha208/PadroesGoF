package chat.sistema;

import chat.mediator.ChatMediator;
import chat.usuario.Usuario;


//Classe de teste do sistema de chat

public class SistemaChat {

    public static void main(String[] args) {

        ChatMediator chat = new ChatMediator();

        Usuario clara = new Usuario("Clara", chat);
        Usuario lucas = new Usuario("Lucas", chat);
        Usuario maria = new Usuario("Maria", chat);

        chat.adicionarUsuario(clara);
        chat.adicionarUsuario(lucas);
        chat.adicionarUsuario(maria);

        clara.enviarMensagem("Olá, pessoal!");
        lucas.enviarMensagem("Oi, Clara!");
        maria.enviarMensagem("Bom dia a todos!");
    }
}

