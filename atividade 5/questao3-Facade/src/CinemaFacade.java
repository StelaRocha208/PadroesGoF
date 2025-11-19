public class CinemaFacade {

    private LoginSistema loginSistema;
    private PagamentoSistema pagamentoSistema;
    private ReprodutorVideo reprodutorVideo;

    public CinemaFacade() {
        this.loginSistema = new LoginSistema();
        this.pagamentoSistema = new PagamentoSistema();
        this.reprodutorVideo = new ReprodutorVideo();
    }

    public void assistirFilme(String usuario, String senha, String filme, double preco) {
        System.out.println("\n=== Acesso ao Sistema de Cinema Online ===");

        if (!loginSistema.fazerLogin(usuario, senha)) {
            System.out.println("Acesso negado. Não foi possível assistir ao filme.");
            return;
        }

        if (!pagamentoSistema.processarPagamento(usuario, preco)) {
            System.out.println("Pagamento não aprovado. Não é possível reproduzir o filme.");
            return;
        }

        reprodutorVideo.reproduzirFilme(filme);
    }
}

