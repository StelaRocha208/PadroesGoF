// Aqui é onde ocorre o carregamento pesado do vídeo
public class VideoReal implements Video {

    private String nomeDoVideo;

    public VideoReal(String nomeDoVideo) {
        this.nomeDoVideo = nomeDoVideo;
        carregarDoServidor();
    }

    private void carregarDoServidor() {
        System.out.println("Carregando vídeo do servidor: " + nomeDoVideo + " ... (operação custosa)");
    }

    @Override
    public void carregar() {
        System.out.println("Vídeo já carregado: " + nomeDoVideo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo vídeo: " + nomeDoVideo);
    }
}
