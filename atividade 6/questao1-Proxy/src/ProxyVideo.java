// Classe Proxy que controla o acesso ao vídeo real
// Verifica se o usuário está autenticado antes de permitir o carregamento
// O vídeo real só é criado SE a permissão for válida, economizando recursos
public class ProxyVideo implements Video {

    private String nomeDoVideo;
    private VideoReal videoReal;
    private boolean autenticado;

    public ProxyVideo(String nomeDoVideo, boolean autenticado) {
        this.nomeDoVideo = nomeDoVideo;
        this.autenticado = autenticado;
    }

    @Override
    public void carregar() {
        if (!autenticado) {
            System.out.println("Acesso negado! Usuário não autenticado. Vídeo NÃO será carregado.");
            return;
        }

        if (videoReal == null) {
            videoReal = new VideoReal(nomeDoVideo);
        } else {
            videoReal.carregar();
        }
    }

    @Override
    public void exibir() {
        if (!autenticado) {
            System.out.println("Acesso negado! Você não tem permissão para assistir este vídeo.");
            return;
        }

        carregar(); // garante que carregou antes de exibir
        videoReal.exibir();
    }
}
