package atendimento;


public class Solicitacao {
    private String tipo;
    private String mensagem;

    public Solicitacao(String tipo, String mensagem) {
        this.tipo = tipo;
        this.mensagem = mensagem;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
